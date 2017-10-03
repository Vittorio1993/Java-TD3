/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import td3.Tolo;
import td3.SuperTolo;

/**
 *
 * @author zhanghuakai
 */
public class Run {
   public static void main(String args[]){
       Tolo t1=new Tolo();
       SuperTolo s1=new SuperTolo();
       
       t1.listtolo();
       t1.afficher();
       s1.listtolo();
       s1.afficher();
       
   }
    
}
