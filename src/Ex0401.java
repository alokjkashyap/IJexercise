/**
 * This program capitalize a string typed by the user.
 */
public class Ex0401 {

    static  String S;   // A static variable to use everywhere in the program.

    public static void main(String[] args){
        System.out.println("Please type a sentence to capitalize: ");
        S = TextIO.getlnString();   // Get a sentence to capitalize by user.
        capitalize();

    }   // end of main.

    static void capitalize() {

        /* This is wrote for printing 1st character capital if it is a letter
          otherwise it will simply print that character.*/
        if (Character.isLetter(S.charAt(0))){
            System.out.print(Character.toUpperCase(S.charAt(0)));
        }
        else {
            System.out.print(S.charAt(0));  // This will print the 1st character from
        }                                   //  the given sentence if it is other than
                                            // a letter

        int i=1;    // Counting from 2nd letter in the sequence as the 1st letter had already printed.

        while (i < S.length()){     // Loop for running through the sequence and checking where to capitalize
            /* This will put a ' ' where needed and capitalise the letter which come after the ' ' */
            if (S.charAt(i)== ' ') {
                System.out.print(" ");
                System.out.print(Character.toUpperCase(S.charAt(i+1)));
                i++;
            }
            /* This will print the lowercase characters */
            else
                System.out.print(S.charAt(i));
            i++;

        } // end of while loop

    } // end of capitalize


} //end class Ex0401
