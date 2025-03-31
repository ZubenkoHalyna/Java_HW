package hw_1;

import java.util.ArrayList;
import java.util.List;

//Загальне: всі поля класу приватні, додати гетери сетери (не використовуючи ломбок)
//– створити клас, який би описував подібні об’єкти https://jsonplaceholder.typicode.com/posts/1
//створити 5 об’єктів класу, покласти в маисв/ліст, проітерувати та вивести в консоль
//
//– створити клас, який би описував подібні об’єкти https://jsonplaceholder.typicode.com/comments/1
//створити 5 об’єктів класу, покласти в маисв/ліст, проітерувати та вивести в консоль
//
//– створити клас, який би описував Книгу
//– створити клас, який би описував Собаку
//– створити клас, який би описував Автомобіль

public class Main {
    public static void main(String[] args) {
        Post[] posts = new Post[5];
        posts[0] = new Post(1, 1, "title 1", "body 1");
        posts[1] = new Post(2, 1, "title 2", "body 2");
        posts[2] = new Post(3, 1, "title 3", "body 3");
        posts[3] = new Post(4, 1, "title 4", "body 4");
        posts[4] = new Post(5, 1, "title 5", "body 5");

        System.out.println("Posts:");
        for (Post post : posts) {
            System.out.println(post);
        }

        List<Comment> comments = new ArrayList<>();
        comments.add(new Comment(1, 1, "name 1", "ex1@gmail.com", "body 1"));
        comments.add(new Comment(2, 1, "name 2", "ex2@gmail.com", "body 2"));
        comments.add(new Comment(3, 1, "name 3", "ex3@gmail.com", "body 3"));
        comments.add(new Comment(4, 1, "name 4", "ex4@gmail.com", "body 4"));
        comments.add(new Comment(5, 1, "name 5", "ex5@gmail.com", "body 5"));

        System.out.println("Comments:");
        comments.forEach(System.out::println);
    }
}
