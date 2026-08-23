public class Main{
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User(1, "ayush", 5000);
        User user3 = new User(2, "devansh");

        User copyUser2 = new User(user2);
        System.out.printf("\ncopyUser2 and user2 are equal : %b\n", copyUser2 == user2);
        copyUser2.displayInfo();


        user1.displayInfo();
        user2.displayInfo();
        user3.displayInfo();

        Employee employee = new Employee(3, "yash", 6000, "IT");
        employee.displayInfo();
        Employee employee1 = new Employee(3, "rahul");
        employee1.displayInfo();
        Employee employee2 = new Employee();
        employee2.displayInfo();
    }
}