package kanban;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

public class Lieu {
    private String lieu;
    private List<SondageLieu> listSondageLieu;
    private long id;


    public Lieu() {
    }

    public Lieu(String lieu, List<SondageLieu> listSondageLieu) {
        this.lieu = lieu;
        this.listSondageLieu = listSondageLieu;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() { return id;}
    public void setId(long id) {this.id = id;}

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String date) {
        this.lieu = lieu;
    }

    @OneToMany
    public List<SondageLieu> getListSondageLieu() {
        return listSondageLieu;
    }

    public void setListSondageLieu(List<SondageLieu> listSondageLieu) {
        this.listSondageLieu = listSondageLieu;
    }
}
