import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day: ");
        String str = scanner.nextLine();
        System.out.println("switch: " + switchCase(str));
        scanner.close();

    }

    static String switchCase(String day) {
        String ret = "";
        switch (day) {
            case "tu":
                ret = "Tuesday";
                break;
            case "m": case "mon": case "md": 
                if()
                ret = "Monday";
                break;
            case "th":
                ret = "Thursday";
                break;

        }

        return ret;

    }

}
