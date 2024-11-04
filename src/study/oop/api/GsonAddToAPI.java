package study.oop.api;

import com.google.gson.Gson;

public class GsonAddToAPI {
    public static void main(String[] args) {
        Address address = new Address("서울", "대한민국");
        Person person = new Person("고양이", 20, address);

        Gson gson = new Gson();
        String json = gson.toJson(person);

        System.out.println(json);
    }
}
