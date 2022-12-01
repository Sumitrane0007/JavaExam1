public class Greatest {
    public static void main(String args[]) {
        int a, b, c;
        a = 8;
        b = 4;
        c = 11;

        if (a > b) {
            if (a > c) {
                System.out.print(a);
            } else {
                System.out.print(c);
            }
        } else {
            if (b > c) {
                System.out.print(b);
            } else {
                System.out.print(c);
            }
        }
        System.out.print(" is the greatest number.");
    }
}