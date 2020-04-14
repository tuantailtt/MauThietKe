/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan2_Bai4;

/**
 *
 * @author 84163
 */
public class XeNgoaiThanh extends ChuyenXe{
    String noiDen;
    int soNgayDi;

    public XeNgoaiThanh(String noiDen, int soNgayDi, String maXe, String hoTen, String soXe, double doanhThu) {
        super(maXe, hoTen, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.err.println("Nơi đến: "+this.noiDen);
        System.err.println("Sô ngày đi được: "+this.soNgayDi);
    }
    
}
