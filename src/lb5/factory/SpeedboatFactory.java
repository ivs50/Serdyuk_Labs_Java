package lb5.factory;

import lb5.Rescueboat;
import lb5.SpeedboatInterface;

import java.util.ArrayList;
import java.util.Random;

public class SpeedboatFactory {
    public SpeedboatInterface getSpeedboat(String speedboatName) {
        Random random = new Random();
        if (speedboatName == null) {
            return  null;
        }
        if (speedboatName.equalsIgnoreCase("Rescueboat")) {
            return new Rescueboat(random.nextInt(20)+7,
                    random.nextInt(5)+3, random.nextInt(300)+200,
                    random.nextInt(10)+3, getRandomTypeRescueboat());
        }
        return null;
    }

    public String getRandomTypeRescueboat() {
        ArrayList<String> listTypeRescueboat = new ArrayList<>();
        listTypeRescueboat.add("Rescue");
        listTypeRescueboat.add("Firefighter");
        listTypeRescueboat.add("Fire and rescue");
        return listTypeRescueboat.get(new Random().nextInt(3));
    }
}
