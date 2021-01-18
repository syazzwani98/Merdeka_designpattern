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
public class BungaApi {
    
    private State explode;
    private State notExplode;
    private State state;
    ImageView gif;
    
    public BungaApi(ImageView gif){
        this.gif = gif;
        explode = new FiresUpFireworks(gif, this);
        notExplode = new NoFireworks(gif, this);
        state = explode;
    }
    
    public State getState(){
        return this.state;
    }
    
    public void changeState(State state){
        this.state = state;
    }
    
    public void FireworksSwitch(){
        state.FireworksSwitch();
    }
    
    public State explode(){
        return explode;
    }
    
    public State NoFireworks(){
        return notExplode;
    }
    
}
