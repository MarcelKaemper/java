package classes;

import java.util.Scanner;

public class classone {
    public static void main(String args[]){
        classtwo ct = new classtwo();

        Scanner scr = new Scanner(System.in);
        ct.message(scr.nextLine());

        ct.setName("Billy");
        System.out.println(ct.getName());
        ct.printName();
    }
}
