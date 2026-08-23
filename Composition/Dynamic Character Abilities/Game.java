public class Game{
    public static void main(String[] args) {
        GameCharacter shaktiman = new GameCharacter("shaktiman", 100);
        Ability invisible = new Invisible();
        Ability fly = new Fly();
        shaktiman.activateAbility(fly.getName());
        shaktiman.addAbility(new Fly());
        shaktiman.activateAbility(fly.getName());
        shaktiman.activateAbility(invisible.getName());
        shaktiman.addAbility(invisible);
        shaktiman.activateAbility(invisible.getName());
        shaktiman.removeAbility(fly.getName());
        shaktiman.activateAbility(fly.getName());

        GameCharacter thor = new GameCharacter("thor", 100);
        thor.activateAbility(fly.getName());
        thor.addAbility(new Fly());
        thor.activateAbility(fly.getName());

    }
}