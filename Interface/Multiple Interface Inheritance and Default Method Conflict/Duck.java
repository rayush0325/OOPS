class Duck implements Flyable, Swimmable{
    @Override
    public void move(){
        System.out.printf("\nDuck can fly and swim\n");
        Flyable.super.move();
//        Swimmable.super.move();
//
    }
    //default modifier not allowed in implementing class for overriden default methods
    //access modifier of overriden method must be wider in implementing classes
    //Interface name is required  to call parent interface method
}