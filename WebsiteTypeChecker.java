import java.util.Scanner;

public class WebsiteTypeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter URL / domain: ");
        String website = sc.next().toLowerCase();

        if (website.endsWith(".com")) {
            System.out.println("Commercial website");
        } else if (website.endsWith(".org")) {
            System.out.println("Non-profit / Organization website");
        } else if (website.endsWith(".in")) {
            System.out.println("Indian domain website");
        } else {
            System.out.println("Unknown domain extension");
        }
 
    }
}
