package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdentifierTest{


// Test Method: validateIdentifierWithNullString
@Test 
void validateIdentifierWithNullString() throws Exception {
 Identifier id = new Identifier();
 assertFalse(id.validateIdentifier(null));
}

/*
// Test Method: validateIdentifierWithEmptyString
@Test 
void validateIdentifierWithEmptyString() throws Exception {
 Identifier id = new Identifier();
 assertFalse(id.validateIdentifier(""));
}

 */


// Test Method: validateIdentifierWithInvalidCharacters
@Test 
void validateIdentifierWithInvalidCharacters() throws Exception {
 Identifier id = new Identifier();
 assertFalse(id.validateIdentifier("1234567890"));
}

/*
// Test Method: validateIdentifierWithValidString
@Test 
void validateIdentifierWithValidString() throws Exception {
 Identifier id = new Identifier();
 assertTrue(id.validateIdentifier("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
}


 */

}