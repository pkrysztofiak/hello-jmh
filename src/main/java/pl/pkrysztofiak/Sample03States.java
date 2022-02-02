package pl.pkrysztofiak;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class Sample03States {

    @State(Scope.Benchmark)
    public static class BenchmarkState {
        volatile double x = Math.PI;

        public BenchmarkState() {
            System.out.println("BenchmarkState() " + Thread.currentThread().getName());
        }
    }

    @State(Scope.Thread)
    public static class ThreadState {
        volatile double x = Math.PI;

        public ThreadState() {
            System.out.println("ThreadState() " + Thread.currentThread().getName());
        }
    }

    @Benchmark
    public void measureShared(BenchmarkState state) {
        state.x++;
    }

    @Benchmark
    @Warmup(iterations = 2)
    @Measurement(iterations = 2)
    @Threads(2)
    @Fork(2)
    public void measureUnshared(ThreadState state) {
        state.x++;
    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder().include(Sample03States.class.getSimpleName()).forks(2).warmupIterations(2).measurementIterations(2).threads(2).build();
        new Runner(options).run();
    }
}
