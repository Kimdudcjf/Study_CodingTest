import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, w, h;
        int result = 0;
        x = sc.nextInt();
        y = sc.nextInt();
        w = sc.nextInt();
        h = sc.nextInt();
        // x축 최단거리
        if (x > w - x) {
            x = w - x;
        }
        // y축 최단거리
        if (y > h - y) {
            y = h - y;
        }

        System.out.println(x < y ? x : y);
    }
}