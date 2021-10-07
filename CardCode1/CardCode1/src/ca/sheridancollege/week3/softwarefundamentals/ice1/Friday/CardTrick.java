
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ronak
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
         Scanner input = new Scanner(System.in);
       
        Random x = new Random();
        int n = x.nextInt(13+1);//random number 1-13 cards
        int y  = x.nextInt(4);//random number 0-3 suits
          
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
             c.setValue(n);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[y]);
             magicHand [i]= c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Card card1 = new Card();
         System.out.println("Enter any card between 1-13 :");
         int card = input.nextInt();
         card1.setValue(card);
         System.out.println("\nEnter the your choice of suit of the card: ");
         String suits = input.next();
         card1.setSuit(suits);
        

        // and search magicHand here
        boolean inrandom = false;
         for(int i=0;i<magicHand.length;i++){
               if(magicHand[i].getValue()==card1.getValue()&& magicHand[i].getSuit().equalsIgnoreCase(card1.getSuit())){
                  inrandom=true;
               }
         }
        //Then report the result here
        if(inrandom){
             System.out.println("\nYour card is in the magic hand.");
         }else{
             System.out.println("\nYour  card is not in the magic hand\n");
        }
       //luchycard object
        Card luckyCard = new Card();//new 
        luckyCard.setValue(1);//number
        luckyCard.setSuit("Spades");//suits
        
        boolean inDeck1 = false;
        
        for(int i=0; i<magicHand.length;i++){    //search value is in array or not  
              if(magicHand[i].getValue()==luckyCard.getValue()&& magicHand[i].getSuit().equalsIgnoreCase(luckyCard.getSuit()))
              inDeck1=true;
        }
            
        if(inDeck1){
            System.out.println("\nYour lucky card is in the magic hand.");
        }else{
            System.out.println("\nYour lucky card is not in the magic hand.");
        }
        
    }
    
}
