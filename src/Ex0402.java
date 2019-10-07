/**
 * This program finds value of hexadecimal numbers in decimal i.e. base 10 numbers.
 * It can also tell value of every hexadecimals digits the user gives to do so just
 * remove the '//' from lines 35, 36 and 40. else it will tell you only the value of
 * number in decimal.
 *
 * Here i've introduced two subroutine one subroutine calHexV takes the string and then
 * calls the other subroutine hexValue which gives the value of hex characters and then
 * the 1st subroutine calHexV joins all the values given for each hex character and give
 * a combined result of the number in decimal.
*/
public class Ex0402 {

    static String res;  //  final decimal result.
    static char letter; //  used as to store letter and get their decimal values.
    static String Lcap; //  to store the uppercase of the given string.
    static String  L;   //  Stores the user input.

    public static void main(String[] args){

        System.out.println("This program will convert your hexadecimal number in decimal.");
        System.out.println("Enter the number you want to get converted by this program: ");
        L =TextIO.getlnString();    // ask input
        calHexV(L); // call the function.

    }   // end main()

    static void calHexV(String L){
        Lcap = L.toUpperCase(); // changing case of the character to avoid making extra conditions for lowercase letters
        int i = 0;              // counter zero for cycling through each character of the given string
        res = "";               // adding initial value to result.
        while (i<Lcap.length()){    // Start the cycle
            if (Character.isLetter(Lcap.charAt(i))){    // check if any character is hexadecimal i.e. alphabets
                letter = Lcap.charAt(i);
                //System.out.print(L.charAt(i) + " = ");
                //System.out.println(hexValue(letter));
                res += hexValue(letter);
            }
            else if (Character.isDigit(Lcap.charAt(i))){    // check if any character is number then just add to res.
                //System.out.println(L.charAt(i)+ " = " +L.charAt(i));
                res += L.charAt(i);
            }

            /*  if given character is other than numbers or letters then show a error.*/

            else if (Character.isDigit(Lcap.charAt(i))== false || Character.isLetter(Lcap.charAt(i))==false){
                System.out.println();
                System.out.println("Error: Given string contain illegal character.");
                break;
            }

            i++;    // add 1 to counter to check next number.
        }
        System.out.println();
        System.out.println("Your given hexadecimal number in decimal(base-10) is:");
        System.out.println(res);    // print the result.

    }   // end calHexV

    static int hexValue(char letter){

        /* if the alphabets present in string is other than the series 'a' to 'f' then return -1 and show error*/

        if (letter>'F' ) {
            System.out.print("This is a error. Character is out of 16 character and is not part of hexadecimal.");
            return -1;
        }

        switch (letter) {
            case'A' :   // for A
                if (letter== 'A')
                    return 10;      // value of A in Hexadecimal
            case 'B' :  // for B
                if (letter== 'B')
                    return 11;      // value of B in Hexadecimal
            case 'C' :  // for C
                if (letter=='C')
                    return 12;      // value of C in Hexadecimal
            case 'D' :  // for D
                if (letter=='D')
                    return 13;      // value of D in Hexadecimal
            case 'E' :  // for E
                if (letter=='E')
                    return 14;      // value of E in Hexadecimal
            case 'F' :  // for F
                if (letter=='F')
                    return 15;      // value of F in Hexadecimal
        }
        return 0;   // Written just to avoid errors. It doesn't affect the code.

    }   // end hexValue

}   // end class Ex0402
