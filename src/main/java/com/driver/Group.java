package com.driver;
import java.util.*;
public class Group {
    private String name;
    private int numberOfParticipants;

    public Group(List<User> members)
    {members=new ArrayList<>();
        this.numberOfParticipants= members.size();
        User m=members.get(1);
        this.name=m.get(name);
    }

}
