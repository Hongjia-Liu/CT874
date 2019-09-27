/**
 * BeerSong.java - CT874 Assignment 1 Part 2
 * @author Hongjia Liu 19234417
 */

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        //  Rewrite BeerSong.java using a for loop
        //  rather than an while loop.
        for (; beerNum > 0; beerNum--) {
            if (beerNum == 1) {
                word = "bottle";
            }
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            if (beerNum - 1 > 0) {
                System.out.println((beerNum - 1) + " " + word + " of beer on the wall");
            }
            else {
                System.out.println("No more bottles of beer on the wall");
            }
        } // end for
    } // end main method
} // end class