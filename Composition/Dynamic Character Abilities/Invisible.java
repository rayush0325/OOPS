class Invisible implements Ability{
    @Override
    public String getName(){
        return "invisible";
    }

    @Override
    public void activate(){
        System.out.printf("become invisible");
    }
}