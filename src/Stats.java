/**
 * Created by taavev01 on 24/07/2017.
 */
public class Stats {
    private int strength;
    private int intelligence;
    private int dexterity;
    private int vitality;
    private int exp;
    private int level;
    private int health;

    Stats(){
        strength = 1;
        intelligence = 1;
        dexterity = 1;
        vitality = 1;
        exp = 0;
        level = 0;
        health = 100;
    }

    public void setStrength(int newStrength){
        this.strength = newStrength;
    }

    public void setIntelligence(int newIntelligence){
        this.intelligence = newIntelligence;
    }

    public void setDexterity(int newDex){
        this.dexterity = newDex;
    }

    public void setVitality(int newVit){
        this.vitality = newVit;
    }

    public void setExp(int newExp){
        this.exp = newExp;
    }

    public void setLevel(int newLevel){
        this.level = newLevel;
    }

    public void setHealth(int newHealth){
        this.health = newHealth;
    }

    public int getStrength(){
        return this.strength;
    }

    public int getIntelligence(){
        return this.intelligence;
    }

    public int getDexterity(){
        return this.dexterity;
    }

    public int getVitality(){
        return this.vitality;
    }

    public int getExp(){
        return this.exp;
    }

    public int getLevel(){
        return this.level;
    }

    public int getHealth(){
        return this.health;
    }
}
