import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter your number");
        findNumInRange(sc.nextInt());
    }


    public static void findNumInRange(int inputNumber) {
        int firstCase = (inputNumber >= 0) && (inputNumber <= 45) ? 1 : -1;
        firstCase = (inputNumber > 45) && (inputNumber <= 90) ? 2 : firstCase;
        firstCase = (inputNumber > 90) && (inputNumber <=135) ? 3 : firstCase;

        switch (firstCase) {
            case 1:
                System.out.println("number is in 0 -> 45 range");
                break;
            case 2:
                System.out.println("number is in 45 -> 90 range");
                break;
            case 3:
                System.out.println("number is in 90 -> 135");
                break;
            default:
                System.out.println("number is in other range");
        }
    }


}



