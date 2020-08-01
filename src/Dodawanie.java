import java.util.Scanner;

public class Dodawanie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //liczba testów
        String stest = scan.nextLine();
        int itest = Integer.parseInt(stest);
        for (int i=0; i<itest; i++){
            //ile liczb do dodania
            String scounter = scan.nextLine();
            int counter = Integer.parseInt(scounter);
            //liczby
            String numbers = scan.nextLine();
            String[] numb = numbers.split(" ");
            int result = 0;
            for (int j=0; j<counter; j++){
                int tmp = Integer.parseInt(numb[j]);
                result += tmp;
            }
            System.out.println(result);
        }


    }
}
