// Separating base package imports from custom imports
import java.time.*;
import java.util.*;
import java.lang.*;


public class Bac {
   private final double FEMALE_R = .55; // Widmark R female for Female BAC
   private final double MALE_R = .68; // Widmark R male for Male BAC

    // Initialize Properties so they can be visible from the "this" context
    private char gender;           
    private int weight;              // Pounds
    private long timeSinceLast; // Hours
    private int drinkAmount;         // Quantity

    // Constructor
   public Bac(char gender, int weight, int drinkAmount, long timeSinceLast) {
     this.setGender(gender);
     this.setWeight(weight);
     this.setTimeSinceLast(timeSinceLast);
     this.setDrinkAmount(drinkAmount);
   }


   // Public Method(s)
   public double getBacValue(){
      if ( gender == 'F' ){
         return (drinkAmount / (weight * FEMALE_R)) * 100;
      }
      else {
         return (drinkAmount / (weight * MALE_R)) * 100;
      }
   }         

    public LocalTime time(){
      LocalTime time = LocalTime.now();
     return time;
    }

   // Private Method(s)
   /* -- VV -- */
   private double hoursTillSober(double bacValue) {
      double soberTime = bacValue / .015; // how many hours till sober
      return soberTime;
   }
   
   // Naming affects scope which could be why we are seeing errors
   // a local variable with the same name as it's parent method can cause confusion
   private double soberTime(double localTime){
      double soberTime = localTime - this.hoursTillSober();
      return soberTime; 
   }
   /* -- ^^ -- */

   // Getters & Setters although not really needed in this case.
   // Just for a sanity check
   public char getGender() {
     return this.gender;
   }
   private void setGender(char genderInput) {
     this.gender = genderInput;
   }
   public int getWeight() {
      return this.weight;
   }
   private void setWeight(int newWeight) {
     this.weight = newWeight;
   }
   public long getTimeSinceLast() {
     return this.timeSinceLast;
   }
   private void setTimeSinceLast(long rawTimeSinceLast) {
     // This can be refactored to call the soberTime or hoursTillSober methods and return their value
     this.timeSinceLast = rawTimeSinceLast;
   }
   public int getDrinkAmount() {
     return this.drinkAmount;
   }
   private void setDrinkAmount(int newDrinkAmount) {
     this.drinkAmount = newDrinkAmount;
   }
}