package tn.esprit.controllers;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import tn.esprit.models.livreur;

public class DetailsViewController {

    @FXML
    private Label idLabel;
    @FXML
    private Label nameLabel;
    @FXML
    private Label prenomLabel;
    @FXML
    private Label ageLabel;
    @FXML
    private Label telLabel;

    // Other fields...

    public void setLivreur(livreur livreur) {
        idLabel.setText("id--->"+String.valueOf(livreur.getId()));
        nameLabel.setText("nom--->"+livreur.getNom());
        prenomLabel.setText("prenom--->"+livreur.getPrénom());
        ageLabel.setText("age--->"+String.valueOf(livreur.getAge()));
        telLabel.setText("livreur--->"+String.valueOf(livreur.getTel()));

    }
}

