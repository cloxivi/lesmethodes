/**
 * @author : chloelam
 * @Description : What is a class
 * @created : 2024-04-15, Monday
 **/
public class Car
{
    String make;
    String model;

    // Constructeur
    public Car(String make, String model)
    {
        this.make = make;
        this.model = model;
    }

    // Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
