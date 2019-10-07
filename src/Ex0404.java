/**
 * This program uses a subroutine of previous program Ex0403 i.e. dRoll
 * and it just computes the average number of rolls to get a sum of num-
 * -bers of two particular dice rolled simultaneously.
 * */

public class Ex0404 {

    static double sum = 0;
    static int L;
    public static void main(String[] args){
        System.out.println("Write the sum you wanna get by rolling Two dice : ");
        L = TextIO.getlnInt();
        System.out.println("Total On Dice        Average Number Of Rolls");
        System.out.println("-------------        -----------------------");
        System.out.print("    ");
        System.out.print(L);
        System.out.print("                       ");
        System.out.println(avgNroll(L));
    }

    static double avgNroll(int L){
        int i = 0;
        while (i<10000){
            sum = sum +Ex0403.dRoll(L);
            i++;
        }
        return sum/10000;
    }

}
