/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.tarea.util;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author usuario
 * la camara se creo en una clase aparte pues existen incompatibilidad de tipos en Image de javafx y ge de java.awt
 */
public class Camara {
    
    private final Webcam webcam = Webcam.getDefault();//creacion de camara
    
    private final Image image= webcam.getImage();
    
    
    public void iniciarCamara(){

       webcam.open();  //apertura de camara
    }
    
    public void tomarFotografia(){
    
    //tomar fotografia
        try {
            ImageIO.write(webcam.getImage(), "PNG", new File("profile.png"));//captura y guardado de fotografia
        } catch (IOException ex) {
            Logger.getLogger(Camara.class.getName()).log(Level.SEVERE, null, ex);
        }
       
}
    
    
    public void cerrarCamara(){
        webcam.close();
    }
    
    
    //https://www.youtube.com/watch?v=dL4MVWJjVVY
}

//Mejor no inicialisar camara pues la camara busca la imgen mas pequeña
       //inicialisar tamaño de camara primer manera
//        webcam.setViewSize(WebcamResolution.VGA.getSize());
        
    ////inicialisar tamaño camara segunda manera
    // webcam.setViewSize(new Dimension(176,144));  
        //iniciar camara

//        Saber dimensiones de camara
//        for (Dimension supportedSize: webcam.getViewSizes()){
//                System.out.println(supportedSize.toString() );
//            }   
//***dimesiones de camara****    
//java.awt.Dimension[width=176,height=144]
//java.awt.Dimension[width=320,height=240]
//java.awt.Dimension[width=640,height=480]