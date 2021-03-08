package kanban;

import javax.persistence.*;
import java.util.List;

@Entity
public class SondageDate extends Sondage{
    private List<Date> date;
    private long id;

    public SondageDate(){}

    public SondageDate (List<Date> date) {
        this.date = date;
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
}
