package com.teackmeskils.coursework.database;

import java.util.Map;

public class UserAccountDB {

    private static UserAccountDB userAccountDB;

    private Map<String, String> userAccountMap;

    private UserAccountDB() {

    }

    public static UserAccountDB getInstance() {
        if (userAccountDB == null) {
            userAccountDB = new UserAccountDB();
        }

        return userAccountDB;
    }
}
