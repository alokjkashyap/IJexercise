public class Ex0302 {

    public static void main(String[] args) {

        int N;        // Number between 1 and 1000
        int D;        // Divisor between 1 and N
        int Dcount;   // Number of divisor of N
        int Mdiv;     // Maximum divisor
        int MdivN;    // The number which has maximum divisor.


        Dcount = 0;   // Setting counter to 0
        Mdiv = 0;     // Max divisor is 0 for now.
        MdivN = 0;    // The number with max divisor is zero for now.


        for (N =1; N <= 1000; N++) {          // Starting from the number 1.

            /** Remove the '//' from the line below to print which number is being tested. */
            //System.out.println("Testing for " + N);

            for (D= 1; D <= N; D++) {        // Starting from the divisor 1.

                if (N % D == 0)              // Checking if the number is divisible by the number chosen to divide.
                    Dcount++;                // Counting after the number is divisible.

            }


            if (Mdiv < Dcount) {            // It will add the number of maximum number of divisor if found every time
                                            //   the loop repeats. If the number of divisor is smaller than any other number's
                Mdiv = Dcount;              //   divisor then it doesn't update that.
                MdivN = N;                  // The number which has the maximum number of divisor.
            }

            /** Remove the '//' from the line below to print how many divisor does the current number has. */

            //System.out.println("Number of divisors are: " + Dcount);

            Dcount = 0;   // Resetting the counter to 0 for next number.

        }
        System.out.println();
        System.out.println("The Number having maximum divisor is " + MdivN + ". With a total of " + Mdiv + " divisors.");
        System.out.println("There might be some more Number having the exact same number of divisors.");

    } // end main()

} //end class Ex0302
