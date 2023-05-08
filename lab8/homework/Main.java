package lab8.compulsory;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        /*try {
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
        }*/
        readDataLineByLine("D:\\Stef\\Documents\\faculta\\sem 4\\pa\\lab8\\src\\main\\resources\\albumlist.csv");
    }

    public static void readDataLineByLine(String file)
    {
        int contor = 1;

        try {

            // Create an object of filereader
            // class with CSV file as a parameter.
            FileReader filereader = new FileReader(file);

            // create csvReader object passing
            // file reader as a parameter
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;

            // we are going to read data line by line
            while ((nextRecord = csvReader.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.print(cell + " " + contor + "\t");
                    contor++;
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}