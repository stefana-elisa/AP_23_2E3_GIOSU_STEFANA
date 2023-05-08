package lab9.compulsory.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "albums")
@NamedQueries({
        @NamedQuery(name = "albums.findAll",
                query = "select e from albums e order by e.name"),
})
public class Album implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "id")
    @Column(name = "id")
    int id;
    @Column(name = "year")
    int year;
    @Column(name = "name")
    String name;
    @Column(name = "artist")
    int artist;

    public Album(int id, int year, String name, int artist) {
        this.id = id;
        this.year = year;
        this.name = name;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", year=" + year +
                ", title='" + name + '\'' +
                ", artist=" + artist +
                '}';
    }
}
