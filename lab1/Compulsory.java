package lab1;
/**
 *
 * @author Giosu Stefana
 */
public class Compulsory {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String[] languages = new String[]{"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000);

        n *= 3;
        n = n + Integer.parseInt("10101",2);
        n = n + Integer.parseInt("FF", 16);
        n *= 6;

        int suma = 0;

        while(n / 10 > 0) {
            suma = 0;
            while (n > 0) {
                suma = suma + n % 10;
                n = n / 10;
            }
            n = suma;
        }

        System.out.println("Willy-nilly, this semester I will learn " + languages[n]);
    }
}