class Circle extends Shape{
    int radius;


    public Circle(int radius, String color){
        super("circle", color);
        this.radius = radius;

    }

    @Override
    public void perimeter(){
        System.out.printf("\nperimeter = %d\n", (44*(radius)/7));
    }
}