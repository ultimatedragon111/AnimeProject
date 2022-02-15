package com.example.animeproject;

public class Anime {

    String id;
    String name;
    String desc;
    Type type;
    String year;
    String image;

    Anime(String id,String name,String desc,Type type,String year,String image){
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.type = type;
        this.year = year;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
