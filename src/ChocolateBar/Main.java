package ChocolateBar;

import java.nio.channels.NetworkChannel;
import java.util.Scanner;


public class Main {

public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);
    int userSelection = 0;

    
    chocolateNumber[] examplen[]= new chocolateNumber();

   while (true) {
    System.out.println("");
    System.out.println("###############################################");
    System.out.println("            Chocolate Bar Plaza                ");
    System.out.println("###############################################");
    System.out.println("(1) Add a Chocolate Bar");
    System.out.println("(2) Delete a Chocolate Bar");
    System.out.println("(3) Show total Number of Chocolate Bar.");
    System.out.println("(4) Search for a Chocolate Bar by 10");
    System.out.println("(5) QUIT.");
    System.out.println("(pick an option)");

    userSelection = userInput.nextInt();


    if (userSelection == 5) {
        System.out.println("Chocolate Bar Plaza is melting");
        userInput.close();
        break;
    }

}

}

}
