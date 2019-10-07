public class Ex0204 {

    public static void main(String[] args) {

        double quarters;
        double dimes;
        double nickels;
        double pennies;
        double quartin$;
        double dimein$;
        double nickelin$;
        double pennyin$;

        System.out.println("This program will help you count your change.");
        System.out.print("How many Quarters do you have? : ");
        quarters = TextIO.getlnDouble();
        System.out.print("How many Dimes do you have?    : ");
        dimes = TextIO.getlnDouble();
        System.out.print("How many Nickels do you have?  : ");
        nickels = TextIO.getlnDouble();
        System.out.print("How many Pennies do you have?  : ");
        pennies = TextIO.getlnDouble();

        /* Calculating total amount in Dollar*/

        quartin$ = quarters/4;
        dimein$ = dimes/10;
        nickelin$ = nickels/20;
        pennyin$ = pennies/100;

        System.out.print("You have a total of $");
        System.out.printf("%1.2f\n",quartin$ + dimein$ + nickelin$ + pennyin$);

    }
}
