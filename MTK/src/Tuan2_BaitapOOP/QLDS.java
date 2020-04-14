/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan2_BaitapOOP;
import java.util.ArrayList;
import Tuan2_BaitapOOP.CaNhan;

/**
 *
 * @author 84163
 */
public class QLDS implements IQLDS{
    ArrayList<CaNhan> ds= new ArrayList();
    @Override
    public int them(CaNhan p) {
        this.ds.add(p);
        return 1;
    }

    @Override
    public int xoa(String ten) {
        for(int i =0 ; i< ds.size();i++)
            if(ds.get(i).hoTen == ten){
                ds.remove(i);
                break;
            }
        return 1;
    }

    @Override
    public void inDS() {
        for(int i =0 ; i< ds.size();i++)
            ds.get(i).henThiTT();
    }
    
}
