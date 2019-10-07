public class Ex0206 {

    public static void main(String[] args) {

        String name;
        int c1, c2,c3;

        TextIO.readFile("testdata.txt");  // Now it will read input from the file named testdata.txt
        name = TextIO.getln();            // To get the first line from txt file. (Note : as it is assigned above
                                          // that data type is String, so it will accept string in 1st line only.)
        c1 = TextIO.getInt();             // To get the second line as int.
        c2 = TextIO.getInt();             // To get the third line as int.
        c3 = TextIO.getInt();             // To get the fourth line as int.

        TextIO.readStandardInput();       // Not needed but after this program will read input by user if asked.

        System.out.println("Student Name  : " + name.toUpperCase());
        System.out.println("Average score : " + (c1+c2+c3)/3);

    } // end of main()

} //end of class Ex0206
