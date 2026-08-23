class FileHandler implements ReadWrite{
    @Override
    public void read(){
        System.out.printf("\nread file\n");
    }
    @Override
    public void write(){
        System.out.printf("\nwrite file\n");
    }
    @Override
    public void display(){
        System.out.printf("\ndisplay file\n");
    }
}