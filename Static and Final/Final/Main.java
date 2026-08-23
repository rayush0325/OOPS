import java.util.*;
public class Main{
    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.printf("\ninstanceField1 = %s\n", demo.instanceField1);
        System.out.printf("\ninstanceField2 = %s\n", demo.instanceField2);
        System.out.printf("\ninstanceField3 = %s\n", demo.instanceField3);

        demo.instanceMethod();
        demo.instanceMethod2(20);

        final List<Integer> finalList = new ArrayList<>();
        finalList.add(10);
        finalList.add(20);

//        finalList = new ArrayList<>(); // not alllowed

        DemoChild demoChild = new DemoChild();
    }
}