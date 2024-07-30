import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int num=1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
