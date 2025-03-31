package hw_1;

public class Car {
    private int id;
    private String producer;
    private String model;
    private int year;
    private String color;
    private double engineSize;
    private int horsepower;
    private boolean isElectric;

    public Car() {}

    public Car(int id, String producer, String model, int year, String color, double engineSize, int horsepower, boolean isElectric) {
        this.id = id;
        this.producer = producer;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineSize = engineSize;
        this.horsepower = horsepower;
        this.isElectric = isElectric;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", engineSize=" + engineSize +
                ", horsepower=" + horsepower +
                ", isElectric=" + isElectric +
                '}';
    }
}
