import java.util.HashMap;
import java.util.Map;

public class FlyWeight {
    public static void main(String[] args) {

        Mycelium mycelium = new Mycelium();
        System.out.println(mycelium.getMushroom(MushroomType.Honey,1,1).toDetailString());
        System.out.println(mycelium.getMushroom(MushroomType.Honey,2,2).toDetailString());
        System.out.println(mycelium.getMushroom(MushroomType.PennyBun,3,3).toDetailString());
        System.out.println(mycelium.getMushroom(MushroomType.PennyBun,4,4).toDetailString());
    }
}

enum MushroomType {PennyBun, Russula, Chanterella, Honey};

class Mushroom {
    private MushroomType type;
    private int x;
    private int y;

    public Mushroom(MushroomType type) {
        this.type = type;
    }

    public MushroomType getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toDetailString() {
        return this + " " + this.type.toString() + " " + x + " " + y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Mycelium {
    private Map<MushroomType, Mushroom> mushrooms = new HashMap<>();

    public Mushroom getMushroom(MushroomType type, int x, int y) {

        Mushroom mushroom = mushrooms.get(type);
        if (mushroom == null) {
            mushroom = new Mushroom(type);
            mushrooms.put(type, mushroom);
        }
        mushroom.setPosition(x, y);
        return mushroom;
    }
}