package kanban;

import javax.persistence.*;
import java.util.List;

@Entity
public class SondageDateLieu extends Sondage{
    private List<Date> date;
    private List<Lieu> lieu;
    private long id;

    public SondageDateLieu(){}

    public SondageDateLieu (List<Date> date, List<Lieu> lieu) {
        this.date = date;
        this.lieu = lieu;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() { return id;}
    public void setId(long id) {this.id = id;}

    @OneToMany
    public List<Date> getDate() {
        return date;
    }

    public void setDate(List<Date> date) {
        this.date = date;
    }

    @OneToMany
    public List<Lieu> getLieu() {
        return lieu;
    }

    public void setLieu(List<Lieu> lieu) {
        this.lieu = lieu;
    }
}


