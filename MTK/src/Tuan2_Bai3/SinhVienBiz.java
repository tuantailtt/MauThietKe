/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan2_Bai3;

/**
 *
 * @author 84163
 */
public class SinhVienBiz extends SinhVienPoly{
    double diemMarketing,diemSale;

    public SinhVienBiz(double diemMarketing, double diemSale, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSale = diemSale;
    }
    
    @Override
    public double getDiem() {
        return (this.diemMarketing*2+this.diemSale)/3;
    }
    
}
