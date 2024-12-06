import os
import shutil
from bs4 import BeautifulSoup
import csv
import pandas as pd
from xlsxwriter import Workbook
import traceback


# project folders: BinaryTrees, StackQueue, XOR
ai_results_folder = os.listdir("models")
AI_RESULTS_FOLDER_PATH = "ai_results"

# PATH = "BA_Auswertung_Automation_V2\models\{codegemma_7b}\projetos\{05Ordenacao_test}\target\pit-reports"

# create folder for extracted data
os.makedirs("data_extracted", exist_ok=True)

# create folder for reports
os.makedirs("data", exist_ok=True)
for ai_result in ai_results_folder:

    # create subfolder in data_extracted
    os.makedirs(f"data_extracted/{ai_result}", exist_ok=True)

    # create subfolder for ai in data for csv-reports
    os.makedirs(f"data/{ai_result}", exist_ok=True)


    # get whole directory
    projects = os.listdir(f"models/{ai_result}/projetos")

    for project in projects:
        if project.endswith("_test"):

            # create subfolder for metrics
            destination_folder = f"data_extracted/{ai_result}/{project}"
            os.makedirs(destination_folder, exist_ok=True)

            # create subfolder for reports
            reports_folder = f"data/{ai_result}/{project}"
            os.makedirs(reports_folder, exist_ok=True)

            # get folders from project
            project_path = f"models/{ai_result}/projetos/{project}"
            #print(os.listdir(project_path))
            metrics_path = project_path + "/" + "target"
            #print(metrics_path)
            #os.listdir(metrics_path)

            # source path
            metrics_path = project_path + "/" + "target/" + "pit-reports"
            # copy contents to data folder
            shutil.copytree(metrics_path, destination_folder, dirs_exist_ok=True)

            # --- Create Reports ---
            # find html folder with data after copying
            html_file_path = destination_folder + "/ds/index.html"
            print(html_file_path)
            with open(html_file_path, "r", encoding="utf-8") as html_file:
                soup = BeautifulSoup(html_file, "html.parser")

            # Open CSV file for writing package summary data
            csv_file_name = "package_summary.csv"
            with open(reports_folder + f"/{csv_file_name}", mode="w", newline="") as csv_file:
                writer = csv.writer(csv_file)
                # Extract Package Summary
                package_summary_table = soup.find("h2", text="Package Summary").find_next("table")
                if package_summary_table:
                    writer.writerow(["Package Summary"])  # Header for section
                    headers = [th.text.strip() for th in package_summary_table.find_all("th")]
                    writer.writerow(headers)  # Write column headers

                    for row in package_summary_table.find_all("tr")[1:]:  # Skip the header row
                        cols = []
                        for td in row.find_all("td"):
                            # Extract the percentage value before the <div> or text directly
                            text = td.text.strip().split()[0]  # Split and take the first part (percentage)
                            cols.append(text)
                        writer.writerow(cols)  # Write row data
                    writer.writerow([])  # Add an empty row for spacing

            # open csv file for writing package breakdown data
            with open(reports_folder + f"/package_breakdown.csv", mode="w", newline="") as csv_file:
                writer = csv.writer(csv_file)
                breakdown_table = soup.find("h3", text="Breakdown by Class").find_next("table")
                if breakdown_table:
                    writer.writerow(["Breakdown by Class"])
                    headers = [th.text.strip() for th in breakdown_table.find_all("th")]
                    writer.writerow(headers)
                    for row in breakdown_table.find_all("tr")[1:]:
                        cols = []
                        for td in row.find_all("td"):
                            # Check if there is a <div class="coverage_bar">, which contains the percentage
                            coverage_text = td.text.strip().split()[0]  # Extract the percentage part
                            if "%" in coverage_text:
                                cols.append(coverage_text)  # Append only the percentage value
                            elif td.find("a"):  # If there's a link (for class names)
                                link = td.find("a")["href"]
                                class_name = td.text.strip().split()[0]  # Extract class name
                                cols.append(f"{class_name} ({link})")
                            else:
                                cols.append(td.text.strip())  # Append other data (e.g., class names)
                        writer.writerow(cols)  # Write row data

            # Generate Excel Tables for reports
            csv_files = ["package_breakdown.csv", "package_summary.csv"]
            for csv_file in csv_files:
                excel_file_name = os.path.splitext(csv_file)[0] + ".xlsx"
                df = pd.read_csv(reports_folder + "/" + csv_file)
                df.to_excel(reports_folder + "/" + excel_file_name)




