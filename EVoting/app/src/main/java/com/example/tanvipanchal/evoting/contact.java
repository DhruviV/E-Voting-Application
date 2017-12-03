package com.example.tanvipanchal.evoting;

/**
 * Created by Tanvi Panchal on 10/2/2016.
 */
public class contact {
    int id;
    String name,user,pass,enroll,email,age;
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }
    public void setName(String name){
        this.name=name;

    }
    public String getName(){
        return this.name;
    }
    public void setAge(String age){
        this.age=age;
    }
    public String getAge()
    {
        return this.age;
    }
    public void setEmail(String email){
        this.email=email;

    }
    public String getEmail(){
        return this.email;
    }
    public void setEnroll(String enroll){
        this.enroll=enroll;

    }
    public String getEnroll(){
        return this.enroll;
    }
    public void setUser(String user){
        this.user=user;

    }
    public String getUser(){
        return this.user;
    }
    public void setPass(String pass){
        this.pass=pass;

    }
    public String getPass(){
        return this.pass;
    }
}