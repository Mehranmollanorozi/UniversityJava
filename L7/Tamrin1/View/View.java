package tamrin1.view;

import tamrin1.controller.Controller;

import java.util.Scanner;

public class View {
    public static void main(String[] args)  {

        Controller controller = new Controller();
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter Username");
        controller.setModelUsername(reader.nextLine());
        System.out.print("Enter Password:");
        controller.setModelpassword(reader.nextLine());
        controller.Check();
        controller.Update();
        System.out.println("Gig          price");
        System.out.println("2Gig         1000T");
        System.out.println("4Gig         2000T");
        System.out.println("10Gig        5000T");
        System.out.println("25Gig        10000T");
        System.out.print("Which one do you want? ");
        controller.setModelGig_number(reader.nextLine());
        controller.Choose();
        System.out.println("Gig volume:"+controller.Gig_return());
        System.out.println("Price of Gig:"+controller.Price_return());

    }
}
