import java.util.*;
class GameCharacter{
    private String characterName;
    private int health;
    private Map<String, Ability> abiltyMap;

    public GameCharacter(String characterName, int health) {
        this.health = health;
        this.characterName = characterName;
        this.abiltyMap = new HashMap<>();
    }

    public void addAbility(Ability ability){
        abiltyMap.put(ability.getName(), ability);
        System.out.printf("\n%s ability added\n", ability.getName());
    }

    public void activateAbility(String abilityName){
        if(!abiltyMap.containsKey(abilityName)){
            System.out.printf("\n%s don't have %s ability \n",characterName, abilityName);
        }
        else{
            System.out.printf("\n%s ability activated\n", abilityName);
            System.out.printf("\n%s ",characterName);
            abiltyMap.get(abilityName).activate();
            System.out.println();

        }
    }
    public void removeAbility(String abilityName){

        abiltyMap.remove(abilityName);
        System.out.printf("\n%s ability got removed\n",abilityName);
    }
}