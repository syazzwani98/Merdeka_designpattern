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
public class FiresUpFireworks implements State {
    
    ImageView fireworks_gif;
    
    private final BungaApi firePop;
    
    public FiresUpFireworks(ImageView fireworks_gif,  BungaApi firePop){
        this.fireworks_gif = fireworks_gif;
        this.firePop = firePop;
    }
    
    public void FireworksSwitch(){
        System.out.println("Fireworks is fires up...");
        fireworks_gif.setVisible(true);
        firePop.changeState(firePop.NoFireworks());
    }
    
}
