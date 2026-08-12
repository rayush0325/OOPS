public class Main{
    public static void main(String[] args) {
        Manager manager = new Manager(
                "Alok",
                25,
                101,
                5
        );

        System.out.printf("\nname = %s, age = %d, employee_id = %d, team size = %d\n",
                manager.name,
                manager.age,
                manager.employee_id,
                manager.teamSize
                );
    }
}