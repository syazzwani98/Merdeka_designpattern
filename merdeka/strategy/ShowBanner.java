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
public class ShowBanner {
    
    public static void init(ImageView ban){
        BannerShow banner = new Banner();
        
        if(banner.getStatus()){
            banner.performingCancel(ban);
        }else{
            banner.performingApprove(ban);
        }
    }
}
