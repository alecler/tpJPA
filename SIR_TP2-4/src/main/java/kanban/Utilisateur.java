package kanban;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Utilisateur {


    private int id;
    private String nom;
    private String prenom;
    private List<Fiche> ficheList;

    public Utilisateur() {}

    public Utilisateur(int id, String nom, String prenom, List<Fiche> ficheList) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.ficheList = ficheList;
    }

    @Id
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @OneToMany
    public List<Fiche> getFicheList() {
        return ficheList;
    }

    public void setFicheList(List<Fiche> ficheList) {
        this.ficheList = ficheList;
    }
}
