package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Carte {
    public GridPane testPage() throws FileNotFoundException {
                // An image file on the hard drive.
    	        //Image img = new Image(getClass().getResource("./carte_france_villes.png").toString());
    	    	//creating label title 
    	        Text text1 = new Text("Carte");
    	        text1.setStyle("-fx-font: normal bold 30px 'serif' "); 
    	        
    	    	//Creating Buttons
    	        Button button1 = new Button("Retour commandes");
    	        Button button3= new Button("Retour Login");
    	        //Creating a Grid Pane
    	        GridPane gridPane = new GridPane();    
    	        FileInputStream imageStream = new FileInputStream("C:\\Users\\CYTech Student\\eclipse-workspace\\HelloWorldJFX\\bin/carte.jfif");
    	        Image image = new Image(imageStream);
    	        gridPane.add(new ImageView(image), 0, 4);
    	        
    	        //Setting size for the pane
    	        gridPane.setMinSize(1550, 800);
    	       
    	        //Setting the padding  
    	        gridPane.setPadding(new Insets(10, 10, 10, 10));
    	       
    	        //Setting the vertical and horizontal gaps between the columns
    	        gridPane.setVgap(5);
    	        gridPane.setHgap(5);      
    	       

    	        //Setting the Grid alignment
    	        gridPane.setAlignment(Pos.CENTER);
    	       
    	        //Arranging all the nodes in the grid
    	        gridPane.add(button1, 0, 6);
    	        gridPane.add(text1, 0, 0);
    	        gridPane.add(button3, 1, 6);
    	        //gridPane.add(img, 0, 0);
    	         
    	        //Styling nodes  
    	        button1.setStyle("-fx-background-color: cadetblue; -fx-text-fill: white;");
    	        button3.setStyle("-fx-background-color: cadetblue; -fx-text-fill: white;");
    	        gridPane.setStyle("-fx-background-color: WHITE;");
    	        
    	        //Gestion event buttons
    	        button1.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
    	            @Override
    	            public void handle(ActionEvent actionEvent) {
    	              	  Commandes affichageDeux = new Commandes();
    	                    Scene sceneBis = new Scene(affichageDeux.testPage(), 1550, 800);
    	                    Stage stagebis = new Stage();
    	                    stagebis.setScene(sceneBis);
    	                    stagebis.setTitle("Commandes");
    	                    stagebis.show();
    	                    return;
    	                }
    	        });
    	        button3.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
    	            @Override
    	            public void handle(ActionEvent actionEvent) {
    	              	    LoginPage_1 affichageDeux = new LoginPage_1();
    	                    Scene sceneBis = new Scene(affichageDeux.testPage(), 1550, 800);
    	                    Stage stagebis = new Stage();
    	                    stagebis.setScene(sceneBis);
    	                    stagebis.setTitle("LoginPage");
    	                    stagebis.show();
    	            }
    	        });
    	       return gridPane;
    	       }
    	}