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

public class Panier_1 {
    public GridPane testPage() {
    	
    	Text text1 = new Text("Votre panier");
        Text text3 = new Text("Ref     Description     Quantité      Prix ");
        Text text2= new Text("Votre panier est vide pour le moment ");
        
        text1.setStyle("-fx-font: normal bold 20px 'serif' "); 
        text2.setStyle("-fx-font: normal 15px 'serif' "); 
        text1.setStyle("-fx-font: normal bold 15px 'serif' "); 
        
    	//Creating Buttons
        Button button1 = new Button("Retour à la liste des produits");
        button1.setStyle("-fx-background-color: cadetblue; -fx-text-fill: white;"); 
        Button button3 = new Button("Retour Login");
        button3.setStyle("-fx-background-color: cadetblue; -fx-text-fill: white;");
        //Creating a Grid Pane
        GridPane gridPane = new GridPane();    
       
        //Setting size for the pane
        gridPane.setMinSize(800, 400);
        gridPane.add(text1, 0, 0);
        gridPane.add(text2, 0, 5);
        gridPane.add(text3, 0, 20);
        gridPane.add(button1, 0, 50);
        gridPane.add(button3, 1, 50);
       
        button1.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
              	    Client affichageDeux = new Client();
                    Scene sceneBis = new Scene(affichageDeux.testPage(), 1550, 800);
                    Stage stagebis = new Stage();
                    stagebis.setScene(sceneBis);
                    stagebis.setTitle("Client");
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

        //Styling nodes  
        gridPane.setStyle("-fx-background-color: WHITE;");
       
       return gridPane;
       }
}