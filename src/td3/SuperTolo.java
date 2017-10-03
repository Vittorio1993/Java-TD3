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
        Integer n;
        while(arraytolo.size()<5){
             n=(int)(Math.random()*20+1);
             if(!arraytolo.contains(n)){
                 arraytolo.add(n);
              
             }
        }
    }
    @Override
    public void afficher(){
        for(int i=0;i<arraytolo.size();i++){
            System.out.println(arraytolo.get(i));
        }
    }
}
