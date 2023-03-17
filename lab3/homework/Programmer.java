package lab3.homework;
import lab3.homework.Person;
public class Programmer extends Person{
    private String[] languagesUsed;
    public Programmer(String name, String birthDate, String[] languagesUsed) {
        super(name, birthDate);
        this.languagesUsed = languagesUsed;
    }

    public String[] getLanguagesUsed() {
        return languagesUsed;
    }
}
