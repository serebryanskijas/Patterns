public class PoundOfButter {
    public static void main(String[] args) {
        Producer baker = new Baker();
        Product bread = baker.make(1.0);
        Producer farmer = new Farmer();
        Product butter = farmer.make(bread.getWeight());
        Producer judge = new Judge();
        Product decision = judge.make(0);
        System.out.println("A farmer sold butter to a baker");
        System.out.format("The weight of the butter is %.2f pounds \n", butter.getWeight());
        System.out.println("The baker took the farmer to court");
        System.out.println("The farmer put the bread on the scale and weight the bread");
        System.out.format("The weight of the bread is also %.2f pounds \n", bread.getWeight());
        System.out.println(((Decision)decision).getDecision());
    }

}

interface Product {


    public double getWeight();

    public void setWeight(double weight);
}

class Bread implements Product {
    private double weight;

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

}

class Butter implements Product {
    private double weight;

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

}

class Decision implements Product {


    private String decision = "Don’t try to cheat others.";

    public String getDecision() {
        return decision;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public void setWeight(double weight) {

    }

}

interface Producer {
    public Product make(double weight);

}

class Farmer implements Producer {

    @Override
    public Product make(double weight) {
        Product butter = new Butter();
        butter.setWeight(weight);
        return butter;
    }
}

class Baker implements Producer {

    @Override
    public Product make(double weight) {
        Product bread = new Bread();
        bread.setWeight((Math.random() * 0.1 + 0.9) * weight);
        return bread;
    }
}

class Judge implements Producer {

    @Override
    public Product make(double weight) {
        Product decision = new Decision();
        return decision;
    }
}