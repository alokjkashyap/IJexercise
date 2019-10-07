/**
 * This program will ask a summation of number present on a dice
 * and will tell the number of rolls it took to get that summation
 * by rolling two die simultaneously at a time.
 *
 * You can also make this program show the results of each rolls
 * just by removing '//' from the line 35, 37, 39 and 42.
 * */
public class Ex0403 {

    static int U;           // user's input
    static int D1;          // die 1
    static int D2;          // die 2
    static int count = 1;   // roll counter

    public static void main(String[] args) {
        System.out.println("Type the number you want to get in the form of ");
        System.out.print("summation of two different dice rolled at same time : ");
        U = TextIO.getlnInt();      // Get user's input
        System.out.println(" ");
        if (U == 2){    // made just to make a stand out answer if the input is 2
            System.out.println("It took " + dRoll(U) + " rolls to get Snake eyes.");    // call the dRoll function
        }
        else {
            System.out.println("It took " + dRoll(U) + " rolls to get " + U);           // call the dRoll function
        }
    }   // end main()

    static int dRoll(int U){
        if (U <2 || U >12)      // throw exception if the input is out of range.
            throw new IllegalArgumentException("This is not possible with two dice.");

        while (true){
            //System.out.print("Results of roll "+ count +" is: ");
            D1 = 1 + (int)(6*Math.random());        // roll the 1st dice.
            //System.out.print(D1 + ", ");
            D2 = 1 + (int)(6*Math.random());        // roll the second dice.
            //System.out.println(D2);
            count++;
            if (D1+D2==U)   // check if condition met or not
                break;      // break if condition met.

        }
        return count;   // return the count value.

    }   // end dRoll

}   // end class Ex0403
