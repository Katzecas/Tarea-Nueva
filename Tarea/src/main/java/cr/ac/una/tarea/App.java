package cr.ac.una.tarea;

import cr.ac.una.tarea.util.FlowController;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {


    @Override
    public void start(Stage stage) throws IOException {
       FlowController.getInstance().InitializeFlow(stage, null);
       //stage.getIcons().add(new Image("/cr/ac/una/tarea/resources/Icono.png"));
       stage.setTitle("Brackets");
       FlowController.getInstance().goViewInWindow("Menuview");//  LoginView  habre inicialisando el fxml 
    }

    public static void main(String[] args) {
        launch();
    }

}