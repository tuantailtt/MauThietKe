/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan2_BaitapOOP;

/**
 *
 * @author 84163
 */
public class HocSinh extends CaNhan{
    String lop,nangKhieu;

    public HocSinh(String lop, String nangKhieu, String hoTen, String diaChi, String sdt, int tuoi) {
        super(hoTen, diaChi, sdt, tuoi);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    @Override
    public String henThiTT() {
        return super.henThiTT()+"lop=" + lop + ", nangKhieu=" + nangKhieu; //To change body of generated methods, choose Tools | Templates.
        
    }

    
    
    
}
