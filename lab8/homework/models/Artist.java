package lab8.compulsory.models;

public class Artist extends Model{
    int id;
    String name;

    public Artist(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", name=" + name + '}';
    }
}
