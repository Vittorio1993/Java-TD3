/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td3;
//import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author zhanghuakai
 */
public class Tolo {
    ArrayList<Integer> arraytolo;
    
    public Tolo(){
        arraytolo=new ArrayList<>();
    }
    public void listtolo(){
        
        //Random l=new Random();
        Integer n;
        while(arraytolo.size()<4){
             n=(int)(Math.random()*20+1);
             if(!arraytolo.contains(n)){
                 arraytolo.add(n);
              
             }
        }
    }
    
    public void afficher(){
        for(int i=0;i<arraytolo.size();i++){
            System.out.println(arraytolo.get(i));
        }
    }
}
