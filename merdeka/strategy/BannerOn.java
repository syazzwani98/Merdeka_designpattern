/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;
import javafx.scene.image.ImageView;
/**
 *
 * @author elyanie
 */
public class BannerOn implements BannerOnBehavior {

    public void BannerLaunch(ImageView imageView){
        System.out.println("The banner is launching on the screen...");
        imageView.setVisible(true);
        
    }
    
}
