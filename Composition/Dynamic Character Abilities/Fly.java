class Fly implements Ability{
    private String name = "Fly";

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void activate(){
        System.out.printf("starts flying");
    }
}