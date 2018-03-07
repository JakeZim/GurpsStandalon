package home.model;

public enum Skill
{
    ACADEMICS("IQ", "HARD"), // Philosophy, History, politics
    ACROBATICS("DX", "HARD"), // Balance, Flips, Falls
    ALCHEMY("IQ", "HARD"), // Gen Theory, Comp Identification, Magical Brewing
    ARCANA("IQ", "HARD"), // Magic Lore, Artifacts, Magical Creatures
    ATHLETICS("HT", "AVERAGE"), // Running, Swimming, Climbing
    BIOLOGY("IQ", "HARD"), // Healing, diagonistics, medicine
    BURGLARY("DX", "HARD"), // security, lockpicking, Pick Pocketing
    CARPENTRY("DX", "AVERAGE"), // Wood Construction, wood harvesting
    DECEIVING("IQ", "HARD"), // Lying, Disguise, Cheating
    ECONOMY("IQ", "HARD"), // economic lore, material identification, national motivation
    ELECTRONICS("IQ", "HARD"), // Computers, Communicators, Coding
    ENGINEERING("IQ", "HARD"), // Weapons, armor, gear, buildings
    ENTERTAINMENT("IQ", "AVERAGE"), // Gambling, Games, Night life
    ESCAPING("DX", "HARD"), // Fleeing, Tracking, Confinement
    EXOSKELETON("DX", "HARD"), // Power armor, Robots, Repairing
    LIGHT_WEAPONS("DX", "AVERAGE"), // Knives, Bows, Hand Axe, Short Sword
    MEDIUM_WEAPONS("DX", "AVERAGE"), // Long Sword, Crossbow, Spear
    HEAVY_WEAPONS("DX", "AVERAGE"), // Halberd, Great Axe, Great Sword
    INNATE_ATTACKS("DX", "AVERAGE"), // Spit, Breath, Bolt, Body Parts
    LORE("IQ", "AVERAGE"), // History, legends, story telling
    METALWORKING("DX", "AVERAGE"), // metal crafting, mining, gems
    NATURE("IQ", "AVERAGE"), // plant identification, extracting herbs, Creatures
    PERFORMANCE("IQ", "AVERAGE"), // Singing, dancing, comedy
    PERSUASION("IQ", "AVERAGE"), // Intimidation, Seduction, Insight
    PILOTING("DX", "AVERAGE"), // Hovercraft, Hovercycles, Rovers
    RELIGION("IQ", "AVERAGE"), // The gods, cults, practices
    RIDING("DX", "AVERAGE"), // piloting, taming, caravans
    SCIENCE("IQ", "HARD"), // Chemistry, Calculations, Technical mobo jumbo
    SHIELD_TRAINING("ST", "AVERAGE"), // Shields, Bucklers, Cloaks
    STEALTH("DX", "HARD"), // Sneaking, Concealment, Cyphers
    STRATEGIST("IQ", "HARD"), // Research, Stratedgy, Analysis
    URBAN("IQ", "AVERAGE"), // Streetwise, Services, Contacts
    WILDERNESS("IQ", "AVERAGE"); // Hunting, Agriculture, Navigating
    // ONE_HANDED("DX", "AVERAGE", -8), // Daggers, Swords, Rapier
    // TWO_HANDED("DX", "AVERAGE", -8), // Great Axe, Spear, Great Sword

    private String stat;
    private String difficulty;

    Skill(String stat, String difficulty)
    {
        this.stat = stat;
        this.difficulty = difficulty;
    }

    public String getStat()
    {
        return stat;
    }

    public String getDifficulty()
    {
        return difficulty;
    }

}
