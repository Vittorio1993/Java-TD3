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
    protected ArrayList<Integer> arraytolo;
    
    public Tolo(){
        arraytolo=new ArrayList<>();
    }
    
    public ArrayList<Integer> get(){
        return arraytolo;
    }
    public void listtolo(){
       while(arraytolo.size()<4){
            Number20 n=new Number20();
             if(!arraytolo.contains(n.get())){
                 arraytolo.add(n.get());
             }
        }
    }
    
    public void afficher(){
        for(int i=0;i<arraytolo.size();i++){
            System.out.println(arraytolo.get(i));
        }
    }
}
