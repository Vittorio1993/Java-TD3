/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import td3.Tolo;
import td3.SuperTolo;
import td3.Grid;
import td3.Supergrid;

/**
 *
 * @author zhanghuakai
 */
public class Run {
   public static void main(String args[]){
      
       Tolo t1=new Tolo();
       SuperTolo st1=new SuperTolo();
       Grid g1=new Grid(10);
       Supergrid sg1=new Supergrid(10);
       
       
       t1.listtolo();
       //t1.afficher();
       st1.listtolo();
       //s1.afficher();
       g1.gridtolo(2,3,4,5);
       g1.compareorder(t1.get());
       g1.comparenoorder(t1.get());
       sg1.supergridtolo(2,3,4,5,6);
       sg1.compareorder(st1.get());
       sg1.comparenoorder(st1.get());
       
       
   }
    
}
