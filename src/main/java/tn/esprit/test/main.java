package tn.esprit.test;

import javafx.application.Application;
import tn.esprit.Services.*;
import tn.esprit.models.*;
import utils.MyDataBase;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class main {
    public static void main(String[] args) {
        /*MyDataBase m=MyDataBase.getInstance();
        livreur l=new livreur(5555,"hhhhhhhh","iiiiii",34,233242);
        ServiceLivreur Sliv=new ServiceLivreur();
        Sliv.add(l);
        client cl=new client(1,"jjjjjjj","kkkkkkkk",34,23232);
        ServiceClient Scl=new ServiceClient();
        Scl.add(cl);
        chef chf=new chef(1,"llllllll","mmmmmmmmmm",45,24353);
        ServiceChef schef=new ServiceChef();
        schef.add(chf);
        Feedback_livraison FB =new Feedback_livraison(1,4,2);
        Service_FeedBack_livraison sFB_liv=new Service_FeedBack_livraison();
        sFB_liv.add(FB);
        Réclamation rec=new Réclamation(1,new Timestamp(System.currentTimeMillis()),"not payed");
        ServiceRéclamation srec=new ServiceRéclamation();
        srec.add(rec);
        livraison liv=new livraison(1,Sliv.getLivreurId(l),schef.getChefId(chf),"abc","efg",sFB_liv.getFeedbackLivraisonId(FB),null,false,false,new Timestamp(System.currentTimeMillis()),new Timestamp(System.currentTimeMillis()),new commande(1));*/
        //ServiceLivraison serviceLivraison=new ServiceLivraison();
        //System.out.println(serviceLivraison.getLivraisonsWithReclamation());
        Application.launch(MainFx.class,args);
    }
}
