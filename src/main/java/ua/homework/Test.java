package ua.homework;

import com.google.gson.Gson;

public class Test {
    public static void main(String[] args) {
        User user = new User("Andrii", "Nezhynskyi");
        Gson gson = new Gson();
        String json = gson.toJson(user);

        System.out.println(json);
    }
}
