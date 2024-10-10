import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int A, B;
        String str;

        for (int i = 0; i < T; i++) {
            str = br.readLine();
            A = Integer.parseInt(str.split(" ")[0]);
            B = Integer.parseInt(str.split(" ")[1]);
            bw.write(A + B + "\n");
        }
        bw.flush();
    }
}