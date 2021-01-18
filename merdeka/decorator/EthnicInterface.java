/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import javafx.scene.image.ImageView;

/**
 *
 */
public abstract class EthnicInterface {
    
    String description = " ";

    public String getDescription() {
	return description;
    }
    public abstract void setImage(ImageView imageView);

}

