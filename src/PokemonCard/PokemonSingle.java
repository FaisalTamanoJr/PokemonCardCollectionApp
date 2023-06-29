package PokemonCard;

class PokemonSingle extends Pokemon{
    private String[] type = new String[1];

    public String[] getType(){
        return type;
    }
    public void setType(String type){
        this.type[0] = type;
    }

}
