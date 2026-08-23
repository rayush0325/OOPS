class Employee extends User{
    String department;

    public Employee(int id, String name, int salary, String department){
        super(id, name, salary);
        this.department = department;
    }

    public Employee(int id, String name){
        this(id, name, 0, "unknown");
    }

    public Employee(){
        //call this contuctor after removing no arg constructor of user
        this.department = "unknown";
    }

    public void displayInfo(){
        System.out.printf("\n id = %d, name = %s, salary = %d, department = %s\n", id, name, salary, department);
    }
}