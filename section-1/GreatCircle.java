public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double r = 6371.0;

        double a = (x2 - x1) / 2.0;
        double ta = Math.sin(a) * Math.sin(a);
        double b = (y2 - y1) / 2.0;
        double tb = Math.cos(x1) * Math.cos(x2) * Math.sin(b) * Math.sin(b);
        double sqr = Math.sqrt(ta + tb);
        double result = 2.0 * r * Math.asin(sqr);
        System.out.println(result + " kilometers");
    }
}
