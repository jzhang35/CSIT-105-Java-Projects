package project3jameszhang;
import java.util.Scanner;

public class Project3JamesZhang {

    public static void main(String[] args) {
        
        int totalDaisies = 0;
        int jumps = 0;
        int gatherings = 0;
        int row = 10;
        int col = 10;
        boolean quit = false;
        char choice;
        String input;
        
        Scanner keyboard = new Scanner(System.in);
        
        Grid grid = new Grid();
        System.out.println("You are in spot [" + grid.getCurrentRow() + ", " + grid.getCurrentCol() + "]");
        System.out.print("There are " + grid.getCurrentValue() + " daisies located here");
        
        System.out.println("\n\nYou currently have a total of " + totalDaisies + " daisies");
        
        while(!quit){
            System.out.print("What would you like to do? (G, J, N, S, E, W, M, Q): ");
            input = keyboard.nextLine();
            choice = input.toUpperCase().charAt(0);
            
            if(choice == 'Q'){
                quit = true;
                System.out.println("\nYou gathered a total of " + totalDaisies + " daisies!");
                System.out.println("You did it in " + jumps + " jumps and " + gatherings + " number of gatherings");
            } else if (choice == 'G'){
                totalDaisies += grid.gatherDaisies();
                System.out.println("\nYou currently have a total of " + totalDaisies + " daisies");
                gatherings++;
            } else if (choice == 'J'){
                grid.jump(input);
                System.out.println("There are " + grid.getCurrentValue() + " daisies located here");
                System.out.println("\nYou currently have a total of " + totalDaisies + " daisies");
                jumps++;
            } else if (choice == 'N'){
                grid.goNorth(input);
                System.out.println("\nYou are in  spot [" + grid.getCurrentRow() + ", " + grid.getCurrentCol() + "]");
                System.out.println("There are " + grid.getCurrentValue() + " daisies located here");
                System.out.println("\nYou currently have a total of " + totalDaisies + " daisies");
            } else if (choice == 'S'){
                grid.goSouth(input);
                System.out.println("\nYou are in spot [" + grid.getCurrentRow() + ", " + grid.getCurrentCol() + "]");
                System.out.println("There are " + grid.getCurrentValue() + " daisies located here");
                System.out.println("\nYou currently have a total of " + totalDaisies + " daisies");
            } else if (choice == 'E'){
                grid.goEast(input);
                System.out.println("\nYou are in spot [" + grid.getCurrentRow() + ", " + grid.getCurrentCol() + "]");
                System.out.println("There are " + grid.getCurrentValue() + " daisies located here");
                System.out.println("\nYou currently have a total of " + totalDaisies + " daisies");
            } else if (choice == 'W'){
                grid.goWest(input);
                System.out.println("\nYou are in spot [" + grid.getCurrentRow() + ", " + grid.getCurrentCol() + "]");
                System.out.println("There are " + grid.getCurrentValue() + " daisies located here");
                System.out.println("\nYou currently have a total of " + totalDaisies + " daisies");
            } else if (choice == 'M'){
                System.out.println("\nMap of Grid:\n" + grid.toString());
                System.out.println("\nYou are in spot [" + grid.getCurrentRow() + ", " + grid.getCurrentCol() + "]");
                System.out.println("There are " + grid.getCurrentValue() + " daisies located here");
                System.out.println("\nYou currently have a total of " + totalDaisies + " daisies");
            } else {
                System.out.println("\nInvalid Input. Try again.");
            }
        }
    }
}
