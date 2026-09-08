package com.enigmacamp.stream;

import java.util.List;

public class SimpleIntermediateOperation {
    static void main() {
        //Intermediate Operator: filter, map, sorted, ...
        //filter
        List<Integer> numbers = List.of(8,6,7,2,4,8,10);
        numbers.stream().filter(n->n%2 == 0).forEach(System.out::println);

        //with variable
        List<Integer> evenNumbers = numbers.stream().filter(n->n%2==0).toList();
        System.out.println("add numbers: "+evenNumbers);

        //filter name based on huruf pertama
        List<String> names = List.of("Risqull", "Tashim", "Dhafin", "Irfan","Habel","Lukman","Sofyan","Aryo","Kimas","Jeremy");
        names.stream().filter(name -> {
            System.out.println("proses filtering dengan nama huruf depan D");
            return name.startsWith("d");
            //mencari di index tertentu:
            //return name.startsWith("a", 1);
        }).forEach(System.out::println);

    }
}
