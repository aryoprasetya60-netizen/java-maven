package com.enigmacamp.stream;

import java.util.List;
import java.util.Optional;

public class SimpleTerminalOperator {
    static void main() {
        // terminal operation : foreach, reduce, tolist, dll...
        //reduce
        List<Integer> numbers = List.of(8,7,6,9);
        Optional<Integer> addResult = numbers.stream().reduce(Integer::sum);
        System.out.println("Hasil Penjumlahan : "+addResult.get());

        long countNumber = numbers.stream().count();
        System.out.println("Jumlah angka: "+countNumber);
    }
}
