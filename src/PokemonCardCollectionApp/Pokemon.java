package PokemonCardCollectionApp;

abstract class Pokemon {
    private String name;
    private String weight;
    private String height;
    private String  attack;
    private String defense;
    private String stamina;
    private String[] type;

    public abstract boolean isMultiType();

    public abstract void setType(String type);

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getWeight(){
        return weight;
    }

    public void setWeight(String weight){
        this.weight = weight;
    }

    public String getHeight(){
        return height;
    }

    public void setHeight(String height){
        this.height = height;
    }

    public String getAttack(){
        return attack;
    }

    public void setAttack(String attack){
        this.attack = attack;
    }

    public String getDefense(){
        return defense;
    }

    public void setDefense(String defense){
        this.defense = defense;
    }

    public String getStamina(){
        return stamina;
    }

    public void setStamina(String stamina){
        this.stamina = stamina;
    }

    public String[] getType(){
        return type;
    }
}