import java.util.*;
import java.lang.Math;

public class Program Delpro {
    public static void main(String[] args) {
        int a, b;
        String text;

        for (a = 0; a <= 4; a++) {
            text = "";
            for (b = 4; b >= a; b--) {
                text = text + "";
            }
            for (b = 0; b >= a; b--) {
                text = text + "*";
            }
            for (b = a - 1; b >= 0; b--) {
                text = text + "*";
            }
            System.out.println(text);
        }
    }
}
