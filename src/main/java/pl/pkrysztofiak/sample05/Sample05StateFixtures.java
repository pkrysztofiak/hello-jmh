package pl.pkrysztofiak.sample05;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@State(Scope.Thread)
public class Sample05StateFixtures {

    double x;

    public Sample05StateFixtures() {
        System.out.println("Sample05StateFixtures() " + Thread.currentThread().getName());
    }

    @Setup
    public void setup() {
        System.out.println("setup() [" + Thread.currentThread().getName() + "]");
        x = Math.PI;
    }

    @TearDown
    public void tearDown() {
        System.out.println("tearDown() " + Thread.currentThread().getName());
        assert x > Math.PI : "Nothing changed!";
    }

    //TODO to the next
//    @Benchmark
//    public void measureWithoutState() {
//
//    }

    @Benchmark
    public void measureCorrect() {
        x++;
    }

    @Benchmark
    public void measureIncorrect() {
        double x = 0;
        x++;
    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(Sample05StateFixtures.class.getSimpleName())
                .warmupIterations(1)
                .measurementIterations(1)
                .forks(1)
                .jvmArgs("-enableassertions") //-ea
                .build();

        new Runner(options).run();
    }
}