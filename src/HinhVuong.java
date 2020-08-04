public class HinhVuong extends TuGiac {

    private double doDaiCanh;

    @Override
    public void tinhDoDaiCanh() {
        double powX,powY;

        powX = Math.pow(dinhA.getX() - dinhB.getX(), 2);
        powY = Math.pow(dinhA.getY() - dinhB.getY(), 2);
        doDaiCanh = Math.sqrt(powX + powY);

    }

    @Override
    protected void tinhChuVi() {
        ChuVi = doDaiCanh * 4;
    }


    @Override
    protected void tinhDienTich() {
        DienTich = doDaiCanh * doDaiCanh;
    }
}
