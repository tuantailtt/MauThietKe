/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author 84163
 */
public class HangHoa {
    String tenHH,moTa;
    int gia;

    public HangHoa(){};
    public HangHoa(String tenHH, String moTa, int gia) {
        this.tenHH = tenHH;
        this.moTa = moTa;
        this.gia = gia;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getTenHH() {
        return tenHH;
    }

    public String getMoTa() {
        return moTa;
    }

    public int getGia() {
        return gia;
    }

    @Override
    public String toString() {
        return   tenHH +"\n";
    }

   

    
    
}
