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
public abstract class CaNhan {
    String hoTen,diaChi,sdt;
    int tuoi;

    public CaNhan(String hoTen, String diaChi, String sdt, int tuoi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String henThiTT(){
        return  "hoTen=" + hoTen + ", diaChi=" + diaChi + ", sdt=" + sdt + ", tuoi=" + tuoi ;
    }

   
    
    
}
