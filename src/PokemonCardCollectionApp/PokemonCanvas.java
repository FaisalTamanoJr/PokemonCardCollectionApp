package PokemonCardCollectionApp;
import acm.graphics.GCanvas;
import acm.graphics.*;
import java.awt.*;
import java.util.Objects;

public class PokemonCanvas extends GCanvas {

    public void showPokemon(Pokemon pokemon) {
        if (pokemon.isMultiType()) {
            showMultiBackgroundAndSprite(pokemon);
            showMultiTypeStats(pokemon);
        } else {
            showSingleBackgroundAndSprite(pokemon);
            showOneTypeStats(pokemon);
        }
    }

    private void showOneTypeStats(Pokemon pokemon) {
        GLabel name = canvasText(pokemon.getName(), 36);
        GLabel height = canvasText("Height: "+pokemon.getHeight(), 36);
        GLabel weight = canvasText("Weight: "+pokemon.getWeight(), 36);
        GLabel type = canvasText(pokemon.getType()[0], 36);

        add(name, (getWidth() - name.getWidth()) / 2, 320);
        add(height, (getWidth() - height.getWidth()) / 2, 360);
        add(weight, (getWidth() - weight.getWidth()) / 2, 400);
        add(type, (getWidth() - type.getWidth()) / 2, 490);
        add(canvasText("ATTACK", 24), 20, 550);
        add(canvasText("DEFENSE", 24), 20, 590);
        add(canvasText("STAMINA", 24), 20, 630);

        // Empty Grey bars
        add(bar(new Color(109, 109, 109, 255), 1), 245, 537);
        add(bar(new Color(109, 109, 109, 255), 1), 245, 577);
        add(bar(new Color(109, 109, 109, 255), 1), 245, 617);

        // Green Bars
        add(bar(new Color(46, 203, 112, 255), Float.parseFloat(pokemon.getAttack())), 245, 537);
        add(bar(new Color(46, 203, 112, 255), Float.parseFloat(pokemon.getDefense())), 245, 577);
        add(bar(new Color(46, 203, 112, 255), Float.parseFloat(pokemon.getStamina())), 245, 617);
    }
    private void showSingleBackgroundAndSprite(Pokemon pokemon) {
        GRect foreground = new GRect(getWidth(), getHeight() - 254);
        GRect statsBackground = new GRect(getWidth(),getHeight() - 445);
        GRect stats = new GRect(617, 137);
        GImage background = new GImage("assets/backgrounds/" + pokemon.getType()[0] + ".jpg");
        GImage sprite = new GImage("assets/sprites/" + pokemon.getName() + ".png");

        background.setSize(getWidth(), getHeight());
        sprite.setSize(getHeight()/ 2, getHeight()/ 2);

        stats.setFilled(true);
        foreground.setFilled(true);
        statsBackground.setFilled(true);

        stats.setColor(new Color(52, 48, 43, 255));
        if (Objects.equals(pokemon.getType()[0], "Water")) {
            foreground.setColor(new Color(0,0,255,150));
            statsBackground.setColor(new Color(0,0,255,255));
        } else if (Objects.equals(pokemon.getType()[0], "Normal")) {
            foreground.setColor(new Color(150,150,150,150));
            statsBackground.setColor(new Color(150,150,150,255));
        } else if (Objects.equals(pokemon.getType()[0], "Fire")) {
            foreground.setColor(new Color(200,150,0,150));
            statsBackground.setColor(new Color(200,150,0,255));
        } else if (Objects.equals(pokemon.getType()[0], "Electric")) {
            foreground.setColor(new Color(100, 100, 255, 150));
            statsBackground.setColor(new Color(100, 100, 255, 255));
        } else if (Objects.equals(pokemon.getType()[0], "Ground")) {
            foreground.setColor(new Color(50, 30, 0, 150));
            statsBackground.setColor(new Color(50, 30, 0, 255));
        } else if (Objects.equals(pokemon.getType()[0], "Psychic")) {
            foreground.setColor(new Color(100,0,150,150));
            statsBackground.setColor(new Color(100,0,150,255));
        } else if (Objects.equals(pokemon.getType()[0], "Fighting")) {
            foreground.setColor(new Color(255,0,0,150));
            statsBackground.setColor(new Color(255,0,0,255));
        }
        add(background);
        add(sprite, (getWidth() - sprite.getWidth())/ 2, 0);
        add(foreground, 0,254);
        add(statsBackground, 0,445);
        add(stats, 8,514);
    }

