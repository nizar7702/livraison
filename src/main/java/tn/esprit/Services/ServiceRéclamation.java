package tn.esprit.Services;

import tn.esprit.interfaces.IService;
import tn.esprit.models.Réclamation;
import tn.esprit.models.livreur;
import utils.MyDataBase;

import java.sql.*;
import java.util.ArrayList;

public class ServiceRéclamation implements IService<Réclamation> {
    private Connection cnx ;
    public ServiceRéclamation(){
        cnx = MyDataBase.getInstance().getCnx();
    }
    public void add (Réclamation réclamation){
        String qry ="INSERT INTO `réclamation`(`date_réclamation`, `cause_réclamation`) VALUES (?,?)";
        try {
            PreparedStatement stm = cnx.prepareStatement(qry);
            stm.setTimestamp(1,réclamation.getDate_Réclamation());
            stm.setString(2,réclamation.getCause_Réclamation());
            stm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

    }
    public ArrayList<Réclamation> getAll(){
        ArrayList<Réclamation> réclamations= new ArrayList();
        String qry ="SELECT * FROM `réclamation`";
        try {
            Statement stm = cnx.createStatement();
            ResultSet rs = stm.executeQuery(qry);
            while (rs.next()){
                Réclamation Rec= new Réclamation();
                Rec.setId(rs.getInt(1));
                Rec.setDate_Réclamation(rs.getTimestamp(2));
                Rec.setCause_Réclamation(rs.getString(3));
                réclamations.add(Rec);
            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return réclamations;
    };
    public void update(Réclamation Rec){};
    public boolean delete(Réclamation Rec){ return false;};
    public Réclamation getById(int id) {
        Réclamation réclamation = null;
        String qry = "SELECT * FROM `réclamation` WHERE `id` = ?";
        try {
            PreparedStatement stm = cnx.prepareStatement(qry);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                réclamation = new Réclamation();
                réclamation.setDate_Réclamation(rs.getTimestamp("date_réclamation"));
                réclamation.setCause_Réclamation(rs.getString("cause_réclamation"));
                // Set other fields as needed
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return réclamation;
    }
    public Réclamation getReclamationId(Réclamation reclamation) {
        String qry = "SELECT `id` FROM `réclamation` WHERE `date_réclamation` = ? AND `cause_réclamation` = ?";
        int id = -1;
        try {
            PreparedStatement stm = cnx.prepareStatement(qry);
            stm.setTimestamp(1, reclamation.getDate_Réclamation());
            stm.setString(2, reclamation.getCause_Réclamation());
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return new Réclamation(id);
    }




}
