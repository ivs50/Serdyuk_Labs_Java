package lb5.factory;

import lb5.AtomikSubmarine;
import lb5.DieselElectricSubmarines;
import lb5.SubmarineInterface;
import java.util.ArrayList;
import java.util.Random;

public class SubmarineFactory {
    public SubmarineInterface getSubmarine(String submarineName) {
        Random random = new Random();
        if (submarineName == null) {
            return  null;
        }
        if (submarineName.equalsIgnoreCase("AtomikSubmarine")) {
            return new AtomikSubmarine(random.nextInt(150)+100,
                    random.nextInt(48000)+14000, random.nextInt(600)+400,
                    random.nextInt(30)+20, getRandomTypeAtomikSubmarine());
        }
        else if (submarineName.equalsIgnoreCase("DieselElectricSubmarines")) {
            return new DieselElectricSubmarines(random.nextInt(80)+50,
                    random.nextInt(12000)+4000, random.nextInt(200)+100,
                    random.nextInt(20)+10, getRandomDieselElectricSubmarines());
        }
        return null;
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
}
