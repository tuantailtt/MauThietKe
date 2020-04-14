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
public abstract class ChuyenXe {
    String maXe,hoTen,soXe;
    double doanhThu;

    public ChuyenXe(String maXe, String hoTen, String soXe, double doanhThu) {
        this.maXe = maXe;
        this.hoTen = hoTen;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    public ChuyenXe(){}
    public void xuat(){
        System.err.println("Mã xe: "+ this.maXe);
        System.err.println("Họ tên tài xê: "+ this.hoTen);
        System.err.println("Sô xe: "+ this.soXe);
        System.err.println("Doanh thu: "+this.doanhThu);
    }
}
