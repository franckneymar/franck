/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ReadFile;

/**
 *
 * @author denise
 */
public class MachineEvent  {
    
    private String name ;
    private int id ;
    private int amount ;

    public MachineEvent(String name, int id, int amount) {
        this.name = name;
        this.id = id;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }
    
       
    
}
