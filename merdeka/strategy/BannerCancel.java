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
public class BannerCancel implements BannerOffBehavior {

    @Override
    public void BannerCancel(ImageView imageView) {
        System.out.println("The banner is not launching...");
        imageView.setVisible(false);
    }
    
}
