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
public class ThanhToanOnline implements  IThanhToan{

    @Override
    public double thanhToan(int tienHang) {
        if(tienHang < 1000000) return tienHang*0.95;
        return tienHang*0.93;
    }
    
}
