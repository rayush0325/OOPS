class Shape{
    int sides;
    int sideLength;
    String name;


//    public String myName(){
//        return this.name;
//    }

    //changes made in code visible in child class - maintainability
    public String getName(){
         return this.name;
    }

    //newly added methodd available in child class - extensibility
    public int calPerimeter(){
        return this.sides*this.sideLength;
     }
}