/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;
import javafx.scene.image.ImageView;
/**
 *
 * @author elyanie
 */
public class RemoteControl {
    Command slot;
    
    public RemoteControl(){ //constructor
        
    }
    
    public void setCommand(Command command){
        slot = command;
    }
    
    public void buttonPressed(){
        slot.execute();
    }
    
    public void buttonPressed(ImageView imageView){
        slot.execute(imageView);
    }
    
}
