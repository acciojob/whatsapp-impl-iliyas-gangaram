package com.driver;

public class User {
    private String name;
    private String mobile;
    User(String name,String mobile) throws Exception {
        WhatsappRepository r = new WhatsappRepository();
        if (!r.getusermobile(mobile).equals(mobile))
        {throw new Exception("user already exists");}
        else{
        this.name=name;
        this.mobile=mobile;
    r.setusermobile(mobile);}}
    public String get(String name)
    {return this.mobile;}
}
