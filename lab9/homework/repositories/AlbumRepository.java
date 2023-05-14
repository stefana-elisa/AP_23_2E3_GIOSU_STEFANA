package homework.repositories;

import homework.entities.Album;

import java.util.List;

public class AlbumRepository extends DataRepository<Album, Long> {
    public Class<Album> getEntityClass() {
        return Album.class;
    }

    public AlbumRepository() {

    }

    public List<Album> findByTitle(String title) {
        return getEntityManager()
                .createNamedQuery("Album.findByName")
                .setParameter(1, title)
                .getResultList();
    }

    public List<Album> findById(int id) {
        return getEntityManager().
                createNamedQuery("Album.findById")
                .setParameter(1, id)
                .getResultList();
    }

    public void create(Album album) {
        save(album);
    }
}
