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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HangHoa hh1 = new HangHoa("hh1", "moTa1", 1000000);
        HangHoa hh2 = new HangHoa("hh2", "moTa2", 1500000);
        GioHang gioHang1 = new GioHang();
        gioHang1.addGioHang(hh1);
        gioHang1.addGioHang(hh2);
        gioHang1.setHinhThucTT(new ThanhToanCOD());
        System.err.println("Thanh toán COD:\n");
        gioHang1.xuat();
        System.err.println("Tiền hàng: "+ gioHang1.tienHang());
        System.err.println("Số tiền phải trả:"+gioHang1.thanhToan());
        
        
        GioHang gioHang2 = new GioHang();
        gioHang2.addGioHang(hh1);
        gioHang2.addGioHang(hh2);
        gioHang2.setHinhThucTT(new ThanhToanOnline());
        System.err.println("Thanh toán Online:\n");
        gioHang2.xuat();
        System.err.println("Tiền hàng: "+ gioHang2.tienHang());
        System.err.println("Số tiền phải trả:"+gioHang2.thanhToan());
    }
    
}
