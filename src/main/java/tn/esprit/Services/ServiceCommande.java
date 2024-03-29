package tn.esprit.Services;

import tn.esprit.interfaces.IService;
import tn.esprit.models.client;
import tn.esprit.models.commande;
import utils.MyDataBase;

import java.sql.*;
import java.util.ArrayList;

public class ServiceCommande implements IService<commande> {
    private Connection cnx ;
    public ServiceCommande(){
        cnx = MyDataBase.getInstance().getCnx();
    }
    public commande getById(int id) {
        commande commande = null;
        String qry = "SELECT * FROM `commande` WHERE `id` = ?";
        try {
            PreparedStatement stm = cnx.prepareStatement(qry);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                commande = new commande();
                commande.setId(rs.getInt("id"));
                // Set other fields as needed
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return commande;
    }
    public void add (commande commande){
    };
    public ArrayList<commande> getAll(){
        return null;
    }
    public void update(commande c1){};
    public boolean delete(commande c1){ return false;};

}
