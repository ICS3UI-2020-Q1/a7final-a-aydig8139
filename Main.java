import java.util.Scanner;

/**
 * counts the number of 1s in an integer
 * @author Rose
 */
public class Main {

  //create a method to count the number of 1s in an integer
  public static int countOnes(int integer) {
    
    //declare a variable to count the number of times 1 appears
    int count = 0;
    
    //create a while loop to keep dividing the integer and checking
    while (integer > 0){

      //declare a variable that stores the remainder of the integer when divided by 10
      int digit = integer % 10;
      
      //write an if statement that increases the count variable if the remainder variable is 1
      if (digit == 1){
        count++;
       }

      //divide the integer for the next loop
      integer = integer / 10;
      } 

    //return the counter variable  
    return count;
  } 

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new scanner for user input
    Scanner input = new Scanner(System.in);
    
    //ask user for an integer and store it 
    System.out.println("Please enter an integer");
    int integer = input.nextInt();

    //print the count variable on the screen
    System.out.println(countOnes(integer));
  }
}
