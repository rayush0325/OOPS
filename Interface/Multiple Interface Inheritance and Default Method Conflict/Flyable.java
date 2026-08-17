interface Flyable{
    default void move(){
        System.out.printf("\nFlying\n");
    }
}