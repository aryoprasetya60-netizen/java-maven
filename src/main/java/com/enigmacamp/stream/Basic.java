package com.enigmacamp.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Basic {
    static void main() {
        //basic stream
        Stream<String> stream1 =  Stream.of("Aryo", "Bangka Belitung", "Koba");
        Stream<String> stream2 = Stream.ofNullable(null);

        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);

        //basic stream dari array & collection
        List<String> trainees = Arrays.asList("aryo","dhafin","habel");
        //jadikan stream
        Stream<String>  traineeStream = trainees.stream();
        traineeStream.forEach(System.out::println);
    }
}
