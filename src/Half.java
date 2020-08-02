import java.util.Scanner;

public class Half {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        int number = Integer.parseInt(num);
        String[] table = new String[number];
        for (int i=0; i<number; i++){
            String tmp = scan.nextLine();
            if(tmp.length()%2 != 0){
                System.out.println("Must be 2*k string, where k is length of string");
                return;
            }
            else{
                table[i] = tmp;
            }
        }
        for (String item : table){
            int middle = item.length()/2;
            item = item.substring(0,middle);
            System.out.println(item);
        }

        return;
    }
}
