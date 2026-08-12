class Manager extends Employee{
    int teamSize;
    public Manager(String name, int age, int employee_id, int teamSize){
        super(name, age, employee_id);
        this.teamSize = teamSize;
    }
    public void printDetails(){
        System.out.println();
    }
}