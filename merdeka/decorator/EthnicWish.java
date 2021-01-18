/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import javafx.scene.image.ImageView;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import merdeka.Merdeka;

public class EthnicWish extends EthnicInterface{

    public EthnicWish() {
	description = "Selamat Hari Merdeka!";
    }

    @Override
    public void setImage(ImageView imageView) {
    }
    
    public static void init( ImageView img1, ImageView img2, ImageView img3, ImageView img4) {
        
        if (img1.isVisible()) {
            img1.yProperty().set(0);
            img1.xProperty().set(20);
        }
       if (img2.isVisible()) {
            img2.yProperty().set(10);
            img2.xProperty().set(-60);
        }
       if (img3.isVisible()) {
            img3.yProperty().set(10);
            img3.xProperty().set(-110);
        }
       if (img4.isVisible()) {
            img4.yProperty().set(10);
            img4.xProperty().set(90);
        }
         
    }

}

