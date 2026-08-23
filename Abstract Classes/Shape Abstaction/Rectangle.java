class Rectangle extends Shape{
    int height;
    int width;

    public Rectangle(int height, int width, String color){
        super("rectangle", color);
        this.height = height;
        this.width = width;
    }

    @Override
    public void perimeter(){
        System.out.printf("\nperimeter = %d\n", 2*(height+width));
    }
}