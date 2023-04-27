/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;

import static assignment.pkg1.Assignment1.s1;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import assignment.pkg1.SystemPageController ;
import java.io.IOException;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;



/**
 *
 * @author Pc World
 */
public class FXMLDocumentController implements Initializable {
    
    public static SystemPageController s1;
        public static FXMLDocumentController s2;
    
   private Scene SystemPage;

    @FXML
    private Label label;
    @FXML
    private Button login;
    @FXML
    private TextField inputUser;
    @FXML
    private TextField inputPass;
    private Object stage;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
    }    

    @FXML
    private void loginTAIK(ActionEvent event) throws IOException {
        
       // FXMLLoader loader = new FXMLLoader(getClass().getResource("assignment.pkg1/SystemPage.fxml"));
      //  Parent root = loader.load();
   //     SystemPage controller = loader.getController();
//        SystemPageController scene = new SystemPageController();
//        scene.setScene(scene);
//        scene.show();
        

            s1 = new SystemPageController();
        
    }
   
}
