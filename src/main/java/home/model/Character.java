package home.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Character
{
    private String            name;
    private int               points;

    // Stats
    private int               str;
    private int               dmg;
    private int               hp;
    private int               currentHP;
    private int               dx;
    private int               iq;
    private int               will;
    private int               per;
    private int               ht;
    private int               fp;
    private int               currentFP;
    private int               ppe;
    private int               currentPPE;
    private double            spd;
    private int               move;

    // Bio Details
    private int               sizeMod;
    private String            wealth;
    private List<String>      languages;
    private String            biography;

    private String            notebook;

    private List<Item>        inventory;
    private final List<Skill> skills;
    private List<Attack>      attacks;
    private List<Armor>       armors;

    public Character()
    {
        languages = new ArrayList<String>(2);
        inventory = new ArrayList<Item>(10);
        skills = Arrays.asList(Skill.values());
        attacks = new ArrayList<Attack>(2);
        armors = new ArrayList<Armor>(1);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPoints()
    {
        return points;
    }

    public void setPoints(int points)
    {
        this.points = points;
    }

    public int getStr()
    {
        return str;
    }

    public void setStr(int str)
    {
        this.str = str;
    }

    public int getDmg()
    {
        return dmg;
    }

    public void setDmg(int dmg)
    {
        this.dmg = dmg;
    }

    public int getHp()
    {
        return hp;
    }

    public void setHp(int hp)
    {
        this.hp = hp;
    }

    public int getCurrentHP()
    {
        return currentHP;
    }

    public void setCurrentHP(int currentHP)
    {
        this.currentHP = currentHP;
    }

    public int getDx()
    {
        return dx;
    }

    public void setDx(int dx)
    {
        this.dx = dx;
    }

    public int getIq()
    {
        return iq;
    }

    public void setIq(int iq)
    {
        this.iq = iq;
    }

    public int getWill()
    {
        return will;
    }

    public void setWill(int will)
    {
        this.will = will;
    }

    public int getPer()
    {
        return per;
    }

    public void setPer(int per)
    {
        this.per = per;
    }

    public int getHt()
    {
        return ht;
    }

    public void setHt(int ht)
    {
        this.ht = ht;
    }

    public int getFp()
    {
        return fp;
    }

    public void setFp(int fp)
    {
        this.fp = fp;
    }

    public int getCurrentFP()
    {
        return currentFP;
    }

    public void setCurrentFP(int currentFP)
    {
        this.currentFP = currentFP;
    }

    public int getPpe()
    {
        return ppe;
    }

    public void setPpe(int ppe)
    {
        this.ppe = ppe;
    }

    public int getCurrentPPE()
    {
        return currentPPE;
    }

    public void setCurrentPPE(int currentPPE)
    {
        this.currentPPE = currentPPE;
    }

    public double getSpd()
    {
        return spd;
    }

    public void setSpd(double spd)
    {
        this.spd = spd;
    }

    public int getMove()
    {
        return move;
    }

    public void setMove(int move)
    {
        this.move = move;
    }

    public int getSizeMod()
    {
        return sizeMod;
    }

    public void setSizeMod(int sizeMod)
    {
        this.sizeMod = sizeMod;
    }

    public String getWealth()
    {
        return wealth;
    }

    public void setWealth(String wealth)
    {
        this.wealth = wealth;
    }

    public List<String> getLanguages()
    {
        return languages;
    }

    public void setLanguages(List<String> languages)
    {
        this.languages = languages;
    }

    public void addLanguage(String language)
    {
        languages.add(language);
    }

    public String getBiography()
    {
        return biography;
    }

    public void setBiography(String biography)
    {
        this.biography = biography;
    }

    public String getNotebook()
    {
        return notebook;
    }

    public void setNotebook(String notebook)
    {
        this.notebook = notebook;
    }

    public List<Item> getInventory()
    {
        return inventory;
    }

    public void setInventory(List<Item> inventory)
    {
        this.inventory = inventory;
    }

    public void addItemToInventory(Item item)
    {
        this.inventory.add(item);
    }

    public List<Skill> getSkills()
    {
        return skills;
    }

    public List<Attack> getAttacks()
    {
        return attacks;
    }

    public void setAttacks(List<Attack> attacks)
    {
        this.attacks = attacks;
    }

    public void addAttack(Attack attack)
    {
        this.attacks.add(attack);
    }

    public List<Armor> getArmors()
    {
        return armors;
    }

    public void setArmors(List<Armor> armors)
    {
        this.armors = armors;
    }

    public void addArmor(Armor armor)
    {
        this.armors.add(armor);
    }
}
