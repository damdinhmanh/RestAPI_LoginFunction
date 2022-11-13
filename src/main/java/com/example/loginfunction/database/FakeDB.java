package com.example.loginfunction.database;

import com.example.loginfunction.model.User;

import java.util.ArrayList;
import java.util.List;

public class FakeDB {
    public static List<User> users = new ArrayList<User>(List.of(
            new User(1, "tuananh", "tuananh@gmail.com",
                    "tuananh@123", "Avata Tuan Anh"),
            new User(2, "vanbinh", "vanbinh@gmail.com",
                    "vanbinh@999", "Avata Binh"),
            new User(3, "thihien", "hiendang@gmail.com",
                    "hienhien@66", "Avata Hien")
    ));
}
