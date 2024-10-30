package study.oop.api;

import com.google.gson.Gson;

public class GsonFromAPI {
    public static void main(String[] args) {
        Gson gson = new Gson();

        String json = "{\"name\":\"Harry\", \"age\":20}";

        Person person = gson.fromJson(json, Person.class);

        System.out.println(person.toString());
    }

}
