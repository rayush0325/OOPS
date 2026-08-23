abstract class Shape{
    String name;
    String color;

    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void display(){
        System.out.printf("\n name = %s, color = %s\n", name, color);
    }
    public abstract void perimeter();

}