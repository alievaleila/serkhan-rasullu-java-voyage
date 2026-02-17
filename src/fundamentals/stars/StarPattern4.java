package fundamentals.stars;

public class StarPattern4 {
    public static void main(String[] args) {

        for (int k = 0; k < 3; k++) {
            System.out.print("*");
            for (int i = 0; i <4; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
            for (int i = 0; i < 6; i++) {
                System.out.print(" ");
            }
            System.out.println();
            for (int i = 0; i < 6; i++) {
                System.out.print("=");
            }
            for (int i = 0; i <6 ; i++) {
                System.out.print(" ");
            }
            System.out.println();
            for (int i = 0; i < 6; i++) {
                System.out.print("=");
            }
            System.out.println();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }


    }
}
