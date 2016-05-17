package www.suonsamnang.com.intentexamplewithobject.Models;

import java.io.Serializable;

public class Personne implements Serializable {

    private String nom, prenom;
    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age) { this.age = age; }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String toString() {
        return "Nom : " + nom + "\n" + "Prénom : " + prenom + "\n" + "Âge : " + age;
    }
}