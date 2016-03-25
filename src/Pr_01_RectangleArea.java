import java.util.Scanner;

/**
 * Created by AleikovStudio.com on 22/03/2016.
 */
public class Pr_01_RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please write your first side:");
        int sideOne = scan.nextInt();
        System.out.println("Please write your second side:");
        int sideTwo = scan.nextInt();

        System.out.println("The area of your rectangle is:7");
        System.out.println(sideOne*sideTwo);
    }
}
