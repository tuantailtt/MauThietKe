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
public class GiaoVien extends CaNhan{
    String monDay,toBoMon;

    public GiaoVien(String monDay, String toBoMon, String hoTen, String diaChi, String sdt, int tuoi) {
        super(hoTen, diaChi, sdt, tuoi);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    @Override
    public String henThiTT() {
        return super.henThiTT()+"monDay=" + monDay + ", toBoMon=" + toBoMon; //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
