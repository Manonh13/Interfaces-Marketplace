package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Prestataire {
    public GridPane testPage() {
    	//creating label title 
    	Text text1 = new Text("Choix Prestataire");
        text1.setStyle("-fx-font: normal bold 20px 'serif' "); 
        
        //A radio button with the specified label
        RadioButton rb1 = new RadioButton("Chronopost");
        RadioButton rb2 = new RadioButton("MondialRelay");
        RadioButton rb3 = new RadioButton("Ebay");
   
        Button button1 = new Button("Choix prestataire");
        Button button3= new Button("Retour Login");
        //Toggle group of radio buttons      
        ToggleGroup group1 = new ToggleGroup();
        rb1.setToggleGroup(group1);
        rb2.setToggleGroup(group1);
        rb3.setToggleGroup(group1);
        
        //Creating a Grid Pane
        GridPane gridPane = new GridPane();    
       
        button1.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(rb1.isSelected()) {
              	  Chronopost affichageDeux = new Chronopost();
                    Scene sceneBis = new Scene(affichageDeux.testPage(), 1550, 800);
                    Stage stagebis = new Stage();
                    stagebis.setScene(sceneBis);
                    stagebis.setTitle("Marketplace");
                    stagebis.show();
                    return;
                }
               if(rb2.isSelected()) {
              	 MondialRelay affichageDeux = new MondialRelay();
                   Scene sceneBis = new Scene(affichageDeux.testPage(), 1550, 800);
                   Stage stagebis = new Stage();
                   stagebis.setScene(sceneBis);
                   stagebis.setTitle("Vendeur");
                   stagebis.show();

                    return;
               }
               if(rb3.isSelected()) {
              	 Ebay affichageDeux = new Ebay();
                   Scene sceneBis = new Scene(affichageDeux.testPage(), 1550, 800);
                   Stage stagebis = new Stage();
                   stagebis.setScene(sceneBis);
                   stagebis.setTitle("Prestataire");
                   stagebis.show();

                   return;
               }
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
        gridPane.add(rb1, 0, 10);
        gridPane.add(rb2, 1, 10);
        gridPane.add(rb3, 0, 11);
        gridPane.add(text1, 0, 1);
        gridPane.add(button1, 0, 14);
        gridPane.add(button3, 1, 14);
        
        //Styling nodes  
        gridPane.setStyle("-fx-background-color: WHITE;");
        button1.setStyle("-fx-background-color: cadetblue; -fx-text-fill: white;");
        button3.setStyle("-fx-background-color: cadetblue; -fx-text-fill: white;");
       
       return gridPane;
    }
}

