import javax.xml.transform.stream.StreamSource;

public class HinhChuNhat extends TuGiac {

    private double ChieuDai,ChieuRong;
    @Override
    protected void tinhDoDaiCanh() {

        double powX = Math.pow(dinhA.getX() - dinhB.getX(),2);
        double powY = Math.pow(dinhA.getY() - dinhB.getY(),2);
        ChieuRong = Math.sqrt(powX+powY);


        powX = Math.pow(dinhC.getX() - dinhD.getX(),2);
        powY = Math.pow(dinhC.getY() - dinhD.getY(),2);
        ChieuDai = Math.sqrt(powX+powY);

    }
    @Override
    protected void tinhChuVi() {
        ChuVi = (ChieuDai+ChieuRong)*2;

    }

    @Override
    protected void tinhDienTich() {
        DienTich = ChieuDai*ChieuRong;
    }



    @Override
    public void inTT() {
        super.inTT();
        System.out.println("Chieu Dai: "+ChieuDai);
        System.out.println("Chieu Rong: "+ChieuRong);
    }
}
