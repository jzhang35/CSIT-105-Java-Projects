// James Zhang
package project1parta;
import java.util.Scanner;

public class Project1PartA
{
   public static void main(String[] args)
   {
      String cookieType;
      int cookiesEaten,
          cookiesTotal,
          servings;
      double caloriesPerServing,
             calories;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Which cookies did you eat? ");
      cookieType = keyboard.nextLine();
      
      System.out.print("How many cookies are there in a bag? ");
      cookiesTotal = keyboard.nextInt();
      
      System.out.print("How many servings are there in a bag? ");
      servings = keyboard.nextInt();
      
      System.out.print("How many calories in a serving? ");
      caloriesPerServing = keyboard.nextDouble();
      
      System.out.print("How many cookies did you eat? ");
      cookiesEaten = keyboard.nextInt();
      
      calories = (servings * caloriesPerServing / cookiesTotal) * cookiesEaten;
      
      System.out.println(cookiesEaten + " " + cookieType + " cookies is " + calories + " calories");
   }
}