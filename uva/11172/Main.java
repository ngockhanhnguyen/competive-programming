import java.util.*;
// import java.io.*;

class Main {
    private static Scanner sc = new Scanner(System.in);
    // private static PrintStream System.out = System.out;

    public static void main(String[] args) {
        int a, b, TC = sc.nextInt();

        while (TC-- > 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a > b)
                System.out.println(">");
            else if (a == b)
                System.out.println("=");
            else
                System.out.println("<");
        }
    }
}
