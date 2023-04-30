package lab8.compulsory;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            DatabaseUtils.createConnection();
            var artists = new ArtistDAO();
            artists.create("Pink Floyd");
            artists.create("Michael Jackson");
            var genres = new GenreDAO();
            genres.create("Rock");
            genres.create("Funk");
            genres.create("Soul");
            genres.create("Pop");
            DatabaseUtils.getConnection().commit();
            var albums = new AlbumDAO();
            albums.create(1997, "The Wall", "Pink Floyd", "Rock");
//findByName
            albums.create(1982, "Thriller", "Michael Jackson","Funk,Soul,Pop");
            DatabaseUtils.getConnection().commit();

            //TODO: print all the albums in the database
            System.out.println(albums.getAll());

            DatabaseUtils.getConnection().close();
        } catch (SQLException e) {
            System.err.println(e);
            DatabaseUtils.rollback();
        }
    }
}