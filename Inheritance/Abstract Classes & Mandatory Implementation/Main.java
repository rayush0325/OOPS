public class Main{
    public static void main(String[] args) {
        //Appliance appliance = new Appliance();
        //Appliance is abstract; cannot be instantiated

        Fan fan = new Fan();
        fan.plugIn();
        fan.turnOn();

        Refrigerator refrigerator = new Refrigerator();
        refrigerator.plugIn();
        refrigerator.turnOn();

    }
}