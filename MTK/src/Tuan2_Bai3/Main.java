/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan2_Bai3;

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
         SinhVienPoly svPoLy;
        svPoLy = new SinhVienPoly("PoLy_name", "PoLy") {
            @Override
            public double getDiem() {
                return 5;
            }
        };

        svPoLy.xuat();
        System.out.println("Điểm: " + svPoLy.getDiem() + "\nHọc lực: " + svPoLy.getHocLuc() + "\n");

        SinhVienPoly svIT = new SinhVienIT(3, 4, 5, "IT_Name", "IT");
        svIT.xuat();
        System.out.println("Điểm: " + svIT.getDiem() + "\nHọc lực: " + svIT.getHocLuc() + "\n");

        SinhVienPoly svBiz = new SinhVienBiz(6, 7, "Biz_Name", "Bizzz");
        svBiz.xuat();
        System.out.println("Điểm: " + svBiz.getDiem() + "\nHọc lực: " + svBiz.getHocLuc() + "\n");

    }
    
}
