package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CF004_1 {
    public GridPane testPage() {   
	      //creating label login 
	      Text text1 = new Text("Ref    Description                       Prix       Frais de livraison"); 
	      Text text2 = new Text("CF004 Perceuse percussion base	 315,00€ 	 20,00€");
	      
	      Button button2 = new Button("Retour à la liste des produits");  
	      button2.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
	          @Override
	          public void handle(ActionEvent actionEvent) {
	        	  Client affichageDeux = new Client();
                  Scene sceneBis = new Scene(affichageDeux.testPage(), 1550, 800);
                  Stage stagebis = new Stage();
                  stagebis.setScene(sceneBis);
                  stagebis.setTitle("CF004");
                  stagebis.show();  
	          };
	          });
	      	      
	      
	      //Creating a Grid Pane 
	      GridPane gridPane = new GridPane();    
	      
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
	      gridPane.add(text1, 0, 0); 
	      gridPane.add(text2, 0, 1);
	      gridPane.add(button2, 0, 3); 
	      
	      
	       
	      //Styling nodes  
	       
	      button2.setStyle("-fx-background-color: cadetblue; -fx-text-fill: white;"); 
	       
	      text1.setStyle("-fx-font: normal 15px 'serif' "); 
	      
	      
	      return gridPane;
}
}
