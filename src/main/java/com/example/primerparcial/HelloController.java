package com.example.primerparcial;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.text.CompactNumberFormat;
import java.util.Optional;
import java.util.ResourceBundle;

public class HelloController implements Initializable{
    // Primera Ventana
    @FXML
    private Label welcomeText;
    public TextField TextName;
    @FXML
    protected void NameButton() {
        welcomeText.setText(TextName.getText());
        TextName.setText("Bienvenido");
    }
    // Segunda Ventana
    @FXML
    public TextArea TextMulti;
    public TextField TextAre;
    @FXML
    protected void AggButton(){
        TextMulti.appendText(TextAre.getText()+"\n");
        TextAre.setText("");
    }

    //Tercera Ventana
    @FXML
    private Label Label3;
    @FXML
    private ChoiceBox<String> ChoiceBox3;
    @FXML
    private String[] food = {"Pizza", "Hamburguesa", "Tacos"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ChoiceBox3.getItems().addAll(food);
        ChoiceBox3.setOnAction(this::getFood);

        //Ventana 4
        comboBox.setPromptText("Seleccione una opción");
        comboBox.getItems().addAll("Opción 1", "Opción 2", "Opción 3");

        //Ventna 8
        myTemperature = (int) mySlider.getValue();
        myLabel8.setText(Integer.toString(myTemperature) + "°C");
        mySlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number>arg0, Number arg1, Number arg2) {

                myTemperature = (int) mySlider.getValue();
                myLabel8.setText(Integer.toString(myTemperature) + "°C");

            }
        });
        //VENTANA 9
        TreeItem<String> rootItem = new TreeItem<>("Files");

        TreeItem<String> branchItem1 = new TreeItem<>("Peliculas");
        TreeItem<String> branchItem2 = new TreeItem<>("Videos");
        TreeItem<String> branchItem3 = new TreeItem<>("Música");

        rootItem.getChildren().addAll(branchItem1, branchItem2, branchItem3);

        treeview.setRoot(rootItem);

    }
    public void getFood(ActionEvent event){
        String myFood = ChoiceBox3.getValue();
        Label3.setText(myFood);
    }
    //VENTANA 4
    @FXML
    private ComboBox<String> comboBox;

    //VENTANA 5
    public Label Label5;

    @FXML

    protected void RadioButton1(){
        Label5.setText("Eres un Hombre");
    }

    @FXML
    protected void RadioButton2(){
        Label5.setText("Eres una Mujer");
    }

    //VENTANA 6
    @FXML
    private Label Label6;

    @FXML
    private Label Label61;
    @FXML
    protected void CheckBox1(){
        Label6.setText("AGREGAR MAYONESA");
    }
    @FXML
    protected void CheckBox2(){
        Label61.setText("AGREGAR SALSA");
    }

    @FXML
    protected void Button6(){
        Label6.setText("");
        Label61.setText("");
    }
    //VENTANA 7
    @FXML
    private Button myButton;

    @FXML
    private Label Label7;

    @FXML
    private ProgressBar myProgressBar;

    double progress;

    public void increaseProgress(){
        progress += 0.1;
        myProgressBar.setProgress(progress);
        Label7.setText(Integer.toString((int)Math.round(progress * 100))+ "%");

    }

    //ventana 8
    @FXML
    private Label myLabel8;
    @FXML
    private Slider mySlider;

    int myTemperature;

    //VENTANA 9
    @FXML
    private TreeView treeview;

    public void selectItem(){
    }

    @FXML
    public TextField TextField12;

    @FXML
    protected void Button12(){
        Alert alert =  new Alert(Alert.AlertType.ERROR);
        alert.setTitle("ALERTAAA");
        alert.setContentText("Esta es una alerta");
        Optional<ButtonType> result = alert.showAndWait();
    }

    @FXML
    public DatePicker DataPicker1;






}