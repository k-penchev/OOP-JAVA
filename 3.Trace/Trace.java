public class Trace {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};

        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        b[1] = 20;
        int t = a[0] + a[1];
        System.out.println(t + " " + a.length);
    }
}