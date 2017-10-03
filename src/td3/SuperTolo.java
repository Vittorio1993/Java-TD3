/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td3;

/**
 *
 * @author zhanghuakai
 */
public class SuperTolo extends Tolo {
    public SuperTolo(){
    }
    
    @Override
     public void listtolo(){
         while(arraytolo.size()<4){
            Number20 n=new Number20();
             if(!arraytolo.contains(n.get())){
                 arraytolo.add(n.get());
             }
        }
         Number10 n1=new Number10();
         arraytolo.add(n1.get());
    }
    @Override
    public void afficher(){
        for(int i=0;i<arraytolo.size();i++){
            System.out.println(arraytolo.get(i));
        }
    }
}
