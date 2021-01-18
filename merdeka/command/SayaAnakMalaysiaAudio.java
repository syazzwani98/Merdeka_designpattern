/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;
import javafx.scene.media.Media;
import javafx.scene.media.AudioClip;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
import java.io.File;
/**
 *
 * @author elyanie
 */
public class SayaAnakMalaysiaAudio {
    
    private static Boolean loop = false;
    private static final String path = "./src/media/Saya Anak Malaysia 2020mp3.mp3";
    private static final Media media = new Media(new File(path).toURI().toString());
    private static final MediaPlayer audio = new MediaPlayer(media);
    
    public SayaAnakMalaysiaAudio(){
        
    }
    
    public static void play(){
        if(loop){
            audio.setOnEndOfMedia(new Runnable(){
            @Override
            public void run(){
                audio.seek(Duration.ZERO);
            }
        });
        }
        
        audio.play();
    }
    
    public static void stop(){
        audio.stop();
    }
    
}
