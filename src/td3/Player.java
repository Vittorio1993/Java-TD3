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
public class Player {
    private ArrayList<Grid> lstgrid;
    private ArrayList<Supergrid> lstsupergrid;
    
    public Player(){
        lstgrid =new ArrayList<>();
        lstsupergrid =new ArrayList<>();
    }
    
    public void PlayTolo(Grid g){
        if(!lstgrid.contains(g)){
             lstgrid.add(g);
        }
    }
    
    public void PlaySuperTolo(Supergrid g){
        if(!lstsupergrid.contains(g)){
             lstsupergrid.add(g);
        }
    }
    public void displayTolo(){
        for(int i=0;i<lstgrid.size();i++){
            System.out.println("The grid "+lstgrid.get(i).getnumber()+" your mise is "+lstgrid.get(i).getmise()
                    +", you have "+lstgrid.get(i).numbercorrect+" number correct, you win "+lstgrid.get(i).getreward());
        }
        
    }
    
    public void displaySuperTolo(){
        for(int i=0;i<lstsupergrid.size();i++){
            System.out.println("The supergrid "+lstsupergrid.get(i).getnumber()+" your mise is "+lstsupergrid.get(i).getmise()
                    +", you have "+lstsupergrid.get(i).numbercorrect+" number correct, the supernumber is "+lstsupergrid.get(i).getsupernumber()+", you win "+lstsupergrid.get(i).getreward());
        }
        
    }
}
