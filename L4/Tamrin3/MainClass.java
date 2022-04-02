package tamrin3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Information information = new Information();
        System.out.println("Enter name");
        information.setName(scanner.nextLine());
        System.out.println("Enter university code");
        information.setUniversitycode(scanner.nextInt());
        System.out.println("Enter father name");
        information.setFathername(scanner.next());
        ArrayList<Integer> score = new ArrayList<Integer>();
       System.out.println("Enter score");
        score.add(scanner.nextInt());
        System.out.println("Enter score");
        score.add(scanner.nextInt());
        System.out.println("Enter score");
        score.add(scanner.nextInt());
        System.out.println("Enter score");
        score.add(scanner.nextInt());
        System.out.println("Enter score");
        score.add(scanner.nextInt());
        System.out.println("Name is :" + information.getName());
        System.out.println("University code is : " + information.getUniversitycode());
        System.out.println("Father name is :" + information.getFathername());
        for (Integer item: score){
           System.out.println(item);
        }

    }
}

