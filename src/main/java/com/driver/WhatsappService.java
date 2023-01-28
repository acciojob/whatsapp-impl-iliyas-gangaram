package com.driver;

import java.util.Date;
import java.util.List;

public class WhatsappService {
    public static String createUser(String name,String mobile) throws Exception {
        User u=new User("abc","123");
        return name;
    }




    public int sendMessage(Message message, User sender, Group group) {
return 1;    }

    public int createMessage(String content) {
        return 1;
    }

    public String changeAdmin(User approver, User user, Group group) {
    return "";}

    public int removeUser(User user) {
WhatsappRepository remuser=new WhatsappRepository();
    remuser.rem(user);
    return 1;
    }

    public String findMessage(Date start, Date end, int k) {
    return "";
    }
    public Group createGroup(List<User> users) {
Group g=new Group(users);
return g;
    }

}