package Util;

public class Utils {
    public static void main(String[] args) {
        double [] a = {0.21,0.21,0.30,0.30,0.56,0.60,0.73,0.77,0.79,0.84,0.88,0.88,0.92,0.94,0.96,0.96,1.01,1.03};
        double [] b = {0.01,0.60,-0.05,0.30,0.77,0.58,0.63,0.62,0.76,0.88,1.16,0.68,0.84,0.73,0.86,0.82,1.11,0.92};
        System.out.println(getCOF(a, b));
    }

    private static double getAverage(double [] a) {
        float sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum/a.length;
    }

    private static double getVariance(double [] a) {
        double average = getAverage(a);
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += Math.pow(a[i] - average, 2);
        }
        return sum;
    }

    private static double getCOF(double [] a, double [] b) {
        double sum = 0;
        double average1 = getAverage(a);
        double average2 = getAverage(b);
        double variance = Math.sqrt(getVariance(a)/a.length);
        double variance2 = Math.sqrt(getVariance(b)/b.length);
        for (int i = 0; i < a.length; i++) {
            sum += (a[i] - average1)*(b[i] - average2);
        }
        return  sum/(a.length*variance*variance2);
    }
}
