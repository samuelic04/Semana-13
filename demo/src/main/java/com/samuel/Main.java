package com.samuel;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Samuel", "Camacho", 21, "samuel.ic@usal.es");
        Gson gson = new Gson();

        String json = gson.toJson(p);
        System.out.println(json);
    }
}