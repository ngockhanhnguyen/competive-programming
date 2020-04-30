import java.util.*;

public class SampleInput {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // getSampleData1();
        // getSampleData2();
        // getSampleData3();
        // getSampleData4();
        getSampleData5();
    }

    public static void getSampleData1() {
        int TC = sc.nextInt();
        int a, b;
        while (TC-- > 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a + b);
        }
    }

    public static void getSampleData2() {
        int a, b;
        while (true) {
            a = sc.nextInt(); 
            b = sc.nextInt();
            if ((a | b) == 0)
                break;
            System.out.println(a + b);
        }
    }

    public static void getSampleData3() {
        int a, b;
        while (sc.hasNext()) {
            a = sc.nextInt(); 
            b = sc.nextInt();
            System.out.println(a + b);
        }
    }

    public static void getSampleData4() {
        int k, ans; 
        while (sc.hasNext()) {
            ans = 0;
            k = sc.nextInt();
            while (k-- > 0) {
                ans += sc.nextInt();      
            }
            System.out.println(ans);
        }
    }

    public static void getSampleData5() {
        Scanner _sc;
        int ans; 
        while (sc.hasNext()) {
            ans = 0;
            _sc = new Scanner(sc.nextLine()).useDelimiter("\\s");
            while (_sc.hasNext()) {
                ans += _sc.nextInt();      
            }
            System.out.println(ans);
        }
    }
}
