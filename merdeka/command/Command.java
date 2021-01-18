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
interface Command {
    
    public void execute();
    public void execute(ImageView imageView);
    
}
