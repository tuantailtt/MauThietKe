/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan2_Bai4;
import java.util.ArrayList;
/**
 *
 * @author 84163
 */
public class QuanLyChuyenXe {
    ArrayList<ChuyenXe> dsChuyenXe = new ArrayList();
    public QuanLyChuyenXe(){};
    public void addChuyenXe(ChuyenXe chuyenXe){
        this.dsChuyenXe.add(chuyenXe);
    }
    public void xuatDs(){
        for(int i = 0; i< dsChuyenXe.size();i++){
            dsChuyenXe.get(i).xuat();
            System.err.println("\n --------------");
        }
    }
    public void doanhThuNoiNgoai(){
       double tongDTNoi = 0,
              tongDTNgoai = 0;
       for(int i = 0; i< dsChuyenXe.size();i++){
           if(dsChuyenXe.get(i) instanceof XeNoiThanh)
               tongDTNoi += dsChuyenXe.get(i).doanhThu;
           else if(dsChuyenXe.get(i) instanceof XeNgoaiThanh)
               tongDTNgoai += dsChuyenXe.get(i).doanhThu;
        }
        System.err.println("Tổng doanh thu xe nội thành: "+ tongDTNoi);
        System.err.println("Tổng doanh thu xe ngọai thành: "+ tongDTNgoai);
    }
    public void tongDoanhThu(){
        double tongDT=0;
         for(int i = 0; i< dsChuyenXe.size();i++){
           tongDT += dsChuyenXe.get(i).doanhThu;
        }
         System.err.println("Tổng doanh thu của cả 2 loại:"+ tongDT);
    }
}
