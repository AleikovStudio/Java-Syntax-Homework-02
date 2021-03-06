import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by AleikovStudio.com on 23/03/2016.
 */
public class Pr_05_ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();

        int number = console.nextInt();

        int remainder = 0;
        boolean finish = false;

        while (!finish) {
            if (number == 0){
                finish = true;
            }
            else {
                remainder = number % 7;
                number = number / 7;

                result.add(remainder);
            }
            remainder = 0;
        }

        System.out.println(result);

        for (int i = result.size() -1; i >=0 ; i--) {
            int a = result.get(i);
            System.out.print(a);
        }

        System.out.println();
    }
}
