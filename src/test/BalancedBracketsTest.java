package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    BalancedBrackets bracket_test = new BalancedBrackets();

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    // POSITIVE TESTS

    @Test
    public void testSimpleBrackets() {
        assertTrue(bracket_test.hasBalancedBrackets("[]"));
    }

    @Test
    public void testNoBrackets() {
        assertTrue(bracket_test.hasBalancedBrackets("word"));
    }

    @Test
    public void testSimpleWord() {
        assertTrue(bracket_test.hasBalancedBrackets("[word]"));
    }

    @Test
    public void testNestedBrackets() {
        assertTrue(bracket_test.hasBalancedBrackets("Testing [one [two [three]]]"));
    }

    @Test
    public void testNonNestedBrackets() {
        assertTrue(bracket_test.hasBalancedBrackets("I [will not] go [quietly] into the [night]."));
    }

    // NEGATIVE TESTS

    @Test
    public void testReversedSimpleBrackets() {
        assertFalse(bracket_test.hasBalancedBrackets("]["));
    }

    @Test
    public void testMissingEndBracket() {
        assertFalse(bracket_test.hasBalancedBrackets("[No], this [won't] work.]"));
    }

    @Test
    public void testUnbalancedMultipleBrackets() {
        assertFalse(bracket_test.hasBalancedBrackets("What [if] ] I told [you [a secret]?"));
    }

    @Test
    public void testNothingButBracketsLotsAndLotsOfBrackets() {
        assertFalse(bracket_test.hasBalancedBrackets("[][][][]]][][][][[[][][][[[][][][][["));
    }
}
