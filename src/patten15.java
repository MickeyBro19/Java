import java.util.Scanner;

public class patten15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (char j = 'A'; j <='A'+a-i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}




















