/*
 *  @ author Sami Jenedi
 *  This class calculates the number of miles per gallon and the number of kilometers per liter given
 */

import java.util.Scanner;

public class Project1 {

  public static void main(String[] args) {

    final double KILOMETERS_PER_MILE = 1.60934;
    final double LITERS_PER_GALLON = 3.78541;
    int beginningOdometer = 0;
    int endingOdometer = 0;
    double numberOfGallon = 0;

    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter number of gallons used: ");
    numberOfGallon = input.nextDouble();
    
    if (numberOfGallon > 0) {
    
    System.out.print("Please enter the beginning odometer reading: ");
    beginningOdometer = input.nextInt();
    
    System.out.print("Please enter the ending odometer reading: ");
    endingOdometer = input.nextInt();
    
    if (beginningOdometer < endingOdometer ) {
      double compute1 =  (endingOdometer - beginningOdometer) /  numberOfGallon;
      System.out.print("The number of miles per gallons is:  " + compute1);
      System.out.println();
      
      double compute2 =  ((endingOdometer - beginningOdometer) * KILOMETERS_PER_MILE) / ( numberOfGallon * LITERS_PER_GALLON);
      System.out.print("The number of kilometers per liter is: " + compute2);
    }
    else
      System.out.print("I'm sorry, the ending odometer reading must be greater than the starting odometer reading.");

    }
    else
      System.out.print("I'm sorry, gallons used must be greater than 0.");
  }

}
