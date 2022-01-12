public class Prototype {
}

class SillyLittleMariam {
    public static void main(String[] args) {
        Girl mariam = new Girl("Mariam", true, true, true);
        System.out.println(mariam.toString());
        Girl shadow = mariam.clone();
        shadow.setName("Shadow");
        shadow.setLazy(false);
        shadow.setLittle(false);
        shadow.setSilly(false);
        System.out.println(shadow);
    }

}

class Girl implements Cloneable {


    private String name;
    private boolean silly;
    private boolean little;
    private boolean lazy;

    @Override
    public Girl clone() {
        try {
            Girl clone = (Girl) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String toString() {
        String silliness = isSilly() ? "silly" : "smart";
        String laziness = isLazy() ? "lazy" : "active";
        String growth = isLittle() ? "little" : "big";
        return (getName() + ": " + silliness + ", " + laziness + ", " + growth);
    }

    public Girl(String name, boolean silly, boolean little, boolean lazy) {
        this.name = name;
        this.silly = silly;
        this.little = little;
        this.lazy = lazy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSilly() {
        return silly;
    }

    public void setSilly(boolean silly) {
        this.silly = silly;
    }

    public boolean isLittle() {
        return little;
    }

    public void setLittle(boolean little) {
        this.little = little;
    }

    public boolean isLazy() {
        return lazy;
    }

    public void setLazy(boolean lazy) {
        this.lazy = lazy;
    }


}