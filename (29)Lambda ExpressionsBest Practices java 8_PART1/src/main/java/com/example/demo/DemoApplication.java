package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.Function;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

//        Foo foo =s -> s+" from Lambda";
//        UseFoo useFoo = new UseFoo();
//        String result = useFoo.add("John", foo);

        Function<String, String> function=s->s+ " from Lambda";
        UseFoo useFoo = new UseFoo();
        String result = useFoo.add("John", function);
        System.out.println(result);

    }
}
