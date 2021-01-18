/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merdeka;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author elyanie
 */
public class Merdeka extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("gui.fxml"));
        primaryStage.setTitle("Merdeka Festival Design Pattern");
        primaryStage.setScene(new Scene(root, 920, 600));
        primaryStage.setResizable(false);
        primaryStage.setMaximized(false);

        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         launch(args);
        // TODO code application logic here
    }

}
