package home.model;

public class Item
{
    private String name;
    private String details;
    private double copperCost;
    private double weight;
    private int    quantity;
    private String notes;

    Item(String name, String details, double copperCost, double weight, int quantity, String notes)
    {
        this.name = name;
        this.details = details;
        this.copperCost = copperCost;
        this.weight = weight;
        this.quantity = quantity;
        this.notes = notes;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDetails()
    {
        return details;
    }

    public void setDetails(String details)
    {
        this.details = details;
    }

    public double getCopperCost()
    {
        return copperCost;
    }

    public void setCopperCost(double copperCost)
    {
        this.copperCost = copperCost;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public String getNotes()
    {
        return notes;
    }

    public void setNotes(String notes)
    {
        this.notes = notes;
    }
}
