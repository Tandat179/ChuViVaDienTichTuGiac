public class Main {
    public static void main(String[]args){

        Dinh dinhA = new Dinh();
        dinhA.nhapXY(0,0);

        Dinh dinhB = new Dinh();
        dinhB.nhapXY(0,10);

        Dinh dinhC = new Dinh();
        dinhC.nhapXY(10,20);

        Dinh dinhD = new Dinh();
        dinhD.nhapXY(10,0);

        HinhChuNhat hinhVuong = new HinhChuNhat();
        hinhVuong.NhapTT(dinhA,dinhB,dinhC,dinhD);
        hinhVuong.tinhDoDaiCanh();
        hinhVuong.tinhChuVi();
        hinhVuong.tinhDienTich();
        hinhVuong.inTT();
    }
}

