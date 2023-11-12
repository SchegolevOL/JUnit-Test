package task3;

public class MyString {

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }

    public static int numberOfVowels(String str) {
        char[] strArr = str.trim().toLowerCase().toCharArray();
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (strArr[i]==vowels[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static int numberOfConsonants(String str) {
        char[] strArr = str.trim().toLowerCase().toCharArray();
        char[] vowels = new char[]{'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
        int count = 0;
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (strArr[i]==vowels[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static int countMatches(String string, String substring){
        int count = 0;
        if (string.isEmpty()||substring.isEmpty()){
            return 0;
        }
        return string.split(substring).length;
    }

}
