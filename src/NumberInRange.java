import java.util.Random;

public class NumberInRange {
    public static void main(String[] args) {

        Random r = new Random();
        int low = 15;
        int high = 85;
        int result = r.nextInt(high-low) + low;
        System.out.println(result);

    }
}
