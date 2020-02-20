/*
Michael Crozier
Module 7 Assignment 1 

Blood Alcohol Content Calulator 

*/
import java.time.*; 

class Main {
  // A common naming convention for constants is to use all caps sentence-cased
  // Constants should also have the final modifier so they aren't overwritten
   private final double GRAM_LBS = 453.592;
   private final double GRAM_OZS = 28.3495;

   

   // Ideally the test should instantiate this, and add the appropriate values for a given unit test, but we can do it here for now. Using random values for "fuzzing"
  
  public static void main(String[] args) {
    // pretend this is being used by a unit test
    Bac testBacObj = new Bac('F', 10, 20, 30l);
    
    // quick sanity check
    System.out.printf(
      "Gender: %s \n"
      +"Weight: %s \n"
      +"Drinks: %s \n"
      +"Time Since Last Drink: %s",
      testBacObj.getGender(),
      testBacObj.getWeight(),
      testBacObj.getDrinkAmount(),
      testBacObj.getTimeSinceLast()
    );
  }
}