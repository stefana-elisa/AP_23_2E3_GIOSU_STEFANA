package homework.repositories;

import homework.entities.Genre;

import java.util.List;

public class GenreRepository extends DataRepository<Genre, Long> {

    public Class<Genre> getEntityClass() {
        return Genre.class;
    }

    public GenreRepository() {
    }

    public List<Genre> findByName(String name) {
        return getEntityManager()
                .createNamedQuery("Genre.findByArtist")
                .setParameter(1, name)
                .getResultList();
    }

    public List<Genre> findById(int id) {
        return getEntityManager()
                .createNamedQuery("Genre.findById")
                .setParameter(1, id)
                .getResultList();
    }

    public void create(Genre genre) {
        save(genre);
    }
}