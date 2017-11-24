
import java.util.Scanner;

public class Example {
    public static void main(String args[]) {
	    int i;
	    for (i=0;i<5;i++) {
            System.out.println(i);
        }
        System.out.println(args[0]);
        System.out.println("Magick drives the Web");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char c = scanner.next().charAt(0);
        System.out.println("You have entered: "+c);

    }
}
