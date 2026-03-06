package com.example.multa;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class HelloController {

    @FXML
    private TextField txtNominativo;

    @FXML
    private TextField txtDocumento;

    @FXML
    private TextField txtNumeroDocumento;

    @FXML
    private TextField txtRilascio;

    @FXML
    private TextField txtScadenza;

    @FXML
    private TextArea txtOutput;

    private Lista lista = new Lista();

    @FXML
    protected void onAggiungiClick() {

        String nominativo = txtNominativo.getText();
        String documento = txtDocumento.getText();
        String numero = txtNumeroDocumento.getText();

        LocalDate rilascio = LocalDate.parse(txtRilascio.getText());
        LocalDate scadenza = LocalDate.parse(txtScadenza.getText());

        Multa multa = new Multa(nominativo, documento, numero, rilascio, scadenza);

        lista.aggiungi(multa);

        txtOutput.setText("Multa aggiunta!\n");
    }

    @FXML
    protected void onVisualizzaClick() {

        txtOutput.clear();
        lista.resetIteratore();

        Multa multa;

        while ((multa = lista.visita()) != null) {
            txtOutput.appendText(multa.toString() + "\n\n");
        }
    }
}