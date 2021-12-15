public class ThreeLittlePigs {
    public static void main(String[] args) {
        Builder nif_nif = new NifNif();
        Builder naf_naf = new NafNaf();
        Builder nuf_nuf = new NufNuf();
        Director director= new Director();
        director.setBuilder(nif_nif);
        nif_nif.buildRoof();


    }
}

interface Builder {

    public void buildBase();

    public void buildWalls();

    public void buildRoof();
}

class NifNif implements Builder {

    @Override
    public void buildBase() {
        System.out.println("I build the soil base");
    }

    @Override
    public void buildWalls() {
        System.out.println("I build the clay walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("I build the straw roof");
    }
}

class NafNaf implements Builder {

    @Override
    public void buildBase() {
        System.out.println("I build the sand base");
    }

    @Override
    public void buildWalls() {
        System.out.println("I build the sticks walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("I build the leaves roof");
    }
}

class NufNuf implements Builder {

    @Override
    public void buildBase() {
        System.out.println("I build the concrete base");
    }

    @Override
    public void buildWalls() {
        System.out.println("I build the bricks walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("I build the tile roof");
    }
}

class Director {

    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    public void buildHouse(){
        builder.buildBase();
        builder.buildWalls();
        builder.buildRoof();
    }

    public void buildBase(){
        builder.buildBase();
    }

    public void buildWalls(){
        builder.buildWalls();
    }

    public void buildRoof(){
        builder.buildRoof();
    }
}