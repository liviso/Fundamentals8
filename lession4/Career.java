
package lession4;

import javax.swing.JOptionPane;

public class Career {
    
    public void showCareer(){
        
         String career=JOptionPane.showInputDialog("Ingresa tu carrera");
        
         int credits=Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero de creditos: "));
        
         JOptionPane.showMessageDialog(null,"La carrera en "+career+"\n consta de "+credits+" creditos");
    }
    
    public static void main (String args[]){
        new Career().showCareer();
    }
      
}
