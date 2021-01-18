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
public class RemoteLoader {
    
    public static void init(ImageView Button1Image){
        RemoteControl remote = new RemoteControl();
        SayaAnakMalaysia sam = new SayaAnakMalaysia();
        BGMOnCommand BGMOn = new BGMOnCommand(sam);
        BGMOffCommand BGMOff = new BGMOffCommand(sam);
        
        
        remote.setCommand(sam.getStatus() ? BGMOff : BGMOn);
        remote.buttonPressed(Button1Image);
    }
}
