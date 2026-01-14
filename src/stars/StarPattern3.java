package stars;

public class StarPattern3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5; j++) {
                if(j==0||j==4){
                    System.out.print("*");
                } else if (j==1||j==3) {
                    System.out.print(" ");
                } else if (j==2) {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
