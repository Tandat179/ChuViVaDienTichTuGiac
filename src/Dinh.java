public class Dinh {

    private double x, y;

    public void nhapXY(double gtx, double gty) {
        x = gtx;
        y = gty;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void inXY() {
        System.out.println("X=" + x + "Y=" + y);
    }
}
