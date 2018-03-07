package home.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Character {
    private StringProperty  name;
    private IntegerProperty points;

    private IntegerProperty str;
    private IntegerProperty dmg;
    private IntegerProperty hp;

    private IntegerProperty dx;

    private IntegerProperty iq;
    private IntegerProperty will;
    private IntegerProperty per;

    private IntegerProperty ht;
    private IntegerProperty fp;

    private IntegerProperty ppe;

    private DoubleProperty  spd;
    private IntegerProperty move;

    //Bio Stats
    private IntegerProperty sizeMod;
    private StringProperty  wealth;
    private StringProperty  lang1;
    private StringProperty  lang2;
    private StringProperty  lang3;
    private StringProperty  lang4;
    private StringProperty  biography;

    private StringProperty  notebook;

    public Character()
    {

    }
}
