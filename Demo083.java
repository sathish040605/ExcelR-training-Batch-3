public class Demo083{
    public static void main(String[] args) {
        String str = "Elepant";
        if (isVowel(str.charAt(0))) {
            System.out.println("The first character is a vowel.");
        } else {
            System.out.println("The first character is not a vowel.");
        }
    }

    public static boolean isVowel(char c) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(c) != -1;
    }
}
