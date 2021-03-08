package kanban;

import javax.persistence.*;
import java.util.List;

@Entity
public class SondageLieu extends Sondage{
    private List<Lieu> lieu;
    private long id;

    public SondageLieu(){}

    public SondageLieu(List<Lieu> lieu) {
        this.lieu = lieu;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() { return id;}
    public void setId(long id) {this.id = id;}

    @OneToMany
    public List<Lieu> getLieu() {
        return lieu;
    }

    public void setLieu(List<Lieu> lieu) {
        this.lieu = lieu;
    }
}

