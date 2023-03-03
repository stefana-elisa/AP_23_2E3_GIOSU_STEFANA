package lab2.compulsory;
/**
 *
 * @author Giosu Stefana
 */

public class Main {
    public static void main(String[] args) {

        Location locatie = new Location("McDonalds", LocationType.RESTAURANT, 4.135, 19.222);
        Road strada = new Road("Str 1", RoadType.FREEWAY, 1400, 90);

        locatie.setX(51.23456);
        locatie.setY(66.9011);

        strada.setType(RoadType.HIGHWAY);
        strada.setSpeedLimit(130);

        System.out.println("Locatia unde vrem sa ajungem este " + locatie.getName() + ", este de tip " + locatie.getType() + " si are coordonatele x=" + locatie.getX() + " si y=" + locatie.getY());
        System.out.println("Vom lua strada de tip " + strada.getType() + " cu lungimea de " + strada.getLength() + " km si limita de viteza " + strada.getSpeedLimit() + " km/h");

    }
}