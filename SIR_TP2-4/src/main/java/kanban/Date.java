package kanban;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

public class Date {
    private Date date;
    private List<SondageDate> listSondageDate;
    private long id;


    public Date() {
    }

    public Date(Date date, List<SondageDate> listSondageDate) {
        this.date = date;
        this.listSondageDate = listSondageDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() { return id;}
    public void setId(long id) {this.id = id;}

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @OneToMany
    public List<SondageDate> getListSondageDate() {
        return listSondageDate;
    }

    public void setListSondageDate(List<SondageDate> listSondageDate) {
        this.listSondageDate = listSondageDate;
    }
}
