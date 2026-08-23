public class Main{
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();

        System.out.printf("\ntry to serialize employee\n");
        serialize(employee);
        System.out.printf("\ntry to serialize manager\n");
        serialize(manager);
    }
    public static void serialize(Object object){
        if(object instanceof  Serializable){
            System.out.printf("\nserializable\n");
        }
        else{
            System.out.printf("\nnot serializable\n");
        }
    }
}