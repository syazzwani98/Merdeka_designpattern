/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import javafx.scene.image.ImageView;

public class Chinese extends Ethnic{

    EthnicInterface x;

    public Chinese(EthnicInterface newEthnicWish) {
        this.x = newEthnicWish;
    }

    @Override
    public String getDescription() {
        return x.getDescription() + ", Chinese";

    }

    @Override
    public void setImage(ImageView imageView) {
        if (!imageView.isVisible()) {
            imageView.setVisible(true);
        } else {
            imageView.setVisible(false);
        }
    }

}