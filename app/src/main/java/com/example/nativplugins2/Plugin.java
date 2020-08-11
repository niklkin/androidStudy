package com.example.nativplugins2;

public class Plugin {
    private String name;
    private String description;
    //private int imageResourceId;

    public static final Plugin[] plugins = {
            new Plugin("Fab-Filter Pro", "Pro Q-3, Saturn, MB, Limiter-2"),
            new Plugin("Waves", "R-bass"),
            new Plugin("Izotope Ozone", "Imager")
    };

    private Plugin(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public  String toString(){
        return this.name;
    }
}