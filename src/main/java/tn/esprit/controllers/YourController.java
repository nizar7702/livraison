package tn.esprit.controllers;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import tn.esprit.Services.ServiceLivraison;
import tn.esprit.Services.ServiceLivreur;
import tn.esprit.models.*;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;


public class YourController {

    @FXML
    private TableView<livraison> table;
    @FXML
    private TableColumn<livraison, Integer> idColumn;
    @FXML
    private TableColumn<livraison, livreur> livreurColumn;
    @FXML
    private TableColumn<livraison, chef> chefColumn;
    @FXML
    private TableColumn<livraison, String> adresse_source;

    @FXML
    private TableColumn<livraison, String> adresse_destination;
    @FXML
    private TableColumn<livraison, Feedback_livraison> Feedback_liv;
    @FXML
    private TableColumn<livraison, Réclamation> réclamation;
    @FXML
    private TableColumn<livraison, Timestamp> time_start;
    @FXML
    private TableColumn<livraison, commande> commande;

    // Add other TableColumn fields as needed

    @FXML
    public void initialize() {
        // Initialize the table columns
        idColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getId()));
        livreurColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getLivreur()));
        chefColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getChef()));
        adresse_source.setCellValueFactory(cellData->new SimpleObjectProperty<>(cellData.getValue().getAdresse_source()));
        adresse_destination.setCellValueFactory(cellData->new SimpleObjectProperty<>(cellData.getValue().getAdresse_destination()));
        Feedback_liv.setCellValueFactory(cellData->new SimpleObjectProperty<>(cellData.getValue().getFeedback_liv()));
        réclamation.setCellValueFactory(cellData->new SimpleObjectProperty<>(cellData.getValue().getRéclamation()));
        time_start.setCellValueFactory(cellData->new SimpleObjectProperty<>(cellData.getValue().getTime_start()));
        commande.setCellValueFactory(cellData->new SimpleObjectProperty<>(cellData.getValue().getCommande()));
        livreurColumn.setCellFactory(param -> new TableCell<>() {
            final Button btn = new Button("Show Details");

            @Override
            public void updateItem(livreur item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    btn.setText(item.getNom());
                    btn.setOnAction(event -> {
                        try {
                            // Get the livreur details
                            ServiceLivreur serviceLivreur = new ServiceLivreur();
                            livreur livreurDetails = serviceLivreur.getById(item.getId());

                            // Load the FXML file for the new stage
                            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/DetailsView.fxml"));
                            Parent root = fxmlLoader.load();

                            // Get the controller of the new stage
                            DetailsViewController controller = fxmlLoader.getController();

                            // Pass the livreur details to the controller
                            controller.setLivreur(livreurDetails);

                            // Create the new stage
                            Stage detailsStage = new Stage();
                            detailsStage.setTitle("Livreur Details");
                            detailsStage.setScene(new Scene(root));

                            // Show the new stage
                            detailsStage.show();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

                    setGraphic(btn);
                }
                setText(null);
            }
        });


        // Add cell value factories for other columns

        // Load the data
        table.setItems(FXCollections.observableArrayList(new ServiceLivraison().getAll()));
    }

}
