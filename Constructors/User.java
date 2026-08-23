class User{
    int id;
    String name;
    int salary;

    public User(){ //No arg constructor
        this(-1, "unknown", 0); //constructor chaining
    }
    public User(int id, String name){
        this(id, name, 0);
    }
    public User(int id, String name , int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public User(User user){
        this.id = user.id;
        this.name = user.name;
        this.salary = user.salary;
    }

    public void displayInfo(){
        System.out.printf("\n id = %d, name = %s, salary = %d\n", id, name, salary);
    }



}