package lb1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        showShip(randomShip(12));
    }
    public static ArrayList<Ship> randomShip (int n) {
        Random random = new Random();
        ArrayList<Ship> shipArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            switch (random.nextInt(3)){
                case 0 -> shipArray.add(new AtomikSubmarine(random.nextInt(150)+100,
                        random.nextInt(48000)+14000, random.nextInt(600)+400,
                        random.nextInt(30)+20, getRandomTypeAtomikSubmarine()));
                case 1 -> shipArray.add(new Rescueboat(random.nextInt(20)+7,
                        random.nextInt(5)+3, random.nextInt(300)+200,
                        random.nextInt(10)+3, getRandomTypeRescueboat()));
                case 2 -> shipArray.add(new DieselElectricSubmarines(random.nextInt(80)+50,
                        random.nextInt(12000)+4000, random.nextInt(200)+100,
                        random.nextInt(20)+10, getRandomDieselElectricSubmarines()));
            }
        }
        return shipArray;
    }

    public static void showShip(ArrayList<Ship> shipArray) {
        for (Ship ship : shipArray) {
            System.out.println(ship.getDescription());
        }
    }

    public static String getRandomTypeAtomikSubmarine() {
        ArrayList<String> listTypeAtomikSubmarin = new ArrayList<>();
        listTypeAtomikSubmarin.add("Multi - purpose");
        listTypeAtomikSubmarin.add("Special purpose");
        listTypeAtomikSubmarin.add("Strategic");
        return listTypeAtomikSubmarin.get(new Random().nextInt(3));
    }

    public static String getRandomTypeRescueboat() {
        ArrayList<String> listTypeRescueboat = new ArrayList<>();
        listTypeRescueboat.add("Rescue");
        listTypeRescueboat.add("Firefighter");
        listTypeRescueboat.add("Fire and rescue");
        return listTypeRescueboat.get(new Random().nextInt(3));
    }

    public static String getRandomDieselElectricSubmarines() {
        ArrayList<String> listTypeDieselElectricSubmarines = new ArrayList<>();
        listTypeDieselElectricSubmarines.add("With cruise missiles");
        listTypeDieselElectricSubmarines.add("With ballistic missiles");
        listTypeDieselElectricSubmarines.add("With torpedo missiles");
        return  listTypeDieselElectricSubmarines.get(new Random().nextInt(3));
    }
}
