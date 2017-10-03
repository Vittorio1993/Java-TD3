/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td3;
import java.util.ArrayList;

/**
 *
 * @author zhanghuakai
 */
public class Grid {
    protected ArrayList<Integer> lstgrid;
    protected Integer mise;
    protected Integer number;
    protected Integer reward;
    public Grid(Integer m){
    mise=m;
    lstgrid=new ArrayList<>();  
}
     public ArrayList<Integer> get(){
        return lstgrid;
    }
    public void gridtolo(Integer a,Integer b,Integer c,Integer d){
        lstgrid.add(a);
        lstgrid.add(b);
        lstgrid.add(c);
        lstgrid.add(d);
    }
    public void compareorder(ArrayList lsttolo){
        Integer n=0;
        for (int i=0;i<lsttolo.size();i++){
            if(lsttolo.get(i)==lstgrid.get(i)){
                n=n+1;
            }
        }
        if (n==3){
            reward=mise*5;
         }
         else if(n==5){
             reward=mise*50;
         }
         else{
             reward=0;
         }
         System.out.println(n+" "+reward);
        
        //return n;       
    }
    public void comparenoorder(ArrayList lsttolo){
        Integer n=0;
        for (int i=0;i<lsttolo.size();i++){
            if(lsttolo.contains(lstgrid.get(i))){
                n=n+1;
            }
        }
        switch (n) {
            case 3:
                reward=mise*5;
                break;
            case 5:
                reward=mise*50;
                break;
            default:
                reward=0;
                break;
        }
         System.out.println(n+" "+reward);
    }
    
}
