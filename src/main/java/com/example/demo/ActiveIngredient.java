package com.example.demo.;

public class ActiveIngredients{
    private Long id;
    private String name;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

     public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public ActiveIngredients(String name){
        this.name=name;
    }

    public  ActiveIngredients(){

    }

}