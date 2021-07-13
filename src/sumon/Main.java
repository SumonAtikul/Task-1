package sumon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
         * Name: Md. Atikul Islam Sumon
         * ID: 2012020122
         * Section: C
         * Email: cse_2012020122@lus.ac.bd
         * Date: 14-07-2021
         */

        Scanner input = new Scanner(System.in);
        String section;
        System.out.print("Enter section: ");
        section = input.nextLine();
        System.out.println("Section: "+section);

        Info mInfo = new Info();
        System.out.println("Name: "+mInfo.name);
        System.out.println("Id: "+mInfo.id);

        Hobby mHobby = new Hobby();
        System.out.println("Hobby: "+mHobby.hobbyName);
    }
}
