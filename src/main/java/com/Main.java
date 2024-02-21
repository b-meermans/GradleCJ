package com;

import com.google.gson.Gson;

import java.util.*;

public class Main {

    private static List<Address> addresses;

    static {
        addresses = new ArrayList<>();
        addresses.add( new Address(18231, "com.Main St", "Springfield", State.Alabama, "14845"));
        addresses.add( new Address(232, "Church St", "Town", State.California, "32841"));
    }

    public static String getAddresses() {
        Gson gson = new Gson();
        System.out.println(gson.toJson(addresses));
        return gson.toJson(addresses);
    }

    public static void main(String[] args) {
        System.out.println(Main.getAddresses());
    }
}
