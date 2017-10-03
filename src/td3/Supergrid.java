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
public class Supergrid extends Grid{
    
    
    public Supergrid(Integer m) {
        super(m);
    }
    
    public void supergridtolo(Integer a,Integer b,Integer c,Integer d, Integer e){
        lstgrid.add(a);
        lstgrid.add(b);
        lstgrid.add(c);
        lstgrid.add(d);
        lstgrid.add(e);
    }
    
}
