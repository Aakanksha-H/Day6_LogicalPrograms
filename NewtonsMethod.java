public class NewtonsMethod {
    public static void main(String[] args) {
        isPerfectSquare(12);
    }

    public static boolean isPerfectSquare(int num) {
        if (num != 0) {
            double newSqrt = sqrt(num, num);
            return ((newSqrt - Math.floor(newSqrt)) == 0);
        }

        return false;
    }

    public static double sqrt(int num, double root) {
        int epsilon = (int) Math.pow(10, -14);
        int tolerance = (int) Math.pow(10, -7);
        if (Math.abs(root) < epsilon)
            return -1.0;

        double new_root = 0.5 * (root + (num / root));

        if (Math.abs(new_root - root) <= tolerance)
            return new_root;

        return sqrt(num, new_root);
    }
}