    private void showMultiBackgroundAndSprite(Pokemon pokemon) {
        showSingleBackgroundAndSprite(pokemon);
        GRect type2BG = new GRect((getWidth() - 312),63);
        type2BG.setFilled(true);
        if (Objects.equals(pokemon.getType()[1], "Water")) {
            type2BG.setColor(new Color(0,0,255,255));
        } else if (Objects.equals(pokemon.getType()[1], "Normal")) {
            type2BG.setColor(new Color(150,150,150,255));
        } else if (Objects.equals(pokemon.getType()[1], "Fire")) {
            type2BG.setColor(new Color(200,150,0,255));
        } else if (Objects.equals(pokemon.getType()[1], "Electric")) {
            type2BG.setColor(new Color(100, 100, 255, 255));
        } else if (Objects.equals(pokemon.getType()[1], "Ground")) {
            type2BG.setColor(new Color(50, 30, 0, 255));
        } else if (Objects.equals(pokemon.getType()[1], "Psychic")) {
            type2BG.setColor(new Color(100,0,150,255));
        } else if (Objects.equals(pokemon.getType()[1], "Fighting")) {
            type2BG.setColor(new Color(255,0,0,255));
        }
        add(type2BG, getWidth()/2,445);
    }
    private void showMultiTypeStats(Pokemon pokemon) {
        GLabel name = canvasText(pokemon.getName(), 36);
        GLabel height = canvasText("Height: "+pokemon.getHeight(), 36);
        GLabel weight = canvasText("Weight: "+pokemon.getWeight(), 36);
        GLabel type1 = canvasText(pokemon.getType()[0], 36);
        GLabel type2 = canvasText(pokemon.getType()[1], 36);

        add(name, (getWidth() - name.getWidth()) / 2, 320);
        add(height, (getWidth() - height.getWidth()) / 2, 360);
        add(weight, (getWidth() - weight.getWidth()) / 2, 400);
        add(type1,80,490);
        add(type2,380, 490);
        add(canvasText("ATTACK", 24), 20, 550);
        add(canvasText("DEFENSE", 24), 20, 590);
        add(canvasText("STAMINA", 24), 20, 630);

        // Empty Grey bars
        add(bar(new Color(109, 109, 109, 255), 1), 245, 537);
        add(bar(new Color(109, 109, 109, 255), 1), 245, 577);
        add(bar(new Color(109, 109, 109, 255), 1), 245, 617);

        // Green Bars
        add(bar(new Color(46, 203, 112, 255), Float.parseFloat(pokemon.getAttack())), 245, 537);
        add(bar(new Color(46, 203, 112, 255), Float.parseFloat(pokemon.getDefense())), 245, 577);
        add(bar(new Color(46, 203, 112, 255), Float.parseFloat(pokemon.getStamina())), 245, 617);
    }

    private GLabel canvasText(String textInput, int size){
        GLabel tempText = new GLabel(textInput);
        tempText.setColor(Color.WHITE);
        tempText.setFont("Arial-bold-" + size);
        return tempText;
    }

    private GRect bar(Color color, float length){
        GRect tempBar = new GRect(length*362, 12);
        tempBar.setFilled(true);
        tempBar.setColor(color);
        return tempBar;
    };

    protected void clear(){
        removeAll();
    }
}