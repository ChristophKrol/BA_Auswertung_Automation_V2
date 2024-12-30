import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdentifierTest{


// Test Method: testValidateIdentifier_NullInput
@Test
void testValidateIdentifier_NullInput() throws Exception {
    Identifier identifier = new Identifier();
    assertFalse(identifier.validateIdentifier(null));
}


// Test Method: testValidateIdentifier_EmptyString
@Test
void testValidateIdentifier_EmptyString() throws Exception {
    Identifier identifier = new Identifier();
    assertFalse(identifier.validateIdentifier(""));
}


// Test Method: testValidateIdentifier_SingleValidLetter
@Test
void testValidateIdentifier_SingleValidLetter() throws Exception {
    Identifier identifier = new Identifier();
    assertTrue(identifier.validateIdentifier("A"));
    assertTrue(identifier.validateIdentifier("z"));
}


// Test Method: testValidateIdentifier_SingleInvalidCharacter
@Test
void testValidateIdentifier_SingleInvalidCharacter() throws Exception {
    Identifier identifier = new Identifier();
    assertFalse(identifier.validateIdentifier("1"));
    assertFalse(identifier.validateIdentifier("@"));
}


// Test Method: testValidateIdentifier_ValidIdentifier
@Test
void testValidateIdentifier_ValidIdentifier() throws Exception {
    Identifier identifier = new Identifier();
    assertTrue(identifier.validateIdentifier("abc1"));
    assertTrue(identifier.validateIdentifier("XyZ2"));
}


// Test Method: testValidateIdentifier_InvalidIdentifier_FirstChar
@Test
void testValidateIdentifier_InvalidIdentifier_FirstChar() throws Exception {
    Identifier identifier = new Identifier();
    assertFalse(identifier.validateIdentifier("1abc"));
    assertFalse(identifier.validateIdentifier("_xyz"));
}


// Test Method: testValidateIdentifier_InvalidIdentifier_TooLong
@Test
void testValidateIdentifier_InvalidIdentifier_TooLong() throws Exception {
    Identifier identifier = new Identifier();
    assertFalse(identifier.validateIdentifier("abcdef")); // too long
}


// Test Method: testValidateIdentifier_ValidBoundaryValues
@Test
void testValidateIdentifier_ValidBoundaryValues() throws Exception {
    Identifier identifier = new Identifier();
    assertTrue(identifier.validateIdentifier("abcde")); // valid
}


// Test Method: testValidateIdentifier_InvalidBoundaryValues
@Test
void testValidateIdentifier_InvalidBoundaryValues() throws Exception {
    Identifier identifier = new Identifier();
    assertFalse(identifier.validateIdentifier("abcdefg")); // invalid, exceeds limit
    assertFalse(identifier.validateIdentifier("")); // empty string
}


// Test Method: testValid_s_ValidCharacters
@Test
void testValid_s_ValidCharacters() throws Exception {
    Identifier identifier = new Identifier();
    assertTrue(identifier.valid_s('A'));
    assertTrue(identifier.valid_s('z'));
}


// Test Method: testValid_s_InvalidCharacters
@Test
void testValid_s_InvalidCharacters() throws Exception {
    Identifier identifier = new Identifier();
    assertFalse(identifier.valid_s('1'));
    assertFalse(identifier.valid_s('@'));
}


// Test Method: testValid_f_ValidCharacters
@Test
void testValid_f_ValidCharacters() throws Exception {
    Identifier identifier = new Identifier();
    assertTrue(identifier.valid_f('A'));
    assertTrue(identifier.valid_f('a'));
    assertTrue(identifier.valid_f('1'));
}


// Test Method: testValid_f_InvalidCharacters
@Test
void testValid_f_InvalidCharacters() throws Exception {
    Identifier identifier = new Identifier();
    assertFalse(identifier.valid_f('@'));
    assertFalse(identifier.valid_f('$'));
}


}