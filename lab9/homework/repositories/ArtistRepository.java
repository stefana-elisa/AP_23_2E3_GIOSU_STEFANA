package homework.repositories;

import homework.entities.Artist;

import java.util.List;

public class ArtistRepository extends DataRepository<Artist, Long> {
    public Class<Artist> getEntityClass() {
        return Artist.class;
    }

    public ArtistRepository() {
    }

    public List<Artist> findByName(String name) {
        return getEntityManager()
                .createNamedQuery("Artist.findByArtist", Artist.class)
                .setParameter(1, name)
                .getResultList();
    }

    public List<Artist> findById(int id) {
        return getEntityManager()
                .createNamedQuery("Artist.findById", Artist.class)
                .setParameter(1, id)
                .getResultList();
    }

    public void create(Artist artist) {
        save(artist);
    }
}
