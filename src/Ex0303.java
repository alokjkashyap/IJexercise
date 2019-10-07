public class Ex0303 {

    public static void main(String[] args) {

        double N1;
        double N2;
        char operator;
        double ex;
        N1 = 1;  // Setting this one is not necessary but the IDE says N1 might not have been initialized
                 //   its doesn't affect the code or the value of N1 anyway.

        System.out.println("Enter the Mathematical Expression you want to solve: ");
        System.out.println("You can only use + , - , * & / .");
        System.out.println("And Press 0 as the first number to quit.");

        while (true) {     // This loop will make computer keep asking for input until 0 is typed as N1.

            if (N1 == 0) {

                break;    // This will break the while loop once N1 becomes 0.
            }

            System.out.println("---------------------------------------------------------");
            System.out.print("=>");

            N1 = TextIO.getDouble();
            operator = TextIO.getChar();
            N2 = TextIO.getlnDouble();

            /* For Addition */

            if (operator == '+') {

                ex = N1 + N2;
                System.out.println("=" +ex);

            }

            /* For Subtraction */

            if (operator == '-') {

                ex = N1 - N2;
                System.out.println("=" +ex);
            }

            /* For Multiplication */

            if (operator == '*') {

                ex = N1 * N2;
                System.out.println("=" +ex);
            }

            /* For Division */

            if (operator == '/') {

                ex = N1 / N2;
                System.out.println("=" +ex);
            }


        }

        System.out.println("---------------------------------------------------------");
        System.out.println("Okay Now I'm quitting.");
    }
}
