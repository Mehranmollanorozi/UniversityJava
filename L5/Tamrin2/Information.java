package tamrin2;

import java.util.Scanner;

public class Information {
    Scanner scanner=new Scanner(System.in);
    private static Information information;
    public synchronized static Information getLogInstance(){
        if (information==null){
            information=new Information();
        }
        return information;
    }
        private Information(){}
    public void show(){
        System.out.println("Enter username");
        String username=scanner.nextLine();
        System.out.println("Enter password");
        int password=scanner.nextInt();
        System.out.println(username);
        System.out.println(password);
    }
}
