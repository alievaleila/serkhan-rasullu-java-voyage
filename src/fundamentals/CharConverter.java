package fundamentals;

import java.util.Scanner;

public class CharConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char lowerCaseChar=sc.nextLine().toLowerCase().charAt(0);
        char upperCaseChar=(char)(lowerCaseChar-32);
        System.out.println(upperCaseChar);
    }
}
