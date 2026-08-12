abstract class Appliance{
    abstract void turnOn();//abstract methods cannot have a body

    void plugIn(){
        System.out.println("Plugged into socket.");
    }
}