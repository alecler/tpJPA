package kanban;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="sondage")
@Inheritance(strategy = InheritanceType.JOINED)

public class Sondage {
    private long id;
    private List<SondageDate> sondageDate;
    private List<SondageLieu> sondageLieu;
    private List<SondageDateLieu> sondageDateLieu;

    public Sondage() {
    }

    public Sondage(List<SondageDate> sondageDate, List<SondageLieu> sondageLieu, List<SondageDateLieu> sondageDateLieu) {
        this.sondageDate = sondageDate;
        this.sondageLieu = sondageLieu;
        this.sondageDateLieu = sondageDateLieu;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() { return id;}
    public void setId(long id) {this.id = id;}

    @OneToMany
    public List<SondageDate> getSondageDate() {
        return sondageDate;
    }

    public void setSondageDate(List<SondageDate> sondageDate) {
        this.sondageDate = sondageDate;
    }

    @OneToMany
    public List<SondageLieu> getSondageLieu() {
        return sondageLieu;
    }

    public void setSondageLieu(List<SondageLieu> sondageLieu) {
        this.sondageLieu = sondageLieu;
    }

    @OneToMany
    public List<SondageDateLieu> getSondageDateLieu() {
        return sondageDateLieu;
    }

    public void setSondageDateLieu(List<SondageDateLieu> sondageDateLieu) {
        this.sondageDateLieu = sondageDateLieu;
    }
}
