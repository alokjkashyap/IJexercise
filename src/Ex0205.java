public class Ex0205 {

    public static void main(String[] args) {

        int eggs;       // Total number of eggs.
        int gross;      // Total number of gross of eggs.
        int dozen;      // Total number of dozen of eggs.

        System.out.print("How many eggs do you have in total? : ");

        eggs = TextIO.getlnInt();

        System.out.println("You have " + (eggs/12) +" dozen of eggs, and " + (eggs%12) + " egg(s) are left over.");


        /* Lines added to Extend the Program*/

        gross = eggs/144;        // Calculating gross of eggs.
        dozen = (eggs%144)/12;   // Calculating number of dozen from the gross that left after calculation of gross.
                                 // but this is no necessary as we can add "(eggs%144)/12" to the following line
                                 // at the place of "dozen".

        System.out.println("You have number of eggs is " + gross + " gross, " + dozen + " dozen, and " + ((eggs%144)%12));

    } // end of main()

} //end of class Ex0205
