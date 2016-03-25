import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by AleikovStudio.com on 23/03/2016.
 */
public class Pr_11_GetFirstOddorEvenElements {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);

        ArrayList<Integer> resultNumbers = new ArrayList<Integer>();
        String[] strNumbers = console.nextLine().split(" ");
        Integer[] numbers = new Integer[strNumbers.length];


        for (int i = 0; i <strNumbers.length ; i++) {

            numbers[i] = Integer.parseInt(strNumbers[i]);
        }

        String[] command = console.nextLine().split(" ");
        int count = Integer.parseInt(command[1]);
        String oddOrEven = command[2];

        if (oddOrEven.equals("even")){

            for (int i = 0; i < numbers.length ; i++) {
                if (numbers[i] % 2 == 0){
                    if (resultNumbers.size() < count){
                        resultNumbers.add(numbers[i]);
                        System.out.print(numbers[i] + " ");
                    }
                }
            }
        }
        if (oddOrEven.equals("odd")){
            for (int i = 0; i < numbers.length ; i++) {
                if (numbers[i] % 2 != 0){
                    if (resultNumbers.size() < count){
                        resultNumbers.add(numbers[i]);
                        System.out.print(numbers[i] + " ");
                    }
                }
            }
        }
    }
}
