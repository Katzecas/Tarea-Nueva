/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.tarea.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import cr.ac.una.tarea.util.FlowController;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author David
 */
public class RegistroController extends Controller implements Initializable {

    @FXML
    private ImageView imgRegistro;
    @FXML
    private JFXButton btncancelar;
    @FXML
    private JFXButton btneditar;
    @FXML
    private JFXButton btnguardar;
    @FXML
    private ImageView imgRegistroequipos;
    @FXML
    private JFXButton btncancelar2;
    @FXML
    private JFXButton btneditar2;
    @FXML
    private JFXButton btnguardar2;
    @FXML
    private JFXTextField txtidDeporte;
    @FXML
    private JFXTextField txtDeporte;
    @FXML
    private JFXTextField txtidequipo;
    @FXML
    private JFXTextField txtEquipo;
    @FXML
    private JFXButton btnAtras;
    @FXML
    private JFXButton btnAtras2;
    @FXML
    private JFXButton btnBucarImg;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnBucarImg.setOnAction(event -> {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Buscar Imagen");

        // Agregar filtros para facilitar la busqueda
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Images", "*.*"),
                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
                new FileChooser.ExtensionFilter("PNG", "*.png")
        );

        // Obtener la imagen seleccionada
        File imgFile = fileChooser.showOpenDialog(stage);

        // Mostar la imagen
        if (imgFile != null) {
            Image image = new Image("file:" + imgFile.getAbsolutePath());
            imgRegistro.setImage(image);
        }
    });
      
    }    

    @Override
    public void initialize() {
       txtEquipo.clear();
       txtidequipo.clear();
       txtDeporte.clear();
       txtidDeporte.clear();
    }

    @FXML
    private void OnMouseClickedimgRegistro(MouseEvent event) {
      
    }

    @FXML
    private void OnActionBtnCancelar(ActionEvent event) {
    }

    @FXML
    private void OnActionBtnEditar(ActionEvent event) {
    }

    @FXML
    private void OnActionBtnGuardar(ActionEvent event) {
    }

    @FXML
    private void OnMouseClickedimgRegistroequpos(MouseEvent event) {
    }

    @FXML
    private void OnActionBtnCancelar2(ActionEvent event) {
    }

    @FXML
    private void OnActionBtnEditar2(ActionEvent event) {
    }

    @FXML
    private void OnActionBtnGuardar2(ActionEvent event) {
    }

    @FXML
    private void OnActionbtnAtras(ActionEvent event) {
      getStage().close();
        
    }

    @FXML
    private void OnActionbtnAtras2(ActionEvent event) {
         getStage().close();
    }
    
}
