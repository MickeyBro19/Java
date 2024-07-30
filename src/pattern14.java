import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (char j = 'A'; j <='A'+i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
