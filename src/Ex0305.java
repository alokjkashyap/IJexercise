public class Ex0305 {

    public static void main(String[] args) {

        String S;
        int semicPos;
        int lpos;
        int CurN;
        String  NumData;
        double cData;
        //NumData = "Null for now.";
        double cSum;
        //cData = 0;
        cSum = 0;

        TextIO.readFile("sales.dat");
        while (TextIO.eof() == false ) {

            CurN = 0;
            S = TextIO.getlnString();
            lpos = S.length();


            for (CurN = 0; CurN < lpos; CurN++) {


                if (S.charAt(CurN) == ':') {
                    semicPos = CurN;
                    NumData = S.substring(semicPos + 1, lpos);
                    //System.out.println(N1);


                    try {


                        cData = Double.parseDouble(NumData);
                        System.out.println();
                        System.out.print("City : ");
                        System.out.println(S.substring(0,semicPos));
                        System.out.println("Sales :" + cData );
                        System.out.println("----------------------------------------------");

                    }

                    catch (IllegalArgumentException e) {
                        cData = 0;

                        System.out.print("City : ");
                        System.out.println(S.substring(0,semicPos));
                        System.out.println("Not able to find any report.");
                        System.out.print("Due to :");
                        System.out.println(S.substring(semicPos+1,lpos));
                        System.out.println("----------------------------------------------");

                    }

                    cSum += cData ;


                }


            }


        }
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("Total sales from all cities together is : ");
        System.out.println();
        System.out.println(cSum);

    }

}
