/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujibus;

/**
 *
 * @author WILLIAM
 */
public class Bus {
    private int penumpang, maxpenumpang;
    
    public Bus (int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }
    
    public void addpenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if(temp>=maxpenumpang){
            System.out.println("penumpang melebihi batas");
        }else{
    this.penumpang=temp;        
        }
    }
    
    public void cetak (){
        System.out.println("penumpang : "+penumpang);
        System.out.println("Maksimal Penumpang : "+maxpenumpang);
    }
}
