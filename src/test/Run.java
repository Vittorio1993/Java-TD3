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
import td3.Player;

/**
 *
 * @author zhanghuakai
 */
public class Run {
   public static void main(String args[]){
      
       Tolo t1=new Tolo();
       SuperTolo st1=new SuperTolo();
       t1.listtolo();
       st1.listtolo();
       
       Grid g1=new Grid(10,1);
       Grid g2=new Grid(15,2);
       Supergrid sg1=new Supergrid(10,1);
       Supergrid sg2=new Supergrid(20,2);
       
       Player p1=new Player();
       p1.PlayTolo(g1);
       p1.PlayTolo(g2);
       p1.PlaySuperTolo(sg1);
       p1.PlaySuperTolo(sg2);
       
       g1.gridtolo(2,3,4,5);
       g1.comparenoorder(t1.get());
       
       g2.gridtolo(5,7,9,14);
       g2.comparenoorder(t1.get());
       
       sg1.supergridtolo(2, 3, 4, 5, 6);
       sg1.comparenoorder(st1.get());
       
       sg2.supergridtolo(6, 3, 4, 5, 10);
       sg2.comparenoorder(st1.get());
       
       System.out.println("The number of tolo is : ");
       t1.afficher();
       System.out.println("The number of supertolo is : ");
       st1.afficher();
       
       
       p1.displayTolo();
       p1.displaySuperTolo();
       
       
       
       
       
       
   }
    
}
