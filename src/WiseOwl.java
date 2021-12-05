public class WiseOwl {
    public static void main(String[] args) {
        Singleton wiseOwl = Singleton.getInstance();
        System.out.println(wiseOwl);
        Singleton wiseOwl2 = Singleton.getInstance();
        System.out.println(wiseOwl2);
    }
}

class Singleton {
    private static final Singleton instance = new Singleton();
    private int wisdom = 0;

    private Singleton() {
        System.out.println("There was an old owl that lived in an oak");
    }

    public void incWisdom() {
        wisdom++;
    }

    public int getWisdom() {
        return wisdom;
    }

    public static Singleton getInstance() {
        return instance;
    }
}
