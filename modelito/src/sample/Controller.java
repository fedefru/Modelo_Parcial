package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;


public class Controller {

    Alumno alumnito = new Alumno();

    @FXML
     TextField txt_nombre ;
    @FXML
    private TextField txt_apellido ;
    @FXML
    private TextField txt_email ;
    @FXML
    private TextField txt_dni ;
    @FXML
    private Button btn_agregar;
    @FXML
    private Button btn_limpiar;
    @FXML
    private TableView<Alumno> tb_tablita;

    @FXML
    private ComboBox cb_materias;
    ObservableList<String> Materias =  FXCollections.observableArrayList("Programacion","Analisis Matematico","Base de datos");


    public void initialize(){
    cb_materias.setItems(Materias);
    cb_materias.setValue("Programacion");
    cargaGrilla();
    }

    public void cargaGrilla(){
        TableColumn col1 = new TableColumn("Nombre");
        col1.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        TableColumn col2 = new TableColumn("Apellido");
        col1.setCellValueFactory(new PropertyValueFactory<>("Apellido"));
        TableColumn col3 = new TableColumn("Email");
        col1.setCellValueFactory(new PropertyValueFactory<>("Email"));
        TableColumn col4 = new TableColumn("Dni");
        col1.setCellValueFactory(new PropertyValueFactory<>("Dni"));
        TableColumn col5 = new TableColumn("Materia");
        col1.setCellValueFactory(new PropertyValueFactory<>("Materia"));

        tb_tablita.getColumns().addAll(col1,col2,col3,col4,col5);

    }

    public void Agregar(){
        /*
        Metodo faltante para agregar los datos
        //Alumno alu1= new Alumno();
        //alu1.setNombre(txt_nombre.getText());
        //tb_tablita.getItems().add(alu 1Objeto que creo e instancio);
        //txt_getNombre.serDisable || para que no pueda modificar el dato que cargo.
        */

        /*
        Carga nota
        es un text,, hago el try catch interger parse int bla bla
        catch no es nota
        dsp un for para recorre el tamaño de la table view
            genero otro alumno alu2 = tb.getItems().get(x);
            result +=a2.getNota();
            cierro for

            labelNota.setText = result / tbv.size; para calcular el promedio y cargarlo en el label  

         */
    }


}

