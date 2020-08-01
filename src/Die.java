import java.util.Scanner;

public class Die {
    static int nwd(int a, int b){
        if (a==b) return a;
        if (a>b) return nwd(a-b,b);
        if(b>a) return nwd(a, b-a);
        return 1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input:");
        String input = scan.nextLine();
        String[] numbers = input.split(" ");
        int y = Integer.parseInt(numbers[0]);
        int w = Integer.parseInt(numbers[1]);
        int dzielnik;
        if( y>w){
            dzielnik = nwd(7-y,6);
            System.out.println((7-y)/dzielnik + "/"+6/dzielnik);
        }
        else{
            dzielnik = nwd(7-w,6);
            System.out.println((7-w)/dzielnik + "/"+6/dzielnik);
        }



//        int licznik;
//        int mianownik;
        //rozwiazanie moje
//        if (y>=w){
//            if ((7-y)%2 == 0){
//                licznik = (7-y)/2;
//                mianownik = 6/2;
//            }
//            if ((7-y)%3 == 0){
//                licznik = 7-y/3;
//                mianownik = 6/3;
//            }
//            else{
//                licznik = y;
//                mianownik = 6;
//            }
//        }
//        else{
//            if ((7-w)%2 == 0){
//                licznik = 7-w/2;
//                mianownik = 6/2;
//            }
//            if ((7-w)%3 == 0){
//                licznik = 7-w/3;
//                mianownik = 6/3;
//            }
//            else{
//                licznik = y;
//                mianownik = 6;
//            }
//        }
//        System.out.println(licznik + "/"+mianownik);

    }



}
