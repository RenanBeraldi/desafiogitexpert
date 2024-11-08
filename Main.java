import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean doingCourse;

        System.out.print("Ja iniciou o curso de Git e GitHub Expert? (S/N)");
        char response = scanner.next().charAt(0);
        if (response == 'N') {
            doingCourse =  false;
        } else {
            doingCourse = true;
        }
    }
}
