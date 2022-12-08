package lb6.Factory;

import lb6.*;
import lb6.Chinese.ChineseAtomikSubmarine;
import lb6.Chinese.ChineseDieselElectricSubmarines;
import lb6.Chinese.ChineseRescueboat;
import java.util.Random;
import java.util.ArrayList;

public class ChineseShipFactory implements ShipFactory {
    private final Random random = new Random();
    @Override
    public AtomikSubmarineInterface getAtomikSubmarine() {
        return new ChineseAtomikSubmarine(random.nextInt(150)+100,
                random.nextInt(48000)+14000, random.nextInt(600)+400,
                random.nextInt(30)+20, getRandomTypeAtomikSubmarine());
    }

    @Override
    public DieselElectricSubmarineInterface getDieselElectricSubmarines() {
        return new ChineseDieselElectricSubmarines(random.nextInt(80)+50,
                random.nextInt(12000)+4000, random.nextInt(200)+100,
                random.nextInt(20)+10, getRandomDieselElectricSubmarines());
    }

    @Override
    public RescueboatInterface getRescueboat() {
        return new ChineseRescueboat(random.nextInt(20)+7,
                random.nextInt(5)+3, random.nextInt(300)+200,
                random.nextInt(10)+3, getRandomTypeRescueboat());
    }

    public String getRandomTypeAtomikSubmarine() {
        ArrayList<String> listTypeAtomikSubmarin = new ArrayList<>();
        listTypeAtomikSubmarin.add("Multi - purpose");
        listTypeAtomikSubmarin.add("Special purpose");
        listTypeAtomikSubmarin.add("Strategic");
        return listTypeAtomikSubmarin.get(new Random().nextInt(3));
    }

    public String getRandomDieselElectricSubmarines() {
        ArrayList<String> listTypeDieselElectricSubmarines = new ArrayList<>();
        listTypeDieselElectricSubmarines.add("With cruise missiles");
        listTypeDieselElectricSubmarines.add("With ballistic missiles");
        listTypeDieselElectricSubmarines.add("With torpedo missiles");
        return  listTypeDieselElectricSubmarines.get(new Random().nextInt(3));
    }

    public String getRandomTypeRescueboat() {
        ArrayList<String> listTypeRescueboat = new ArrayList<>();
        listTypeRescueboat.add("Rescue");
        listTypeRescueboat.add("Firefighter");
        listTypeRescueboat.add("Fire and rescue");
        return listTypeRescueboat.get(new Random().nextInt(3));
    }
}
