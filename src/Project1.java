import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {

        greeting();
        cost();
        timeZone();
    }

    public static void greeting(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome in Trip Planner!");
        System.out.print("What's your name?");
        String name = scan.nextLine();
        System.out.print("Hello " + name + ", nice to meet you! Where would you like to go?");
        String city = scan.nextLine();
        System.out.println("Great! " + city + " sounds like a fantastic city!");
    }

    public static void cost(){
        Scanner scan = new Scanner(System.in);
        System.out.print("How many days would you like to spend there?");
        String d = scan.nextLine();
        int days = Integer.parseInt(d);
        System.out.print("What's your budget in USD?");
        String m = scan.nextLine();
        int money = Integer.parseInt(m);
        System.out.print("What's the currency symbol in that country?");
        String symbol = scan.nextLine();
        System.out.print("What's the conversion rate?");
        String r = scan.nextLine();
        double rate = Double.parseDouble(r);

        System.out.println("You'll spend " + days*24 + " hours there");
        System.out.println("Your budget is "+ money + " and you can spend " + money/days + " per day");
        System.out.println("Your budget in the different value is " + money*rate + " and you can spend " + (money*rate)/days + " per day");
    }

    public static void timeZone(){
        Scanner scan = new Scanner(System.in);
        System.out.println("That's the time difference? (If city is behind, give me negative value) ");
        String tL = scan.nextLine();
        int timeLap = Integer.parseInt(tL);
        int midnight = 0 + timeLap;
        int noon = ( 12 + timeLap ) % 24;
        System.out.println("When is midnight in your destination is " + midnight+":00 and when it's noon there is " + noon +":00");
    }

    public static void areaValue(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What's the country are in km^2?");
        String a = scan.nextLine();
        double area = Double.parseDouble(a);
        System.out.println("In imperial system it's " + area*1.6*1.6 +" miles");

    }

}
