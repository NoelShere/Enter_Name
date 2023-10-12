import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        String Name, Address; // Vars

        // Name

        System.out.println("Enter your name: ");

        Scanner s = new Scanner(System.in);

        Name = s.nextLine();


        // Address

        System.out.println("Enter your Address: ");

        Scanner a = new Scanner(System.in);

        Address = a.nextLine();


        // Print Method

        print_result(Name,Address);

        a.close();


    }

    public static void print_result(String n, String a){

        System.out.println("Name: " + n);
        System.out.println("Address: " + a);


    }

}