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
public abstract class BannerShow {
    
    private static Boolean status = false;
    BannerOnBehavior bannerOnBehavior;
    BannerOffBehavior bannerOffBehavior;
    
    public BannerShow(){
        
    }
    
    public abstract void display();
    
    public void performingApprove(ImageView imageView){
        this.status = true;
        bannerOnBehavior.BannerLaunch(imageView);
    }
    
    public static Boolean getStatus(){
        return status;
    }
    
    public void performingCancel(ImageView imageView){
        this.status = false;
        bannerOffBehavior.BannerCancel(imageView);
    }
    
    public void setBannerOnBehavior(BannerOnBehavior bob){
        bannerOnBehavior = bob;
    }
    
    public void setBannerOffBehavior(BannerOffBehavior bob) {
        bannerOffBehavior = bob;
    }
}
