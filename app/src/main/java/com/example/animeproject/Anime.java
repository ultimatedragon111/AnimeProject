package com.example.animeproject;

public class Anime {

    String id;
    String name;
    String desc;
    String type;
    int year;
    String image;
    String favorite;

    Anime(String id,String name,String desc,String type,int year,String image,String favorite){
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.type = type;
        this.year = year;
        this.image = image;
        this.favorite = favorite;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
