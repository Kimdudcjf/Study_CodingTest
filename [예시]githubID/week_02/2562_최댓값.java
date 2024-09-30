import java.util.*;

public class Main {
    public static void main(String[] args) {
        //9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);

        //입력받은 수를 저장할 배열
        int arr[]=new int[9];

        //자연수 입력받기
        for(int i=0; i<9; i++) {
            arr[i]=sc.nextInt();
        }

        int tmp = arr[0];
        int idx=0; //최댓값의 idx


        for(int i=0; i<arr.length; i++) {
            if(tmp < arr[i]) {
                tmp = arr[i];
                idx = i;
            }
        }
        System.out.println(tmp);
        System.out.println(idx+1);

    }
}

