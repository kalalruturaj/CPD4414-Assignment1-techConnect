/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment1.techconnect;

/**
 *
 * @author Ruturaj Kalal
 */
public class CPD4414Assignment1TechConnect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
 /**
 *
 * @author Cyril Dsouza
 */
    public static String stringPower(String str, int number){
        String power = "";
        
        
        // Added by Gurvinder kaur
        if(str==""){
            System.out.println("Empty String");
            power = str;
        } 
            
        // Added by Ruturaj Kalal
        
        if(number<1){
            power= null;
        }     
        
        // Added by Cyril dsouza
        if(number==1){
            power = str;
           
        }
        
        // Added by Gurvinder Kaur
        
        
           if(number==2){
            power = str+str;
           
        }
           
                
        return power;
        
        
    }
    
    
    
}
