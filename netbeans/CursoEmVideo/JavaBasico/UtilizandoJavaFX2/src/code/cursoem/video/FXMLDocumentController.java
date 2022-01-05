/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package code.cursoem.video;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Alisson Alves
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label LbMensagem;
    private Button BtnClique;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        LbMensagem.setText("Olá, Planeta!");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
