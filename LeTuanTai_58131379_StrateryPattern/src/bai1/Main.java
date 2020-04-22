/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;
import bai1.ITinh;
import bai1.Cong;
import bai1.Tru;
import bai1.Nhan;
import bai1.Chia;
import bai1.Context;
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
        Context conTextC = new Context();
        conTextC.setTinhToan(new Cong());
        System.err.println("Kết quả cộng: "+ conTextC.tinh(1,5));
        
        Context conTextT = new Context();
        conTextT.setTinhToan(new Tru());
        System.err.println("Kết quả trừ: "+ conTextT.tinh(1,5));
        
        Context conTextN = new Context();
        conTextN.setTinhToan(new Nhan());
        System.err.println("Kết quả nhân: "+ conTextN.tinh(1,5));
        
        Context conTextCh = new Context();
        conTextCh.setTinhToan(new Chia());
        System.err.println("Kết quả chia: "+ conTextCh.tinh(1,5));
    }
    
}
