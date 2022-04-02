package tamrin2;

import java.util.Scanner;

public class MainClass  implements Cloneable  {
    public Object clone() throws CloneNotSupportedException
    {
        return (MainClass)super.clone();
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scanner=new Scanner(System.in);
        Information information1=new Information();
        Information information2=new Information();
        Information information3=new Information();
        System.out.println("Enter Username");
        information1.setUsername(scanner.nextLine());
        System.out.println("Enter password");
        information1.setPassword(scanner.nextInt());
        information2=information1;
        information3=information1;
        System.out.println(information1.getUsername());
        System.out.println(information1.getPassword());
        System.out.println(information2.getUsername());
        System.out.println(information2.getPassword());
        System.out.println(information3.getUsername());
        System.out.println(information3.getPassword());
    }
}
