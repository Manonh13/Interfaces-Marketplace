package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.text.Text; 
import javafx.stage.Stage;

public class Marketplace {
    public GridPane testPage() {
    	
    	//creating label title 
        Text text1 = new Text("Marketplace");
        text1.setStyle("-fx-font: normal bold 20px 'serif' "); 
        
    	 //Creating Buttons
        Button button1 = new Button("Afficher chiffre d'affaires ");
        Button button2 = new Button("Suivre les commandes"); 
        Button button3 = new Button("Retour Login");
        //Creating a Grid Pane
        GridPane gridPane = new GridPane();    
       
        button2.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
              	    Commandes affichageDeux = new Commandes();
                    Scene sceneBis = new Scene(affichageDeux.testPage(), 1550, 800);
                    Stage stagebis = new Stage();
                    stagebis.setScene(sceneBis);
                    stagebis.setTitle("Commandes");
                    stagebis.show();
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
        
        //Setting size for the pane
        gridPane.setMinSize(500, 500);
       
        //Setting the padding  
        gridPane.setPadding(new Insets(10, 10, 10, 10));
       
        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);      
       

        //Setting the Grid alignment
        gridPane.setAlignment(Pos.CENTER);
       
        //Arranging all the nodes in the grid
        gridPane.add(button1, 0, 10);
        gridPane.add(button2, 1, 10);
        gridPane.add(button3, 2, 10);
        gridPane.add(text1, 0, 1);
         
        //Styling nodes  
        button1.setStyle("-fx-background-color: cadetblue; -fx-text-fill: white;");
        button2.setStyle("-fx-background-color: cadetblue; -fx-text-fill: white;");
        button3.setStyle("-fx-background-color: cadetblue; -fx-text-fill: white;");
        gridPane.setStyle("-fx-background-color: WHITE;");
       
       return gridPane;
       }
}
