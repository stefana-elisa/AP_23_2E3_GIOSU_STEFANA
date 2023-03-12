package lab2.homework;

/**
 *
 * @author Giosu Stefana
 */

public class Main {
    public static void main(String[] args) {

        Location locatie1 = new Restaurant("KFC", 3.2345678, 8.347321, 5, "crispy", "Mister");

        Location locatie2 = new Hotel("Hasbin", 5.467, 18.45678, 20, "Dude");

        Location locatie3 = new City("Acolea", 281.21214, 11.652345, 5000, "Gigel Nustiucum");

        Road strada1 = new Highway("E5", 27, 90, locatie1, locatie2, 5.12, 5, 2);

        Road strada2 = new PrivateRoad("Hehe", 150, 130, locatie1, locatie3, "Mateius", 10);

        Road[] roads_location1 = {strada2, strada1};
        locatie1.setConvergentRoads(roads_location1);

        Road[] roads_location2 = {strada1};
        locatie2.setConvergentRoads(roads_location2);

        Road[] roads_location3 = {strada2};
        locatie3.setConvergentRoads(roads_location3);

        Problem problemaTest = new Problem();
        Location[] locations = {locatie1, locatie2};
        problemaTest.setLocations(locations);
    }
}