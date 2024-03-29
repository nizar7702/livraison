package tn.esprit.models;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class livraison {
    private int id;
    private livreur livreur;
    private chef chef;
    private String adresse_source;
    private String adresse_destination;
    private Feedback_livraison Feedback_liv;
    private Réclamation réclamation;
    private boolean state_reception;
    private boolean state_delivery;
    private Timestamp time_start;
    private Timestamp time_end;
    private commande commande;

    public livraison(int id, tn.esprit.models.livreur livreur, tn.esprit.models.chef chef, String adresse_source, String adresse_destination, Feedback_livraison feedback_liv, Réclamation réclamation, boolean state_reception, boolean state_delivery, Timestamp time_start, Timestamp time_end, tn.esprit.models.commande commande) {
        this.id = id;
        this.livreur = livreur;
        this.chef = chef;
        this.adresse_source = adresse_source;
        this.adresse_destination = adresse_destination;
        Feedback_liv = feedback_liv;
        this.réclamation = réclamation;
        this.state_reception = state_reception;
        this.state_delivery = state_delivery;
        this.time_start = time_start;
        this.time_end = time_end;
        this.commande = commande;
    }

    public livraison(int id) {
        this.id = id;
    }

    public livraison() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public tn.esprit.models.livreur getLivreur() {
        return livreur;
    }

    public void setLivreur(tn.esprit.models.livreur livreur) {
        this.livreur = livreur;
    }

    public tn.esprit.models.chef getChef() {
        return chef;
    }

    public void setChef(tn.esprit.models.chef chef) {
        this.chef = chef;
    }

    public String getAdresse_source() {
        return adresse_source;
    }

    public void setAdresse_source(String adresse_source) {
        this.adresse_source = adresse_source;
    }

    public String getAdresse_destination() {
        return adresse_destination;
    }

    public void setAdresse_destination(String adresse_destination) {
        this.adresse_destination = adresse_destination;
    }

    public Feedback_livraison getFeedback_liv() {
        return Feedback_liv;
    }

    public void setFeedback_liv(Feedback_livraison feedback_liv) {
        Feedback_liv = feedback_liv;
    }

    public Réclamation getRéclamation() {
        return réclamation;
    }

    public void setRéclamation(Réclamation réclamation) {
        this.réclamation = réclamation;
    }

    public boolean isState_reception() {
        return state_reception;
    }

    public void setState_reception(boolean state_reception) {
        this.state_reception = state_reception;
    }

    public boolean isState_delivery() {
        return state_delivery;
    }

    public void setState_delivery(boolean state_delivery) {
        this.state_delivery = state_delivery;
    }

    public Timestamp getTime_start() {
        return time_start;
    }

    public void setTime_start(Timestamp time_start) {
        this.time_start = time_start;
    }

    public Timestamp getTime_end() {
        return time_end;
    }

    public void setTime_end(Timestamp time_end) {
        this.time_end = time_end;
    }

    public tn.esprit.models.commande getCommande() {
        return commande;
    }

    public void setCommande(tn.esprit.models.commande commande) {
        this.commande = commande;
    }

    @Override
    public String toString() {
        return "livraison{" +
                "id=" + id +
                ", livreur=" + livreur +
                ", chef=" + chef +
                ", adresse_source='" + adresse_source + '\'' +
                ", adresse_destination='" + adresse_destination + '\'' +
                ", Feedback_liv=" + Feedback_liv +
                ", réclamation=" + réclamation +
                ", state_reception=" + state_reception +
                ", state_delivery=" + state_delivery +
                ", time_start=" + time_start +
                ", time_end=" + time_end +
                ", commande=" + commande +
                '}';
    }
}

