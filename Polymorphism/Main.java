class Main{
    public static void main(String[] args) {
        Shape shape = null;
        shape = new Shape();
        System.out.printf("\nmy name is %s\n",shape.myName());
        shape = new Triangle();
        System.out.printf("\nmy name is %s\n",shape.myName());
        shape = new Square();
        System.out.printf("\nmy name is %s\n",shape.myName());
        shape = new Circle();
        System.out.printf("\nmy name is %s\n",shape.myName());//no impl provided by circle hence parent class(Shape) method will run

        //same source code is being supported by different objects -> shape.myName()
    }
}