package pl.pkrysztofiak.sample03;

import org.openjdk.jmh.annotations.*;

@Warmup(iterations = 1)
@Measurement(iterations = 1)
@Threads(4)
@Fork(1)
public class Sample03States {

    @State(Scope.Benchmark)
    public static class BenchmarkState {
        volatile double x;

        public BenchmarkState() {
            System.out.println("BenchmarkState() " + Thread.currentThread().getName());
            this.x = Math.PI;
        }
    }

    @State(Scope.Thread)
    public static class ThreadState {
        volatile double x;

        public ThreadState() {
            System.out.println("ThreadState() " + Thread.currentThread().getName());
            x = Math.PI;
        }
    }

    @Benchmark
    public void measureUnshared(ThreadState state) {
        state.x++;
    }

    @Benchmark
    public void measureShared(BenchmarkState state) {
        state.x++;
    }

}