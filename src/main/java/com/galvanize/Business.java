package com.galvanize;

import java.util.ArrayList;

public class Business implements Addressable {

    private final String name;
    private final ArrayList<Address> addresses = new ArrayList<>();

    public Business(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

}