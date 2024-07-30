import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b= Math.round(sc.nextInt()/2);
        for (int i = 0; i < b; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 0; i < b; i++) {

            for (int j = b-i; j >0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
