package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {

   //1. Test for [] brackets
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //2. Test for [LaunchCode] brackets
    @Test
    public void launchcodeInBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    //3. Test for Launch[Code]
    @Test
    public void codeInBrackets () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    //4. Test for []LaunchCode
    @Test
    public void afterBrackets () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    //5. Test for []LaunchCode[]
    @Test
    public void multipleBrackets () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode[]"));
    }

    //6. Test for [LaunchCode
    @Test
    public void singleBracket () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    //7. Test for LaunchCode
    @Test
    public void noBrackets () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    //8. Test for LaunchCode ]
    @Test
    public void singleBracketNoChar () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    //9. Test for [
    @Test
    public void singleOpenBracketNoChar () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    //10. Test for [][
    @Test
    public void threeBrackets () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    // 11. Test for ][
    @Test
    public void reversedBrackets () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    // 12. Test for ]LaunchCode[
    @Test
    public void reversedWithChar () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode["));
    }

    // 13. Empty test
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}