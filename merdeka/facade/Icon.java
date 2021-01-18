/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;
import javafx.scene.image.ImageView;
/**
 *
 * @author elyanie
 */
public class Icon {
    ImageView c1;
    static boolean showIcon = false;
    
    public Icon(ImageView c1){
        this.c1 = c1;
    }
    
    public void setIcon(){
        if(showIcon){
            c1.setVisible(false);
            showIcon = false;
        }else{
            c1.setVisible(true);
            showIcon = true;
        }
    }
    
    
}
