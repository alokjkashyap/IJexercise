public class Ex0301 {

    public static void main(String[] args) {

        int D1, D2;  // Assigning the variables for dices.
        int count;   // To count number of roll done.


        count = 0;  // Setting counter to 0.

        System.out.println("Rolling the dice.............");

        while (true) {

            D1 = (int) (Math.random()*6) + 1; // Due to being inside a while loop the values are reassigned every time the loop repeats
            D2 = (int) (Math.random()*6) + 1; //   and we are able to get a random value each time.

            count += 1;

            System.out.println("Roll "+ count + " :- "+ D1 +" | " + D2 + "  ");

            if (D1 == 1 && D2 == 1 )
                break;                         // It will break the loop if both dice have value equals to one i.e. Snake eyes

        }
        System.out.println();

        System.out.println("Its tooks " + count + " Rolls to get Snake eyes.");

    }

}
