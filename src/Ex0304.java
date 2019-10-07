public class Ex0304 {

    public static void main(String[] args) {

        String S;
        
        System.out.println("Please Type A Sentence: ");
        
        S = TextIO.getlnString();
        
        int N;
        N = 0;

        for (N = 0; N < S.length(); N++) {    // Starting from 0 to end of the sentence.

            if (S.charAt(N) >= 'a' && S.charAt(N) <= 'z' || S.charAt(N) >= 'A' && S.charAt(N) <= 'Z' || S.charAt(N) == '\'' ) {

                System.out.print(S.charAt(N));   // This will print the letter which come in the position starting from 0 to end
                   
            }
            else if (S.charAt(N) == ' ')
                System.out.println();           // This will make the program print the letters in new line when ever a ' ' (space) is detected
                                                //   between two letters. This whole concept will print letters only which is apparently words.
        }
        System.out.println();


    }
}
