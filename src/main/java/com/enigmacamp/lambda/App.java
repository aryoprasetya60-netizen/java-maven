package com.enigmacamp.lambda;

public class App {
    static void main(String[] args) {

        //anonymous class
        Greeting greeting = new Greeting() {
            @Override
            public void say(String name) {
                System.out.println("Hello "+name);
            }
        };

        //lambda
        Greeting greeting1 = (String name) -> System.out.printf("Selamat pagi %s\n", name);
        greeting1.say("Aryo");

        //built in functional interface
        //1. runnable
        //2. supplier
        //3. predicate
        // all
        Runnable run = () -> System.out.println("berhasil berjalan");
        run.run();
    }
}
