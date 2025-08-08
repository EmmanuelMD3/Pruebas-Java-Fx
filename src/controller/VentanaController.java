package controller;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class VentanaController
{

    @FXML
    private TextField campoNombre;

    @FXML
    private Label etiquetaSaludo;

    @FXML
    private Rectangle fondoAnimado;

    private Timeline timeline;

    @FXML
    private void saludar()
    {
        String nombre = campoNombre.getText();

        if (nombre == null || nombre.isEmpty())
        {
            etiquetaSaludo.setText("Por favor, ingrese un nombre.");
            detenerAnimacion();
        } else
        {
            etiquetaSaludo.setText("Hola, " + nombre + "!");
            iniciarAnimacion();
        }
    }

    private void iniciarAnimacion()
    {
        if (timeline == null)
        {
            timeline = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(fondoAnimado.fillProperty(), Color.LIGHTBLUE)),
                    new KeyFrame(Duration.seconds(3), new KeyValue(fondoAnimado.fillProperty(), Color.LIGHTGREEN))
            );
            timeline.setCycleCount(Timeline.INDEFINITE);
            timeline.setAutoReverse(true);
        }
        timeline.play();
    }

    private void detenerAnimacion()
    {
        if (timeline != null)
        {
            timeline.stop();
            fondoAnimado.setFill(Color.LIGHTBLUE); 
        }
    }
}
