/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan2_Bai4;
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
        XeNoiThanh noiThanh1 = new XeNoiThanh(2,15,"ma123","LÊ AAA","so654",54054);
        XeNoiThanh noiThanh2 = new XeNoiThanh(3, 3, "ma231", "Nguyễn B", "so548", 558042);
        XeNoiThanh noiThanh3 = new XeNoiThanh(3, 3, "ma211", "Nguyễn C", "so878", 5001);
        XeNgoaiThanh ngoaiThanh1 = new XeNgoaiThanh("Ninh Hòa",1,"xe123","Lê AAA","so54664",50000);
        XeNgoaiThanh ngoaiThanh2 = new XeNgoaiThanh("tuy Hòa",1,"xe1277","Lê CC","so8748",5840);
        XeNgoaiThanh ngoaiThanh3 = new XeNgoaiThanh("Tây Hòa",1,"xe198","Lê BB","so848",588480);
        QuanLyChuyenXe qlChuyenXe = new QuanLyChuyenXe();
        qlChuyenXe.addChuyenXe(ngoaiThanh1);
        qlChuyenXe.addChuyenXe(ngoaiThanh2);
        qlChuyenXe.addChuyenXe(ngoaiThanh3);
        qlChuyenXe.addChuyenXe(noiThanh1);
        qlChuyenXe.addChuyenXe(noiThanh2);
        qlChuyenXe.addChuyenXe(noiThanh3);
        qlChuyenXe.tongDoanhThu();
    }
    
}
