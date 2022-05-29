package application; 
import java.io.BufferedReader;
import java.io.FileReader;

import javafx.application.Application; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane; 
import javafx.stage.Stage; 
import javafx.beans.value.ObservableValue;
import static javafx.application.Application.launch; 
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.text.Text; 
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Client {
    public GridPane testPage() {
    	//creating label title 
        Text text1 = new Text("Liste produits");
        text1.setStyle("-fx-font: normal bold 20px 'serif' "); 

        Button button1 = new Button("Accéder au panier");
        button1.setStyle("-fx-background-color: cadetblue; -fx-text-fill: white;"); 
        Button button3 = new Button("Retour Login");
        button3.setStyle("-fx-background-color: cadetblue; -fx-text-fill: white;");
        button1.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
	          @Override
	          public void handle(ActionEvent actionEvent) {
	        	Panier_1 affichageDeux = new Panier_1();
                Scene sceneBis = new Scene(affichageDeux.testPage(), 1550, 800);
                Stage stagebis = new Stage();
                stagebis.setScene(sceneBis);
                stagebis.setTitle("CF004");
                stagebis.show();  
	          };
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
    	 Text text2 = new Text("Voici les produits disponibles sur la Marketplace, cliquez dessus pour plus d'informations. "); 
    	//Creating a Grid Pane 
    	 GridPane gridPane = new GridPane();    
    	 
    	 //Setting size for the pane 
    	 gridPane.setMinSize(500, 500);
    	 gridPane.setMaxSize(500,500);
    	 
    	 //Setting the padding  
    	 gridPane.setPadding(new Insets(10, 10, 10, 10)); 
    	 
    	 //Setting the vertical and horizontal gaps between the columns 
    	 gridPane.setVgap(5); 
    	 gridPane.setHgap(5);       
    	 
    	 //Setting the Grid alignment 
    	 gridPane.setAlignment(Pos.CENTER);
    	 StackPane root = new StackPane();
    	 //primaryStage.setScene(new Scene(root, 300, 250)); 

    	 int i=2;
    	 int j = 1;
    	 try
    		{
    		FileReader fr=new FileReader("C:\\Users\\CYTech Student\\eclipse-workspace\\HelloWorldJFX\\src\\application/produits.csv");
    		BufferedReader br= new BufferedReader(fr);
    		while (br.ready()) {
    			// Definition d'un bouton avec action sur clic 
    			 Button btn = new Button(br.readLine());
    			 btn.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
    		          @Override
    		          public void handle(ActionEvent actionEvent) {
    		        	  CF004_1 affichageDeux = new CF004_1();
    	                  Scene sceneBis = new Scene(affichageDeux.testPage(), 1550, 800);
    	                  Stage stagebis = new Stage();
    	                  stagebis.setScene(sceneBis);
    	                  stagebis.setTitle("CF004");
    	                  stagebis.show();  
    		          };
    		          });
    			 //StackPane root = new StackPane(); 
    			 root.getChildren().add(btn);
    			 gridPane.add(btn, 1, j);
    			 //primaryStage.setScene(new Scene(root, 300, 250)); 
    			 //primaryStage.show(); 
    			 //gridPane.add(btn, 0, 7);
    			 //System.out.println(br.readLine());
    			 //br.close();
    			  
    		       
    		      //Arranging all the nodes in the grid 
    		      //gridPane.add(btn, i, j); 
    		      //i=i+1;
    		      j=j+1;
    		       
    		}}
    		catch (Exception e)
    		{System.out.println("Erreur "+e);}
    	 
    	 gridPane.add(text1, 1, 0);
    	 gridPane.add(text2, 1, 24);
    	 gridPane.add(button1, 1, 25);
    	 gridPane.add(button3, 2, 25);

        return gridPane;
    }
}

