/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan2_Bai2;

import Tuan2_Bai1.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author 84163
 */
public class QuanLyNhanVien implements IQuanLy{

    ArrayList<NhanVien> nhanVien = new ArrayList();
    @Override
    public void them(NhanVien nv) {

        this.nhanVien.add(nv);
    }

    @Override
    public void inDS() {
        int length = nhanVien.size();
        for (int i = 0; i < length; ++i) {
            int stt = i+1;
            System.out.println("Nhân viên thứ : " + stt);
            nhanVien.get(i).getThongTin(nhanVien.get(i));
            System.out.println("\n ------------------");
        }
    }
}
