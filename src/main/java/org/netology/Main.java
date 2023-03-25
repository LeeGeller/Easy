package org.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
        post.name = "Иван";
        post.passport = 1234_567890;
        post.patronymic = "Иванов";
        post.phone = "+7_999_999_999";
        post.surname = "Иванов";
        post.subscription = true;

    }
}