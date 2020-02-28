import java.util.Random;
import java.util.Scanner;
 public class Die {

    private int value;

   //value showing on the face of the die

    private Random rand = new Random(); //random object to use for rolling

    //constructor whcih initializes the die to show a 3 
    public Die() {

    }

    //rolls the die and updates it's face
    public void setValue(int diceValue) {
    value=diceValue;
 }

    
    //returns the value of the die face
    public int getValue() {
    return value;

    }
    public void roll(){
        value=rand.nextInt(6)+1;
    }


    //tests the Die class
    public static void main (String [] args) {
     Die dieOne=new Die();
     dieOne.roll();
     System.out.println("Your first number is:"+dieOne.getValue());
     System.out.println("Your second number is:"+dieOne.getValue());
     System.out.println("Your third number is:"+dieOne.getValue());
     System.out.println("Your fourth number is"+dieOne.getValue());
     System.out.println("Your fifth number is"+dieOne.getValue());
    System.out.println("Your total is:"+dieOne.getValue()*5);
    System.out.println("The average of all rolls is:"(dieOne.getValue()*5)/5);



    /* Add code here that:
       *  creates one Die object
        *  rolls the Die 5 times
        *  prints out the total of the rolls
        *  prints out the actual average value of all rolls
    */

         
   



    }

 }