import java.util.Scanner;

public class Acronym {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = (scanner.nextLine()).toUpperCase();

        //splitting the sentence into an array of words
        String[] words = input.split(" ");
        int wordsLen = words.length;

        for(int i = 0; i < wordsLen; i++){
            // this code was referenced from w3schools
            //https://www.w3schools.com/java/ref_string_charat.asp$0
            System.out.print(words[i].charAt(0));

        }

    }
}
