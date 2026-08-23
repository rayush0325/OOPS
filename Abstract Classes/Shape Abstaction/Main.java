public class Main{
    public static void main(String[] args) {
       showDetails(new Rectangle(4,5,"green"));
       showDetails(new Circle(7,"green"));

    }
    public static void showDetails(Shape shape){
        shape.display();
        shape.perimeter();
    }
}