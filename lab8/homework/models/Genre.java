package lab8.compulsory.models;

public class Genre extends Model{
    int id;
    String name;

    public Genre(int id, String name) {
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
        return "Genre{" +
                "id=" + id +
                ", name=" + name + '}';
    }
}
