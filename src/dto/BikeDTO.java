package dto;

public class BikeDTO {
    public String name;
    public double cost;

    public BikeDTO(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "{BikeDTO : " +
                "name='" + name + '\'' +
                ", cost=" + cost+"}\n";
    }
}
