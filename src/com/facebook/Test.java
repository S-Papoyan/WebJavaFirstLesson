package com.facebook;

import com.facebook.repository.UserRepository;

public class Test {
    public static void main(String[] args) {

        UserRepository repository = new UserRepository();
        System.out.println(repository.getAll());
        System.out.println(repository.get(3));


    }
}
