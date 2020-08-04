public abstract class TuGiac {

    protected Dinh dinhA,dinhB,dinhC,dinhD;
    protected double ChuVi,DienTich;

    public void NhapTT(Dinh GtdinhA,Dinh GtdinhB, Dinh GtdinhC,Dinh GtdinhD ){
        dinhA = GtdinhA;
        dinhB = GtdinhB;
        dinhC = GtdinhC;
        dinhD = GtdinhD;
    }

    protected  abstract void tinhChuVi();
    protected abstract void tinhDienTich();
    protected abstract void tinhDoDaiCanh();

    public void inTT(){
        dinhA.inXY();
        dinhB.inXY();
        dinhC.inXY();
        dinhD.inXY();

        System.out.println("Chu Vi:"+ChuVi);
        System.out.println("Dien Tich"+DienTich);
    }
}
