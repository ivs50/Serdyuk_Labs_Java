package lb7;

import java.util.*;

public class Main {
    public static Iterator<Room> iterator;
    public static int squareFirstLevel;
    public static int squareSecondLevel;
    public static int squareThirdLevel;
    public static int squareKitchens;
    public static int squareHalls;
    public static int squareBedrooms;

    public static void main(String[] args) {
        Room[] level1 = new Room [8];
        ArrayList<Room> level2 = new ArrayList<>();
        LinkedList<Room> level3 = new LinkedList<>();
        for (int n = 0; n < 8; n++) {
            level1[n] = new Room(getRandomTypeRoom(), getRandomSquareRoom());
            level2.add(new Room(getRandomTypeRoom(), getRandomSquareRoom()));
            level3.add(new Room(getRandomTypeRoom(), getRandomSquareRoom()));
        }
        System.out.println(sumsSquare(level1, level2, level3));
    }

    public static String sumsSquare(Room[] level1, ArrayList<Room> level2, LinkedList<Room> level3) {
        Room room;
        squareFirstLevel = 0;
        squareSecondLevel = 0;
        squareThirdLevel = 0;
        squareKitchens = 0;
        squareHalls = 0;
        squareBedrooms = 0;

        iterator = Arrays.stream(level1).iterator();
        while (iterator.hasNext()) {
            room = iterator.next();
            squareFirstLevel += room.getSquare();
            sumsSquareTypeRoom(room);
        }
        iterator = level2.iterator();
        while (iterator.hasNext()) {
            room = iterator.next();
            squareSecondLevel += room.getSquare();
            sumsSquareTypeRoom(room);
        }
        iterator = level3.iterator();
        while (iterator.hasNext()) {
            room = iterator.next();
            squareThirdLevel += room.getSquare();
            sumsSquareTypeRoom(room);
        }
        return "Общая площадь здания составляет " + (squareFirstLevel + squareSecondLevel + squareThirdLevel) +
                " м^2\nПлощадь первого этажа составляет " + squareFirstLevel + " м^2\nПлощадь второго этажа составляет " +
                squareSecondLevel + " м^2\nПлощадь третьего этажа составляет " + squareThirdLevel + " м^2\nПлощадь кухонь составляет " +
                squareKitchens + " м^2\nПлощадь залов составляет " + squareHalls + " м^2\nПлощадь спален составляет " +
                squareBedrooms + " м^2";
    }

    public static void sumsSquareTypeRoom(Room room) {
        switch (room.getType()) {
            case "Kitchens" -> squareKitchens += room.getSquare();
            case "Halls" -> squareHalls += room.getSquare();
            case "Bedrooms" -> squareBedrooms += room.getSquare();
        }
    }

    public static String getRandomTypeRoom() {
        ArrayList<String> listTypeRoom = new ArrayList<>();
        listTypeRoom.add("Kitchens");
        listTypeRoom.add("Halls");
        listTypeRoom.add("Bedrooms");
        return listTypeRoom.get(new Random().nextInt(3));
    }

    public static int getRandomSquareRoom() {
        return new Random().nextInt(4)+12;}
}
