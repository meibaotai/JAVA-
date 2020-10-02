package Threads;

import java.util.stream.IntStream;

public class First {
    public static void main(String[] args){
        IntStream
                .range(1,10)
                .filter(i -> i%2==0)
                .forEach(System.out::print);
    }
}
