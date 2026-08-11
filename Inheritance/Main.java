class Main{
    public static void main(String[] args) {
//        Triangle triangle = new Triangle(2);
//        System.out.printf("\nsides = %d, sideLength = %d\n", triangle.sides, triangle.sideLength);//parent class varaibles available in child class
//        System.out.printf("\nname = %s\n", triangle.getName());//parent class method available in child class
//        System.out.printf("perimeter  = %d", triangle.calPerimeter());

//        Vehicle vehicle = new Vehicle("Hero", 50);
//        vehicle.displayInfo();

        Car car = new Car("Mahindra", 80, 4);
        car.displayInfo();
    }
}