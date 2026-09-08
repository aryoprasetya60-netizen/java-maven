package com.enigmacamp.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class App {
    static void main(String[] args) {

        //2. anonymous class
        Greeting greeting = new Greeting() {
            @Override
            public void say(String name) {
                System.out.println("Hello "+name);
            }
        };

        //3. lambda
        Greeting greeting1 = (String name) -> System.out.printf("Selamat pagi %s\n", name);
        greeting1.say("Aryo");

        //4. built in functional interface
        //1. runnable
        //2. supplier
        //3. predicate
        // all
        Runnable run = () -> System.out.println("berhasil berjalan");
        run.run();

        //5. shorter way lambda expression
        BinaryOperator<Integer> add = Integer::sum;
        System.out.println("hasil penjumlahan dari 6 dan 7 :" + add.apply(6, 7));

        //6. convert to lambda expression
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Halo");
            }
        };

        // b
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.length() - b.length();
            }
        };

        Comparator<String> c2 = (a, b) -> a.length() - b.length();
        List<String> s = new ArrayList<>(List.of("efa", "cd", "dwas"));
        s.sort(c2.reversed());
        s.stream().forEach(System.out::println);

        // c. convert lambda expression ke method refference (kalau bisa)
        Function<String, Integer> f1 = str -> str.length();

        // d.
        Consumer<String> f2 = System.out::println;
        f2.accept("Aryo");

        // e.
        Supplier<List<String>> f3 = ArrayList::new;
        List<String> names = f3.get();
        System.out.println("Names :"+names);

        Function<Object, String> f4 = String::valueOf;
        System.out.println("Value of null : "+f4.apply(null));

        Function<String, String> f5 = String::toUpperCase;

        VolumeBola bola1 = (double l, double w, double h) -> l*w*h;
        System.out.println(bola1.volKubus(3,4,5));
        CombineString combineString1 = (String s1, String s2, String sep) -> System.out.println(s1+sep+s2);
        combineString1.combines("aryo", "prasetya","-");
        CreateEmail createEmail1 = (String name, String domain, String tld) -> System.out.println(name+"@"+domain+tld);
        createEmail1.email("aryo","gmail", "com");
    }
}


