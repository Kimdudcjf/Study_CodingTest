package week_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        String[] keyboard = {
                "`", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "=",
                "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", "\\",
                "A", "S", "D", "F", "G", "H", "J", "K", "L", ";", "'",
                "Z", "X", "C", "V", "B", "N", "M", ",", ".", "/"
        };

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        String input;
        while ((input = bf.readLine()) != null) {

            String[] inputStr = input.split("");
            StringBuilder builder = new StringBuilder();

            for (String s : inputStr) {
                if (s.equals(" ")) {
                    builder.append(s);
                    continue;
                }
                for (int i = 0; i < keyboard.length; i++) {
                    if (keyboard[i].equals(s)) {
                        builder.append(keyboard[i - 1]);
                        break;
                    }
                }
            }
            System.out.println(builder);
            builder.append("\n");
        }
    }
}
