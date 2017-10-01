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
    public Grid(Integer m){
    mise=m;
    lstgrid=new ArrayList<>();
}
    public void gridtolo(Integer a,Integer b,Integer c,Integer d){
        lstgrid.add(a);
        lstgrid.add(b);
        lstgrid.add(c);
        lstgrid.add(d);
    }
    
}
