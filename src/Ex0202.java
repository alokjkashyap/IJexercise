public class Ex0202 {
    public static void main(String[] args) {

        int Dice1 ;  // Number that comes when the 1-st dice is rolled.
        int Dice2 ;  // Number that comes when the 2-nd dice is rolled.

        System.out.println("Here, we have a pair of Dice that will roll.");
        System.out.print("Press a key to roll.");
        TextIO.getln();   // Get a user respond to proceed further.
        System.out.println(" ");
        System.out.println("Rolling the dice....... Here are the results. ");
        System.out.println(" ");

        Dice1 = (int) (Math.random()*6) +1;  // Assigning random number between 1 & 6 for die 1.
        Dice2 = (int) (Math.random()*6) +1;  // Assigning random number between 1 & 6 for dice 2.

        System.out.println("The first die comes up " + Dice1 );
        System.out.println("The second die comes up " + Dice2 );
        System.out.print("Your total roll is ");
        System.out.println(Dice1+Dice2);

    } // end of main()

} // end of class Ex0202
