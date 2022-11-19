// *Author : Mohanad AlBadri
// * Date: 18/11/2022
// * recover java skills


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter your number to No1");
        Scanner sc = new Scanner(System.in);
        int number_one = sc.nextInt();
        System.out.println("Enter your number to NO2");

        double number_tow = sc.nextDouble();
        Scanner x=new Scanner(System.in);
        System.out.println("inter your choice");
        int input_choice;
int choice = x.nextInt();
        switch (choice) {
            case 1:

                System.out.println(number_one+number_tow);
                break;

            case 2:

                System.out.println( number_one-number_tow);
                break;
            default:

                System.out.println("bye");
        }
    }
}