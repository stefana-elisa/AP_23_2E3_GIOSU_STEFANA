package lab8.compulsory.models;

public class Album extends Model{
    int id;
    String name;
    int year;
    String artist;

    public Album(int id, String name, int year, String artist) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.artist = artist;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public String getArtist() {
        return artist;
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
