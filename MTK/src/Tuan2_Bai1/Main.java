/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan2_Bai1;

/**
 *
 * @author 84163
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien nv = new NhanVien("Lê Tuấn Tài", "Bình Định", 22, 30000, 212);
        nv.getThongTin(nv);
        System.out.println("Tiền thưởng của nhân viên là : " + nv.tinhThuong(nv));
    }
    
}
