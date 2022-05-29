package application;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import static javafx.application.Application.launch; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 

import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;  
         
public class LoginPage extends Application { 
   @Override 
   public void start(Stage stage) {      
      //creating label login 
      Text text1 = new Text("Identifiant");       
      
      //creating label password 
      Text text2 = new Text("Mot de passe"); 
      
    //creating label title 
      Text text3 = new Text("Connectez-vous");
      
    //creating label login 
      Text text4 = new Text("En tant que");
       
      //Creating Text Filed for login        
      TextField textField1 = new TextField();       
      
      //Creating Text Filed for password        
      PasswordField textField2 = new PasswordField(); 
     
       
      //Creating Buttons 
      Button button1 = new Button("S'identifier"); 
      Button button2 = new Button("Créer compte");  
      
     
      
      //A radio button with the specified label
      RadioButton rb1 = new RadioButton("Marketplace");
      RadioButton rb2 = new RadioButton("Vendeur");
      RadioButton rb3 = new RadioButton("Prestataire");
      RadioButton rb4 = new RadioButton("Livreur");
      RadioButton rb5 = new RadioButton("Client");
      
      //Toggle group of radio buttons       
      ToggleGroup group1 = new ToggleGroup();
      rb1.setToggleGroup(group1); 
      rb2.setToggleGroup(group1);
      rb3.setToggleGroup(group1);
      
      ToggleGroup group2 = new ToggleGroup();
      rb4.setToggleGroup(group2); 
      rb5.setToggleGroup(group2);
      

      //Creating a Grid Pane 
      GridPane gridPane = new GridPane();    
      
      //Gestion event buttons
      button1.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent actionEvent) {
        	  if(textField1.getText().isEmpty()) {
        		  Text textAlert = new Text("Veuillez remplir votre identifiant");
        		  textAlert.setStyle("-fx-font: normal bold 10px 'serif' "); 
        		  gridPane.add(textAlert, 1, 2);
        		  return;
        	  }
        	  if(textField2.getText().isEmpty()) {
        		  Text textAlert = new Text("Veuillez remplir votre motdepasse");
        		  textAlert.setStyle("-fx-font: normal bold 10px 'serif' "); 
        		  gridPane.add(textAlert, 1, 4);
        		  return;
        	  }
              if(rb1.isSelected()) {
            	  Marketplace affichageDeux = new Marketplace();
                  Scene sceneBis = new Scene(affichageDeux.testPage(), 1550, 800);
                  Stage stagebis = new Stage();
                  stagebis.setScene(sceneBis);
                  stagebis.setTitle("Marketplace");
                  stagebis.show();
                  return;
              }
             if(rb2.isSelected()) {
            	 Vendeur affichageDeux = new Vendeur();
                 Scene sceneBis = new Scene(affichageDeux.testPage(), 1550, 800);
                 Stage stagebis = new Stage();
                 stagebis.setScene(sceneBis);
                 stagebis.setTitle("Vendeur");
                 stagebis.show();

                  return;
             }
             if(rb3.isSelected()) {
            	 Prestataire affichageDeux = new Prestataire();
                 Scene sceneBis = new Scene(affichageDeux.testPage(), 1550, 800);
                 Stage stagebis = new Stage();
                 stagebis.setScene(sceneBis);
                 stagebis.setTitle("Prestataire");
                 stagebis.show();

                 return;
             }
             if(rb4.isSelected()) {
            	 Livreur affichageDeux = new Livreur();
                 Scene sceneBis = new Scene(affichageDeux.testPage(), 1550, 800);
                 Stage stagebis = new Stage();
                 stagebis.setScene(sceneBis);
                 stage.setTitle("Livreur");
                 stagebis.show();

                 return;
             }
             if(rb5.isSelected()) {
            	 Client affichageDeux = new Client();
                 Scene sceneBis = new Scene(affichageDeux.testPage(), 1550, 800);
                 Stage stagebis = new Stage();
                 stagebis.setScene(sceneBis);
                 stage.setTitle("Client");
                 stagebis.show();
                 return;
             }
             if((!rb1.isSelected()) && (!rb2.isSelected()) && (!rb3.isSelected()) && (!rb4.isSelected()) && (!rb5.isSelected())) {
       		  Text textAlert = new Text("Veuillez sélectionner votre catégorie");
       	      textAlert.setStyle("-fx-font: normal bold 10px 'serif' "); 
       		  gridPane.add(textAlert, 0, 11);
       		  return;
       	  }
          }
      });
      
      //Setting size for the pane 
      gridPane.setMinSize(1550,800); 
      
      //Setting the padding  
      gridPane.setPadding(new Insets(10, 10, 10, 10)); 
      
      //Setting the vertical and horizontal gaps between the columns 
      gridPane.setVgap(5); 
      gridPane.setHgap(5);       
      
      //Setting the Grid alignment 
      gridPane.setAlignment(Pos.CENTER); 
       
      //Arranging all the nodes in the grid 
      gridPane.add(text1, 0, 1); 
      gridPane.add(textField1, 1, 1); 
      gridPane.add(text2, 0, 3);       
      gridPane.add(textField2, 1, 3); 
      gridPane.add(text3, 0, 0); 
      gridPane.add(text4, 0, 5); 
      gridPane.add(button1, 0, 13); 
      gridPane.add(button2, 1, 13);
      gridPane.add(rb1, 0, 7);       
      gridPane.add(rb2, 0, 8);
      gridPane.add(rb3, 0, 9);
      gridPane.add(rb4, 1, 7);
      gridPane.add(rb5, 1, 8);
       
      //Styling nodes  
      button1.setStyle("-fx-background-color: cadetblue; -fx-text-fill: white;"); 
      button2.setStyle("-fx-background-color: cadetblue; -fx-text-fill: white;"); 
       
      text1.setStyle("-fx-font: normal 15px 'serif' "); 
      text2.setStyle("-fx-font: normal 15px 'serif' ");  
      text3.setStyle("-fx-font: normal bold 20px 'serif' "); 
      text4.setStyle("-fx-font: normal bold 20px 'serif' ");
      gridPane.setStyle("-fx-background-color: WHITE;"); 
      
      
      //Creating a scene object 
      Scene scene = new Scene(gridPane); 
       
      //Setting title to the Stage 
      stage.setTitle("LoginPage"); 
         
      //Adding scene to the stage 
      stage.setScene(scene);
      
      //Displaying the contents of the stage 
      stage.show(); 
   }      
   public static void main(String args[]){ 
      launch(args); 
   } 
}
