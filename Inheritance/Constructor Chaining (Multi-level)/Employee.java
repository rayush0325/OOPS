class Employee extends Person{
    int employee_id;

    public Employee(String name, int age, int employee_id){
        super(name, age);
        this.employee_id = employee_id;//
    }
}