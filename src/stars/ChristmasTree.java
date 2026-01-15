package stars;

public class ChristmasTree {
    public static void main(String[] args) {

        for (int k= 1; k < 6; k++) {
            for (int i = 1; i <=6-k; i++) {
            System.out.print(" ");
            }
            for (int j = 1; j <=(2 * k - 1); j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
