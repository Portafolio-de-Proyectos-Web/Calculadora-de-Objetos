/*
Nombre: Josue David Perez Cap
Codigo Tecnico: IN5AV
Carne: 2018-495
Fecha de Creacion: 21-03-2022
Fecha de Modificacion: 01-04-2022
 */
package org.josueperez.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Principal extends Application {
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CalculadoraView.fxml"));
        
        Scene scene = new Scene(root);
        
        escenarioPrincipal.setScene(scene);
        escenarioPrincipal.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
