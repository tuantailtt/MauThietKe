/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan2_Bai2;

import Tuan2_Bai1.NhanVien;

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
        IQuanLy qlnv = new QuanLyNhanVien();
        NhanVien nv1 = new NhanVien("Lê Tuấn Tài 1", "Bình Đinh", 22, 21000, 200);
        NhanVien nv2 = new NhanVien("Lê Tuấn Tài 2", "Bình Đinh", 22, 22000, 212);
        NhanVien nv3 = new NhanVien("Lê Tuấn Tài 3", "Bình Đinh", 22, 23000, 252);
        NhanVien nv4 = new NhanVien("Lê Tuấn Tài 4", "Bình Đinh", 22, 24000, 292);
        NhanVien nv5 = new NhanVien("Lê Tuấn Tài 5", "Bình Đinh", 22, 25000, 192);
        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.them(nv5);
        qlnv.inDS();
    }
    
}
