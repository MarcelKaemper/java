import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        Scanner scr = new Scanner(System.in);
        double num1,num2,res;
        System.out.println("Enter number 1:");
        num1 = scr.nextDouble();
        System.out.println("Enter number 2:");
        num2 = scr.nextDouble();
        res = num1+num2;
        System.out.println(res);
    }
}
