package com.company;

public class Fruites {
    private int number;
    private String names;
    private String cons;
    private String pros;
    private double weight;
    private String color;
    public void setcolor(String color)
    {
        String validcolor = color.toLowerCase();
        if(validcolor.equals("red"))
        this.color= color;
        else
            this.color="Unknown";
    }
    public String getgenre()
    {
        return this.color;
    }

}
