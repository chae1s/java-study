package study.oop.api;

import com.google.gson.Gson;

public class GsonToAPI {
    public static void main(String[] args) {
        Person person = new Person("Harry", 20);
        Gson gson = new Gson();

        String json = gson.toJson(person);

        System.out.println(json);


    }
}
