package com.enigmacamp;

import com.enigmacamp.lambda.Greeting;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Greeting greeting1 = (String name) -> System.out.printf("Selamat pagi %s\n", name);
    }
}
