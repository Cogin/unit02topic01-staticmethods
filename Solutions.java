public class Solutions {

    public static int max3(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    //overload version
    public static double max3(double a, double b, double c) {
        return Math.max(Math.max(a, b), c);
    }
    
    public static boolean odd (boolean a, boolean b, boolean c) {
        int count = 0;
        if (a) count++;
        if (b) count++;
        if (c) count++;
        return count%2 == 1;
    }

    public static boolean majority (boolean a, boolean b, boolean c) {
        return (a&&b || a&&c || b&&c);
    }

    public static double trigIdentity(double x) {
        return Math.pow(Math.sin(x), 2) + Math.pow(Math.cos(x), 2);
    }
    
    public static void main(String[] args) {
        System.out.println(max3(1, 2, 3));
        System.out.println(max3(1.0, 2.0, 3.0));
        System.out.println(odd(true, false, false));
        System.out.println(majority(false, true, true));
        System.out.println(trigIdentity(Math.sin(Math.PI)));
    }
}
// good