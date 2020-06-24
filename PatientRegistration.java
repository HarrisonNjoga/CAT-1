/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientregistration;


import javafx.application.Application; 
import static javafx.application.Application.launch; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.GridPane; 
import javafx.scene.control.TextField; 
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import java.io.FileNotFoundException;


/**
 *
 * @author NJOGA HARRISON
 */
public class PatientRegistration extends Application{

    public static void main(String[] args) {
       launch(args);
    }
	
    @Override
   public void start(Stage stage) throws FileNotFoundException { 
      
     
      
      //creating label Name
      
      Text text1 = new Text("Sir Name : "); 

      //creating label Name
      Text text2 = new Text("Middle Name : "); 
	  
	  //creating label Name
      Text text3 = new Text("Last Name : "); 

      //creating label Phone
      Text text4 = new Text("Phone no : ");

	  //creating label Email
      Text text5 = new Text("Email : ");
	  
	  //creating label Registerd
	  Text text6 = new Text("Gender : ");
	  
	   //creating label Registerd
	  Text text7 = new Text("DOB : ");
	  
	  
	  
	  
       
      //Creating Text Fields 
     
             
         TextField textField1 = new TextField();
      
	  TextField textField2 = new TextField(); 
	  
	  TextField textField3 = new TextField();
	  
	  TextField textField4 = new TextField();
	  
	  TextField textField5 = new TextField();
	  
	  TextField textField6 = new TextField();
	  
	   TextField textField7 = new TextField();
        
      
      
       
      //Creating datepeeker
      DatePicker datePicker = new DatePicker();

        HBox hbox = new HBox(datePicker);
        

      //Creating combo box for Gender       
      ComboBox comboBox = new ComboBox();
	
      comboBox.getItems(). add("Male");
	  comboBox.getItems(). add("Female");
	  
	  //Setting the combo box editable
      comboBox.setEditable(false); 
      
      //Creating a Grid Pane 
      GridPane gridPane = new GridPane();    
      
      //Setting size for the pane 
      gridPane.setMinSize(600, 400); 
      
      //Setting the padding  
      gridPane.setPadding(new Insets(10, 10, 10, 10)); 
      
      //Setting the vertical and horizontal gaps between the columns 
      gridPane.setVgap(15); 
      gridPane.setHgap(15);       
      
      //Setting the Grid alignment 
      gridPane.setAlignment(Pos.CENTER); 
      gridPane.setStyle("-fx-background-color: ivory;");
     
      
       
	
      //Arranging all the nodes in the grid 
   
      
      gridPane.add(text1, 0, 1); 
      gridPane.add(textField1, 1, 1);
	
      gridPane.add(text2, 0, 2);
      gridPane.add(textField2, 1, 2);
	 
	  
	  gridPane.add(text3, 0, 3); 
	  gridPane.add(textField3, 1, 3);
	  
	  gridPane.add(text4, 0, 4); 
	  gridPane.add(textField4, 1, 4);
	  
	  gridPane.add(text5, 0, 5); 
	  gridPane.add(textField5, 1, 5);
	  
	  gridPane.add(text6, 0, 6);
	  gridPane.add(comboBox, 1, 6);
	  
	  gridPane.add(text7, 0, 7); 
	  gridPane.add(hbox, 1, 7);
	  
	//Creating Buttons 
        
	Button btn = new Button("COMPLETE REGISTRATION");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_LEFT);
        hbBtn.getChildren().add(btn);
        gridPane.add(hbBtn, 0, 8);  
	  
        Button btn1 = new Button("CANCEL");
        HBox hbBtn1 = new HBox(10);
        hbBtn1.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn1.getChildren().add(btn1);
        gridPane.add(hbBtn1, 1, 8);
        
        final Text actiontarget = new Text();
        gridPane.add(actiontarget, 0, 8);
        
       
        //Styling nodes  
      btn.setStyle("-fx-background-color: DARKSLATEBLUE; -fx-text-fill: black;-fx-font: normal bold 10px 'serif';"); 
      btn1.setStyle("-fx-background-color: DARKSLATEBLUE; -fx-text-fill: black;-fx-font: normal bold 10px 'serif';"); 
	    
      text1.setStyle("-fx-font: normal bold 20px 'serif' "); 
      text2.setStyle("-fx-font: normal bold 20px 'serif' ");
	  text3.setStyle("-fx-font: normal bold 20px 'serif' ");
	  text4.setStyle("-fx-font: normal bold 20px 'serif' ");
	  text5.setStyle("-fx-font: normal bold 20px 'serif' ");
	  text6.setStyle("-fx-font: normal bold 20px 'serif' ");
	  text7.setStyle("-fx-font: normal bold 20px 'serif' ");
	  
      
      
      
      
     
      //Creating a scene object 
      Scene scene = new Scene(gridPane);
      
       
      //Setting title to the Stage 
      stage.setTitle("Hospital Management System "); 
         
      //Adding scene to the stage 
      stage.setScene(scene);
      
      //Displaying the contents of the stage 
      stage.show(); 
   }
  
   
}
