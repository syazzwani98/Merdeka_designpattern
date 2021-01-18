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
public class BGMOffCommand implements Command {
    SayaAnakMalaysia sam;
    
    public BGMOffCommand(SayaAnakMalaysia sam){
        this.sam = sam;
    }
    
    @Override
    public void execute(){
        sam.off();
    }
    
    @Override
    public void execute(ImageView imageView){
        sam.off(imageView);
    }
    
}
