package pl.pkrysztofiak;

import org.openjdk.jmh.annotations.*;

@State(Scope.Thread)
public class Sample04DefaultState {

    double x = generate();

    private double generate() {
        System.out.println("generate() " + Thread.currentThread().getName());
        return Math.PI;
    }

    @Benchmark
    @Fork(2)
    @Warmup(iterations = 2)
    @Measurement(iterations = 2)
    @Threads(2)
    public void measure() {
        x++;
    }
}