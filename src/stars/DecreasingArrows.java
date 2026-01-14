package stars;

public class DecreasingArrows {
    public static void main(String[] args) {
        for (int k = 0; k < 17; k++) {
            for (int i = 0; i < 17 - k; i++) {
                System.out.print("-");
            }
            System.out.println(">");
        }
    }
}
