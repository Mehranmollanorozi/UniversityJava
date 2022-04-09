package tamrin1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    Information information=new Information().setName(scanner.nextLine()).setRealname(scanner.nextLine()).setPassword(scanner.nextInt()).setAge(scanner.nextInt()).setAddress(scanner.next()).setPhonenumber(scanner.nextInt()).setEducation(scanner.next());
        System.out.println(information.getName());
        System.out.println(information.getRealname());
        System.out.println(information.getPassword());
        System.out.println(information.getAge());
        System.out.println(information.getAddress());
        System.out.println(information.getPhonenumber());
        System.out.println(information.getEducation());
    }
}
