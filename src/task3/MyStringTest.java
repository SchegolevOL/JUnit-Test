package task3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static task3.MyString.*;

public class MyStringTest {
String string;
String substring;
    @Before
    public void setUp() throws Exception {
        string = "aaakkkaaa";
        substring="aaa";
    }

    @Test
    public void isPalindromeResultTrue() {
        System.out.println(isPalindrome(string));
        Assert.assertEquals(true, isPalindrome(string));
    }

    @Test
    public void numberOfVowelsResult4() {
        System.out.println(numberOfVowels(string));
        Assert.assertEquals(6, numberOfVowels(string));
    }

    @Test
    public void numberOfConsonantsResult3() {
        System.out.println(numberOfConsonants(string));
        Assert.assertEquals(3, numberOfConsonants(string));
    }

    @Test
    public void countMatchesResult2() {
        System.out.println(countMatches(string, substring));
        Assert.assertEquals(2, countMatches(string,substring));
    }
}