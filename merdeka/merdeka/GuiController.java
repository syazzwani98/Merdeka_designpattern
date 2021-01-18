/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merdeka;

import command.RemoteLoader;
import decorator.SabahSarawak;
import decorator.EthnicWish;
import decorator.EthnicInterface;
import decorator.Indian;
import decorator.Chinese;
import decorator.Malay;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import strategy.ShowBanner;
import facade.Icon;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import strategy.ShowBanner;
import facade.Icon;
import state.*;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author elyanie
 */
public class GuiController implements Initializable {

    EthnicInterface x = new EthnicWish();
    BungaApi bungaApi;

    @FXML
    private Button sam, firePop, icon, BannerShow, exit;

    @FXML
    private ImageView ButtonImage;

    @FXML
    private ImageView ban;

    @FXML
    private ImageView MalayImage, ChineseImage, IndianImage, SabahSarawakImage;

    @FXML
    private RadioButton melayu, cina, india, lainlain;

    @FXML
    private ImageView c1;
    @FXML
    private Button clear, addAll, ethnic ;
    @FXML
    private ImageView fireworks_gif;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        hideCulture();
        hideFireworks();
    }

    @FXML
    public void onClick(MouseEvent mouseEvent) {
        Button temp = (Button) mouseEvent.getSource();
        String id = temp.getId();

        switch (id) {
            case "sam":
                RemoteLoader.init(ButtonImage);
                break;

            case "firePop":
                bungaApi.FireworksSwitch();
                break;

            case "icon":
                Icon icon = new Icon(c1);
                icon.setIcon();
                break;

            case "BannerShow":
                ShowBanner.init(ban);
                break;
            
            case "ethnic":
                EthnicWish.init(MalayImage, ChineseImage,IndianImage,SabahSarawakImage);
                break;
                
            case "addAll":
                RemoteLoader.init(ButtonImage);
                bungaApi.FireworksSwitch();
                Icon i = new Icon(c1);
                i.setIcon();
                ShowBanner.init(ban);
                x = new Malay(x);
                x.setImage(MalayImage);
                x = new Chinese(x);
                x.setImage(ChineseImage);
                x = new Indian(x);
                x.setImage(IndianImage);
                x = new SabahSarawak(x);
                x.setImage(SabahSarawakImage);
                break;
                
            case "exit":
                System.exit(0);
                break;
        }
    }
    
    @FXML
    public void addAll(ActionEvent e){
        sam.setVisible(true);
        firePop.setVisible(true);
        icon.setVisible(true);
        BannerShow.setVisible(true);

    }
    
    @FXML
    public void clearEthnic(ActionEvent e) {
        cina.setSelected(false);
        lainlain.setSelected(false);
        india.setSelected(false);
        melayu.setSelected(false);
        ChineseImage.setVisible(false);
        MalayImage.setVisible(false);
        IndianImage.setVisible(false);
        SabahSarawakImage.setVisible(false);
        ChineseImage.yProperty().set(0);
        ChineseImage.xProperty().set(0);
        MalayImage.yProperty().set(0);
        MalayImage.xProperty().set(0);
        SabahSarawakImage.yProperty().set(0);
        SabahSarawakImage.xProperty().set(0);
        IndianImage.yProperty().set(0);
        IndianImage.xProperty().set(0);

    }

    @FXML
    public void listEthnic(ActionEvent e) {
        RadioButton btn = (RadioButton) e.getSource();
        String id = btn.getId();
        if (btn.isSelected() == false) {
            //clearEthnic(e);
            return;
        }
        switch (id) {
            case "melayu":
                x = new Malay(x);
                x.setImage(MalayImage);
                System.out.println(x.getDescription());
                break;
            case "cina":
                x = new Chinese(x);
                x.setImage(ChineseImage);
                System.out.println(x.getDescription());
                break;
            case "india":
                x = new Indian(x);
                x.setImage(IndianImage);
                System.out.println(x.getDescription());
                break;
            case "lainlain":
                x = new SabahSarawak(x);
                x.setImage(SabahSarawakImage);
                System.out.println(x.getDescription());
                break;
        }
    }

    private void hideCulture() {
        c1.setVisible(false);
    }

    private void hideFireworks() {
        fireworks_gif.setVisible(false);
        bungaApi = new BungaApi(fireworks_gif);
    }

}
