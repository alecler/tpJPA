package kanban;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Access(AccessType.PROPERTY)
public class Fiche {

    private String libelle;
    private String date_butoire;
    private Utilisateur user_affection;
    private int temps;
    private List<Tag> tagsList;
    private String lieu;
    private String url;
    private String note_explicative;

    public Fiche() {
    }

    public Fiche(String libelle, String date_butoire, Utilisateur user_affection, int temps, List<Tag> tagsList, String lieu, String url, String note_explicative) {
        this.libelle = libelle;
        this.date_butoire = date_butoire;
        this.user_affection = user_affection;
        this.temps = temps;
        this.tagsList = tagsList;
        this.lieu = lieu;
        this.url = url;
        this.note_explicative = note_explicative;
    }

    @Id
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDate_butoire() {
        return date_butoire;
    }

    public void setDate_butoire(String date_butoire) {
        this.date_butoire = date_butoire;
    }

    @ManyToOne
    public Utilisateur getUser_affection() {
        return user_affection;
    }

    public void setUser_affection(Utilisateur user_affection) {
        this.user_affection = user_affection;
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

    @OneToMany
    public List<Tag> getTagsList() {
        return tagsList;
    }

    public void setTagsList(List<Tag> tagsList) {
        this.tagsList = tagsList;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNote_explicative() {
        return note_explicative;
    }

    public void setNote_explicative(String note_explicative) {
        this.note_explicative = note_explicative;
    }
}
