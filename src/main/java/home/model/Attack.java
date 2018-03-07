package home.model;

public class Attack extends Item
{
    String baseDmg;
    String range;

    Attack(String name, String details, double copperCost, double weight, int quantity, String notes, String baseDmg,
            String range)
    {
        super(name, details, copperCost, weight, quantity, notes);
        this.baseDmg = baseDmg;
        this.range = range;
    }

    public String getBaseDmg()
    {
        return baseDmg;
    }

    public void setBaseDmg(String dmg)
    {
        this.baseDmg = dmg;
    }

    public String getRange()
    {
        return range;
    }

    public void setRange(String range)
    {
        this.range = range;
    }
}
