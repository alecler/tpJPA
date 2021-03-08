package kanban;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tag {
    private String libelle;
    private List<Fiche> listFiche;


    public Tag() {
    }

    public Tag(String libelle, List<Fiche> listFiche) {
        this.libelle = libelle;
        this.listFiche = listFiche;
    }


    @Id
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @OneToMany
    public List<Fiche> getListFiche() {
        return listFiche;
    }

    public void setListFiche(List<Fiche> listFiche) {
        this.listFiche = listFiche;
    }
}
