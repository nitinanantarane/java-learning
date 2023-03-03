package com.workshop.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ConstructorMethodRef {

    public static void main(String[] args) {
        Supplier<List<String>> supplier = ArrayList::new;
        System.out.println(supplier.get());

        Supplier<User> userSupplier = () -> new User("Hello");
        System.out.println(userSupplier.get());
    }
}

class User {
    String name;
    User(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            '}';
    }
}