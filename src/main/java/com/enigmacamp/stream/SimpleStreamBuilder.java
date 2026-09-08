package com.enigmacamp.stream;

import java.util.stream.Stream;

public class SimpleStreamBuilder {
    static void main() {
        //stream builder
        Stream.Builder<String> names = Stream.builder();

        //isi data
        names.add("Solowi");
        names.add("Bahliludin");
        names.add("Prapanca");

        //buatkan stream
        Stream<String> nameStream = names.build();

        //output -> terminal operation
        nameStream.forEach(System.out::println);
    }
}
