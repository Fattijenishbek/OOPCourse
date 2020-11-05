package boxes;

public class Thing {
    private String name;
    private double weight;

    public Thing(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        if(weight>=0.0){
            this.weight = weight;
        }
        else {
            throw new IllegalArgumentException("Weight cannot be negative.");
        }

    }
    public boolean equals(Thing thing) {
        return (this == thing);
    }
}