import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=Math.round(a/2);
        for (int i = 0; i < b; i++) {

            for (int j = b-i; j >1 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = b-i; j >=1 ; j--) {
                System.out.print("* ");
            }


            System.out.println();
        }
    }
}
