public class Ex0203 {
    public static void main(String[] args) {

        String User;

        System.out.print("Good Morning! ");
        System.out.print("Please type your Name:");

        User = TextIO.getln(); // Asks for user input his/her name.

        System.out.print("Hello, " + User.toUpperCase() + ",nice to meet you!");

    }
}
