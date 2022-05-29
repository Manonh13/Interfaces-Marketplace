package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import javafx.application.Application;
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

public class ImagePanel extends Application {

    @Override
    public void start(Stage stage) throws FileNotFoundException, MalformedURLException {
        stage.setTitle("Carte des livraisons");
        stage.setWidth(500);
        stage.setHeight(500);
        GridPane gridPane = new GridPane(); 
        Scene scene = new Scene(gridPane);
        //Scene scene = new Scene(gridPane);
        VBox root = new VBox();    

        //final ImageView selectedImage = new ImageView();   
        //Image image1 = new Image(ImagePanel.class.getResourceAsStream("test.png"));
        //Image image1 = new Image(new FileInputStream("test.png"));
        //Image image1 = new Image(new File("h:\\Pictures\\téléchargement.jfif").toURI().toURL().toExternalForm());
        //Image image1 = new Image(new File("carte.jfif").toURI().toURL().toExternalForm());
        //GridPane pane = new GridPane();
        FileInputStream imageStream = new FileInputStream("carte.jfif");
        Image image = new Image(imageStream);
        gridPane.add(new ImageView(image), 1, 4);
        
        
        Text text1 = new Text("Carte");
        text1.setStyle("-fx-font: normal bold 30px 'serif' "); 
        
    	//Creating Buttons
        Button button1 = new Button("Retour commandes");
        Button button3= new Button("Retour Login");
        //Creating a Grid Pane
        //GridPane gridPane = new GridPane();    
       
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
        gridPane.add(button1, 0, 7);
        gridPane.add(text1, 0, 0);
        gridPane.add(button3, 2, 7);
        //Image image = new Image("carte.jfif");
        //gridPane.getChildren().add(new ImageView(image));
         
        //Styling nodes  
        button1.setStyle("-fx-background-color: cadetblue; -fx-text-fill: white;");
        button3.setStyle("-fx-background-color: cadetblue; -fx-text-fill: white;");
        gridPane.setStyle("-fx-background-color: WHITE;");
        
        //Gestion event buttons
      /*  button1.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
              	 // Commandes affichageDeux = new Commandes();
                //    Scene sceneBis = new Scene(affichageDeux.testPage(), 1550, 800);
                    Stage stagebis = new Stage();
                 //   stagebis.setScene(sceneBis);
                    stagebis.setTitle("Commandes");
                    stagebis.show();
                    return;
                }
        }); */
     /*   button3.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
              	   // LoginPage_1 affichageDeux = new LoginPage_1();
                   // Scene sceneBis = new Scene(affichageDeux.testPage(), 1550, 800);
                    Stage stagebis = new Stage();
                 //   stagebis.setScene(sceneBis);
                    stagebis.setTitle("LoginPage");
                    stagebis.show();
            }
        }); */
        
        
        //selectedImage.setImage(image1);

       // root.getChildren().addAll(selectedImage);
        //stage.setScene(scene);
        //scene.setRoot(root);

        stage.setScene(scene);
        stage.show();
        
        
      
		  
		   
		   
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}