package PokemonCard;

class PokemonDual extends Pokemon{
    private String[] type;

    public String[] getType(){
        return type;
    }
    public void setType(String type){
        this.type = type.split("/");
    }

}
