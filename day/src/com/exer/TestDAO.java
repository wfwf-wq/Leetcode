package com.exer;

import java.util.HashMap;
import java.util.List;

public class TestDAO {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<User>();
        dao.map = new HashMap<String, User>();
        dao.save("1001",new User(1,32,"aa"));
        dao.save("1002",new User(2,34,"bb"));
        dao.save("1003",new User(3,36,"cc"));
        User u = dao.get("1002");
        System.out.println(u);
        dao.update("1002",new User(4,45,"dd"));
        dao.delete("1003");
        List<User> list = dao.list();
        System.out.println(list);

    }
}
