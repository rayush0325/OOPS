class Triangle extends Shape{
    private int height, base;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea(){
        return 0.5*height*base;
    }
}