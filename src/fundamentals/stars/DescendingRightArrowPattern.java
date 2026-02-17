package fundamentals.stars;

public class DescendingRightArrowPattern {
    public static void main(String[] args) {
        for (int i = 0; i <17 ; i++) {
            for (int j = 0; j < 17-i; j++) {
                System.out.print("-");
            }
            System.out.println(">");
            for (int j = 0; j <i+1; j++) {
                System.out.print(" ");
            }
        }
    }
}
