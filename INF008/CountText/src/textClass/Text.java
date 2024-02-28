package textClass;

import java.util.regex.Pattern;

public class Text {
    private String text;
    // private int consonant;
    // private int vowel;
    // private int digit;
    // private int other;

    public Text(String text){
        this.text = text;
    }

    public int countConsonants(){
        int consonants = 0;
        
        Pattern REGEX = Pattern.compile("[b-z&&[^aeiou]]");

        for(int i=0; i < text.length(); i++){
            String c = Character.toString(text.charAt(i)).toLowerCase();

            if(REGEX.matcher(c).find()){
                consonants++;
            }
        }
        return consonants;
    }

    public int countNumbers(){
        int numbers = 0;

        for(int i=0; i < text.length(); i++){
            if(Character.isDigit(text.charAt(i))){
                numbers++;
            }
        }

        return numbers;
    }

    public int countVowels(){
        int vowels = 0;
        
        Pattern REGEX = Pattern.compile("[aeiou]");

        for(int i=0; i < text.length(); i++){
            String c = Character.toString(text.charAt(i)).toLowerCase();

            if(REGEX.matcher(c).find()){
                vowels++;
            }
        }

        return vowels;
    }

    public int countOthers(){
        int others = 0;
        
        Pattern REGEX = Pattern.compile("[^a-z0-9]");

        for(int i=0; i < text.length(); i++){
            String c = Character.toString(text.charAt(i)).toLowerCase();

            if(REGEX.matcher(c).find()){
                others++;
            }
        }
        return others;
    }

    public String toString(){
        return "Consonants: " + countConsonants() +
               "\nVowels: " + countVowels() +
               "\nNumbers: " + countNumbers() +
               "\nOthers: " + countOthers();
    }
}