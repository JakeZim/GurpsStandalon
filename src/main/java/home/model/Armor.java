package home.model;

import java.util.Arrays;
import java.util.List;

public class Armor extends Item
{
    int    resistance;
    String location;
    int    dodgePenalty;

    Armor(String name, String details, double copperCost, double weight, int quantity, String notes, int resistance,
            String location, int dodgePenalty)
    {
        super(name, details, copperCost, weight, quantity, notes);
    }

    public int getResistance()
    {
        return resistance;
    }

    public void setResistance(int resistance)
    {
        this.resistance = resistance;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public int getDodgePenalty()
    {
        return dodgePenalty;
    }

    public void setDodgePenalty(int dodgePenalty)
    {
        this.dodgePenalty = dodgePenalty;
    }

    public enum Location
    {
        HEAD(1),
        CHEST(1),
        ARM(2),
        ARMS(1, ARM),
        HAND(2),
        HANDS(1, HAND),
        LEG(2),
        LEGS(1, LEG),
        FOOT(1),
        FEET(2, FOOT),
        ALL(1, HEAD, CHEST, ARMS, LEGS),
        NECK(1),
        FINGER(10),
        FACE(1);

        private final int            totalAllowed;
        private final List<Location> includedAreas;

        Location(int totalAllowed, Location... includedAreas)
        {
            this.totalAllowed = totalAllowed;
            this.includedAreas = Arrays.asList(includedAreas);
        }

        public int getTotalAllowed()
        {
            return totalAllowed;
        }

        public List<Location> getIncludedAreas()
        {
            return includedAreas;
        }
    }

}
