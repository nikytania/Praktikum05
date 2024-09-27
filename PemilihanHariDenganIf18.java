import java.util.Scanner;

public class PemilihanHariDenganIf18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType;
        byte dayNumber;
        System.out.println("Input day number1-5");
        System.out.println("Input day number 6-7");

        dayNumber = scanner.nextByte();
        dayType ="";

        if(dayNumber>=1 && dayNumber <=5){
            dayType="Weekday";
        }
        else if (dayNumber>=6 && dayNumber<=7) {
        }
        else {
            dayType= "invalid Number: ";
        }

        System.out.println(dayNumber + " is a " + dayType);
        scanner.close();
    }
    
}

