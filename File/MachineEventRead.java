/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ReadFile;

import it.unipv.vm.model.Product;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author denise
 */
public class MachineEventRead {
    
   private Product product;
   private Iterator<MachineEvent> machineEvent ;

    public MachineEventRead(Product product) {
        this.product = product;
    }
      
       public boolean ready(){
       
          if(MachineEvent != null) return true;
          return false;
       
       }
       

       public void acquisisciEvent(File f) throws IOException , ParseException{
         
           List<MachineEvent> machineEvents = new  ArrayList<>();
           
            BufferedReader br = new BufferedReader(new FileReader(f));
            
             while(br.ready()){
             
                  String[] ls = br.readLine().split("\t");
                  
                 int id  =  Integer.parseInt(ls[1]);
                  int amount = Integer.parseInt(ls[2]);
                  
                 machineEvents.add(new MachineEvent(ls[0], id, amount));
             
             }      
             
                 machineEvent = machineEvents.iterator();
                         
         
         }
          
       
           
}
