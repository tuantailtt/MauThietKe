/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;
import bai2.IThanhToan;
import bai2.GioHang;
import java.util.ArrayList;
/**
 *
 * @author 84163
 */
public class GioHang {
    IThanhToan hinhThucTT;
    
    ArrayList<HangHoa> dshh = new ArrayList<>();
    public void addGioHang(HangHoa hangHoa){
        dshh.add(hangHoa);
    }
    public void xuat(){
        System.err.println("Danh sách hàng hóa:\n");
         for(int i =0 ; i< dshh.size();i++)
             System.err.println(dshh.get(i).toString());
         System.err.println("\n"); 
    }
    public GioHang(){};
    
    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    public int tienHang(){
        int tongTien=0;
        for(int i =0 ; i< dshh.size();i++)
            tongTien+=dshh.get(i).gia;
        return tongTien;
    }
    public double thanhToan(){
        
        double tienTra=0;
        tienTra = hinhThucTT.thanhToan(tienHang());
        return tienTra;
    };
}
