import java.util.Locale;
import java.util.Scanner;

/**
 * Created by AleikovStudio.com on 23/03/2016.
 */
public class Pr_08_OddAndEvenPairs {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        String[] strNumbers = console.nextLine().split(" ");
        int[] numbers =new int[strNumbers.length];

        for(int i=0;i<strNumbers.length;i++){
            numbers[i]=Integer.parseInt(strNumbers[i]);
        }

        if (numbers.length  % 2 == 0){
            for (int i = 0; i <= numbers.length -1  ; i++) {
                if (numbers[i] % 2 != 0 && numbers[i+1] % 2 != 0){
                    System.out.printf("%d, %d -> both are odd",numbers[i],numbers[i +1]);
                    System.out.println();
                }
                else if(numbers[i]%2 ==0 &&numbers[i+1]%2 == 0){
                    System.out.printf("%d, %d -> both are even",numbers[i],numbers[i +1]);
                    System.out.println();
                }
                else {
                    System.out.printf("%d, %d -> different",numbers[i],numbers[i +1]);
                    System.out.println();
                }
                i++;
            }
        }
        else {
            System.out.println("Invalid length");
        }
    }
}
