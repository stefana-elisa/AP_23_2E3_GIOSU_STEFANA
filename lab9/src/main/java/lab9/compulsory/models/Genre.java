package lab9.compulsory.models;

import javax.persistence.*;

@Entity
@Table(name = "genres")
@NamedQueries({
        @NamedQuery(name = "genres.findAll",
                query = "select e from genres e order by e.name"),
})
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "id")
    @Column(name = "id")
    int id;
    @Column(name = "name")
    String name;

    public Genre(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", name=" + name + '}';
    }
}
