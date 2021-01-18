/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;
import javafx.scene.image.ImageView;
/**
 *
 * @author elyanie
 */
public class NoFireworks implements State {
    
    ImageView fireworks_gif;
    BungaApi firePop;
    
    public NoFireworks(ImageView fireworks_gif, BungaApi firePop){
        this.fireworks_gif = fireworks_gif;
        this.firePop = firePop;
    }
    
    @Override
    public void FireworksSwitch(){
        System.out.println("Fireworks end...");
        fireworks_gif.setVisible(false);
        firePop.changeState(firePop.explode());
    }
    
}
