package kardarklass;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Information information=new Information();
        System.out.println("Enter Name : ");
        information.setName(scanner.next());
        System.out.println("Enter Family : ");
        information.setFamily(scanner.next());
        System.out.println("Enter Age : ");
        information.setAge(scanner.next());
        System.out.println("Enter Username : ");
        information.setUsername(scanner.next());
        System.out.println("Enter Job : ");
        information.setJob(scanner.next());

    }
}
