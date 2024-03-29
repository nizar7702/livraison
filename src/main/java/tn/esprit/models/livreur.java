package tn.esprit.models;

public class livreur {
    private int id;
    private String nom;
    private String prénom;
    private int age;
    private int tel;

    public livreur() {
    }
    public livreur(int cin) {
        this.id= cin;
    }

    public livreur(int id, String nom, String prénom, int age, int tel) {
        this.id = id;
        this.nom = nom;
        this.prénom = prénom;
        this.age = age;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "livreur{" +
                "cin=" + id +
                ", nom='" + nom + '\'' +
                ", prénom='" + prénom + '\'' +
                ", age=" + age +
                ", tel=" + tel +
                '}';
    }
}
