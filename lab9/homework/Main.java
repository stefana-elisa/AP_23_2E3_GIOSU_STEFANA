package homework;

import com.github.javafaker.Faker;
import homework.repositories.AlbumRepository;
import homework.repositories.ArtistRepository;

public class Main {
    public static void main(String[] args) {
        long start = System.nanoTime();

        ArtistRepository artistRepository = new ArtistRepository();
        AlbumRepository albumRepository = new AlbumRepository();


        Faker faker = new Faker();

        System.out.println(albumRepository.findByTitle("Chief Accountability Executive"));

        long finish = System.nanoTime();
        System.out.println("The execution time is " + (finish - start));
    }
}