package pl.pkrysztofiak.sample04;

import org.openjdk.jmh.annotations.*;

@State(Scope.Thread)
public class Sample04DefaultState {

    double x = initX();

    double initX() {
        System.out.println("initX() " + Thread.currentThread().getName());
        return Math.PI;
    }

    @Benchmark
    @Warmup(iterations = 1)
    @Measurement(iterations = 1)
    @Fork(1)
    @Threads(4)
    public void measure() {
        x++;
    }
}