import java.util.Random;

/**
 * Write a description of class CoinFlip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CoinFlip {
     public static void main(String[] args){
         Random rand = new Random();//untuk deklarasi keyword random dan mengacak
         double chance = rand.nextDouble();
         if (chance < 0.5) {
             System.out.println("heads!");
         } else {
             System.out.println("tails!");
         }
     }
}