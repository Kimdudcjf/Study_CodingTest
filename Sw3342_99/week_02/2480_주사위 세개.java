import java.sql.SQLOutput;
import java.util.Scanner;

class day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int total = 0;
        if (a == b && b == c) {
            total = 10000 + (a * 1000);
        }
        else if (a != b && b != c && a != c) {
            if (a > b) {
                if (a > c) {
                    total = a * 100;
                }
                else {
                    total = c * 100;
                }
            }
            else {
                if (b > c) {
                    total = b * 100;
                }
                else {
                    total = c * 100;
                }
            }
        }
        else if (a == b){
            total = 1000 + (a * 100);
        }
        else if (a == c){
            total = 1000 + (a * 100);
        }
        else if (b == c){
            total = 1000 + (b * 100);
        }

        System.out.println(total);

    }
}