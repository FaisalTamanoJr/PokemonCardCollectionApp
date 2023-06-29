package PokemonCard;

abstract class Pokemon {
    private String name;
    private float weight;
    private float height;
    private float  attack;
    private float defense;
    private float stamina;
    private String[] type;

    public abstract void setType(String type);

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public float getWeight(){
        return weight;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public float getHeight(){
        return height;
    }

    public void setHeight(float height){
        this.height = height;
    }

    public float getAttack(){
        return attack;
    }

    public void setAttack(float attack){
        this.attack = attack;
    }

    public float getDefense(){
        return defense;
    }

    public void setDefense(float defense){
        this.defense = defense;
    }

    public float getStamina(){
        return stamina;
    }

    public void setStamina(float stamina){
        this.stamina = stamina;
    }

    public String[] getType(){
        return type;
    }
}