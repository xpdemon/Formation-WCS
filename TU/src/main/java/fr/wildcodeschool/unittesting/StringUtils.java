package fr.wildcodeschool.unittesting;

public class StringUtils {

    private static final String ALL_VOWELS = "aeiouAEIOU";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * @return Chaine avec uniquement des voyelles
     */
    public static String vowels(String candidate) {
        String vowels = "";

        if (candidate == null) {
            return vowels = "Null parameters";
        }
        else {
            char[] letters = candidate.toCharArray();

            for (int i = 0; i < candidate.length(); i++) {

                if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                    vowels += letters[i];
                }
            }

            return vowels;
        }
    }


    public static String unicVowels(String expression) {
        String vowels = "";
        if (expression == null){
            return vowels = "NULL PARAMETER";
        }
        else{
            char[] lettersArray=expression.toCharArray();

            for(int i = 0; i < expression.length();i++){

                if (ALL_VOWELS.indexOf(lettersArray[i])>=0){
                    vowels+=lettersArray[i];
                }
            }
            return vowels;
        }

    }
}
