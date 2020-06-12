package contacts;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name of the person:");
        String name=scanner.nextLine();

        System.out.println("Enter the surname of the person:");
        String fam=scanner.nextLine();

        System.out.println("Enter the number:");
        String phone=scanner.nextLine();

        Contacts contact=new Contacts(name,fam,phone);

        System.out.println("\nA record created!\nA Phone Book with a single record created!");
    }
}
