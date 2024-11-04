package study.oop.api;

import com.google.gson.Gson;

public class GsonAddFromAPI {
    public static void main(String[] args) {
        String json = "{\"name\":\"고양이\",\"age\":20,\"address\":{\"city\":\"서울\",\"country\":\"대한민국\"}}";

        Gson gson = new Gson();
        Person person = gson.fromJson(json, Person.class);

        System.out.println(person);
    }
}
