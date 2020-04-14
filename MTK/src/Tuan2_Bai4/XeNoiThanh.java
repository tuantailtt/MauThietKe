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
public class XeNoiThanh extends ChuyenXe{
    int soTuyen,soKm;

    public XeNoiThanh(int soTuyen, int soKm, String maXe, String hoTen, String soXe, double doanhThu) {
        super(maXe, hoTen, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.err.println("Số tuyến :"+this.soTuyen);
        System.err.println("Số km đi được:"+this.soKm);
    }
    
}
