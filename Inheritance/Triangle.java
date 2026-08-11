class Triangle extends Shape{
    public  Triangle(int sideLength){
        //parent class variable accessible in child class
       this.sides = 3;
       this.sideLength = sideLength;
       this.name = "triangle";
    }
}