import java.util.ArrayList;
import java.util.Scanner;

public class Flamaster {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> result = new ArrayList<>();
        String tmp;

        System.out.println("Podaj liczbe wierszy:");
        tmp = scan.nextLine();
        int verses = Integer.parseInt(tmp);
        for (int i=0; i<verses; i++){
            tmp = scan.nextLine();
            words.add(tmp);
        }

        for (String word : words) {
            int howMany = 1;
            StringBuilder newWord = new StringBuilder();

            for (int i=0; i<word.length(); i++){
                if(i!=word.length()-1 && word.charAt(i) == word.charAt(i+1)){
                    howMany++;
                    continue;
                }
                if(howMany==1){
                    newWord.append(word.charAt(i));
                }
                else if(howMany==2){
                    newWord.append(word.charAt(i));
                    newWord.append(word.charAt(i));
                }
                else{
                    newWord.append(word.charAt(i));
                    newWord.append(howMany);
                }
                howMany=1;
            }
            System.out.println(newWord);
        }

    }
}
