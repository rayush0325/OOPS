class Main{
    public static void main(String[] args) {

//        Car car = new Car("Mahindra", 80, 4);
//        car.displayInfo();

        Shape shape = new Shape();
        System.out.println(shape.calculateArea());

        Shape shape1 = new Rectangle(7,7);
        Shape shape2 = new Triangle(7,7);
        Shape shape3 = new Circle(7);

        System.out.printf("\n%f, %f, %f\n",
                shape1.calculateArea(),
                shape2.calculateArea(),
                shape3.calculateArea()
                );
    }
}