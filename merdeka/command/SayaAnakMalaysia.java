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
public class SayaAnakMalaysia {
    
    private static Boolean status = false;
    private static SayaAnakMalaysiaAudio SayaAnakMalaysiaAudio = new SayaAnakMalaysiaAudio();
    
    public void on(){
        status = true;
        System.out.println("The background music is playing on the screen.");
        
        SayaAnakMalaysiaAudio.play();
    }
    
    public void off(){
        status = false;
        System.out.println("The background music is not playing on the screen.");
        
        SayaAnakMalaysiaAudio.stop();
    }
    
    public void on(ImageView imageView){
        status = true;
        System.out.println("The button for playing background music is on the screen.");
        
        imageView.setVisible(true);
        SayaAnakMalaysiaAudio.play();
    }
    
    public void off(ImageView imageView){
        status = false;
        System.out.println("The button for playing background music is not on the screen.");
        
        imageView.setVisible(false);
        SayaAnakMalaysiaAudio.stop();
    }
    
    public Boolean getStatus(){
        return status;
    }
    
}
