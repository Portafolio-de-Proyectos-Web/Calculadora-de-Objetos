package org.josueperez.system;

import static java.lang.Math.pow;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {
    
    double dato1 , dato2, result=0; 
    int op;
    
    @FXML private Button btnCero;
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnMasMenos;
    @FXML private Button btnPunto;
    @FXML private Button btnIgual;
    @FXML private Button btnMas;
    @FXML private Button btnMenos; 
    @FXML private Button btnMulti;
    @FXML private Button btnDivi;
    @FXML private Button btnPorcentaje;
    @FXML private Button btnCE;
    @FXML private Button btnC;
    @FXML private Button btnExponente;
    @FXML private Button btnUnox;
    @FXML private Button btnRaiz;
    @FXML private TextField txtPantalla;
    private int contSum = 1;
    private int clic = 1;
    private int contRes = 1;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource()== btnCero){
            if(clic == 1){
                txtPantalla.clear();
                txtPantalla.setText(txtPantalla.getText()+"0");
                clic = 2;
            }else if(clic == 2){
                txtPantalla.setText(txtPantalla.getText()+"0");
            }
        }
        if(event.getSource()== btnUno){
            if(clic == 1){
                txtPantalla.clear();
                txtPantalla.setText(txtPantalla.getText()+"1");
                clic = 2;
            }else if(clic == 2){
                txtPantalla.setText(txtPantalla.getText()+"1");
            }
        }
        if(event.getSource()== btnDos){
            if(clic == 1){
                txtPantalla.clear();
                txtPantalla.setText(txtPantalla.getText()+"2");
                clic = 2;
            }else if(clic == 2){
                txtPantalla.setText(txtPantalla.getText()+"2");
            }
        }
        if(event.getSource()== btnTres){
            if(clic == 1){
                txtPantalla.clear();
                txtPantalla.setText(txtPantalla.getText()+"3");
                clic = 2;
            }else if(clic == 2){
                txtPantalla.setText(txtPantalla.getText()+"3");
            }
        }
        if(event.getSource()== btnCuatro){
            if(clic == 1){
                txtPantalla.clear();
                txtPantalla.setText(txtPantalla.getText()+"4");
                clic = 2;
            }else if(clic == 2){
                txtPantalla.setText(txtPantalla.getText()+"4");
            }
        }
        if(event.getSource()== btnCinco){
            if(clic == 1){
                txtPantalla.clear();
                txtPantalla.setText(txtPantalla.getText()+"5");
                clic = 2;
            }else if(clic == 2){
                txtPantalla.setText(txtPantalla.getText()+"5");
            }
        }
        if(event.getSource()== btnSeis){
            if(clic == 1){
                txtPantalla.clear();
                txtPantalla.setText(txtPantalla.getText()+"6");
                clic = 2;
            }else if(clic == 2){
                txtPantalla.setText(txtPantalla.getText()+"6");
            }
        }
        if(event.getSource()== btnSiete){
            if(clic == 1){
                txtPantalla.clear();
                txtPantalla.setText(txtPantalla.getText()+"7");
                clic = 2;
            }else if(clic == 2){
                txtPantalla.setText(txtPantalla.getText()+"7");
            }
        }
        if(event.getSource()== btnOcho){
            if(clic == 1){
                txtPantalla.clear();
                txtPantalla.setText(txtPantalla.getText()+"8");
                clic = 2;
            }else if(clic == 2){
                txtPantalla.setText(txtPantalla.getText()+"8");
            }
        }
        if(event.getSource()== btnNueve){
            if(clic == 1){
                txtPantalla.clear();
                txtPantalla.setText(txtPantalla.getText()+"9");
                clic = 2;
            }else if(clic == 2){
                txtPantalla.setText(txtPantalla.getText()+"9");
            }
        }
        
        else if(event.getSource()== btnMas){
            clic =1;
            if(contSum == 1){
                dato1 = Double.parseDouble(txtPantalla.getText());
                txtPantalla.clear();
                contSum = 2;
            }else if(contSum == 2){
                dato2 = dato1;
                contSum = 3;
                dato1 = Double.parseDouble(txtPantalla.getText());
                result = dato2 + dato1;
                dato2 = result;
                txtPantalla.setText(String.valueOf(result));
            }else if(contSum == 3){
                dato1 = Double.parseDouble(txtPantalla.getText());
                result = dato1 + dato2;
                dato2 = result;
                txtPantalla.setText(String.valueOf(result));
            }
            op = 1;
            btnPunto.setDisable(false);
        }
            
        
        else if(event.getSource()== btnMenos){
            clic =1;
            if(contRes == 1){
                dato1 = Double.parseDouble(txtPantalla.getText());
                txtPantalla.clear();
                contRes = 2;
            }else if(contRes == 2){
                dato2 = dato1;
                contRes = 3;
                dato1 = Double.parseDouble(txtPantalla.getText());
                result = dato2 - dato1;
                dato2 = result;
                txtPantalla.setText(String.valueOf(result));
            }else if(contRes == 3){
                dato1 = Double.parseDouble(txtPantalla.getText());
                result = dato2 - dato1;
                dato2 = result;
                txtPantalla.setText(String.valueOf(result));
            }
            op = 2;
            btnPunto.setDisable(false);
            
        }    
        else if(event.getSource()== btnMulti){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 3;
            btnPunto.setDisable(false);
        }
        else if(event.getSource()== btnDivi){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 4;
            btnPunto.setDisable(false);
        }
        
        else if(event.getSource() == btnPunto){
            txtPantalla.setText(txtPantalla.getText()+".");
            btnPunto.setDisable(true);
        }

        else if(event.getSource() == btnCE){
            txtPantalla.clear();
            btnPunto.setDisable(false);  
        }
        else if(event.getSource() == btnC){
            dato1 = 0;
            dato2 = 0;
            contSum = 1;
            contRes =1;
            txtPantalla.clear();
            btnPunto.setDisable(false);
        }
        else if (event.getSource() == btnMasMenos){
            dato1 = Double.parseDouble(txtPantalla.getText());
            result = dato1 * -1;
            txtPantalla.setText(String.valueOf(result));
        }
        else if (event.getSource() == btnExponente){
            double valor, result;
            valor = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            result = pow(valor, 2);
            txtPantalla.setText(String.valueOf(result));
            
        }
        else if (event.getSource() == btnPorcentaje){
            double valPantalla, valPorciento;
            valPantalla = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            valPorciento = dato1 * valPantalla / 100;
            txtPantalla.setText(String.valueOf(valPorciento));
        }
        else if (event.getSource() == btnRaiz){
            float result2;
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            result = Math.sqrt(dato1);
            result2= (float) result;
            txtPantalla.setText(String.valueOf(result2));
        }
        else if (event.getSource() == btnUnox){
            float result2;
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            result = 1/dato1;
            result2= (float) result;
            txtPantalla.setText(String.valueOf(result2));
        }
        
            else if (event.getSource()== btnIgual){
            dato2 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            contRes =1;
            contSum =1;
         
            switch (op){
                case 1:
                    result = dato1 + dato2;
                    txtPantalla.setText(String.valueOf(result));
                    break;
                    
                case 2:
                    result = dato1 - dato2;
                    txtPantalla.setText(String.valueOf(result));
                    break;
                
                case 3:
                    result = dato1 * dato2;
                    txtPantalla.setText(String.valueOf(result));
                    break;
                    
                case 4:
                    result = dato1 / dato2;
                    txtPantalla.setText(String.valueOf(result));
                    break;               
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
