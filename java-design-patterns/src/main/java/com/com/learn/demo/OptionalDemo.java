package com.com.learn.demo;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        System.out.println(getAdminName(1));
        System.out.println(String.valueOf(Optional.empty()));

        if (Optional.empty().isPresent()){

        }
    }

    public static Optional<String> getAdminName(Integer uid) {
        return Optional.empty();
    }
}
