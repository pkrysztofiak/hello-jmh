package pl.pkrysztofiak;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@State(Scope.Thread)
public class Sample06FixtureLevel {

    double x;

    @TearDown(Level.Iteration)
    public void tearDown() {
        assert x > Math.PI : "Nothing changed?";
    }

    @Setup
    public void setup() {
        x = Math.PI;
    }

    @Benchmark
    public void correctBenchmark() {
        x++;
    }

    @Benchmark
    public void incorrectBenchmark() {
        double x = 0;
        x++;
    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder().include(Sample06FixtureLevel.class.getSimpleName())
                .warmupIterations(1)
                .measurementIterations(5)
                .forks(1)
                .jvmArgs("-ea")
                .build();
        new Runner(options).run();
    }
}