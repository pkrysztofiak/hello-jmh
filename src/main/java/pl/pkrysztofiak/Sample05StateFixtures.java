package pl.pkrysztofiak;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import javax.swing.text.html.Option;

@State(Scope.Thread)
public class Sample05StateFixtures {

    double x;

    @Setup
    public void setup() {
        System.out.println("setup");
        x = Math.PI;
    }

    @TearDown
    public void tearDown() {
        System.out.println("tearDown");
        assert x > Math.PI : "Nothing changed?";
    }

    @Benchmark
    public void measureRight() {
        x++;
    }

    @Benchmark
    public void measureWrong() {
        double x = 0;
        x++;
    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder().include(Sample05StateFixtures.class.getSimpleName())
                .forks(1)
                .warmupIterations(1)
                .measurementIterations(1)
                .jvmArgs("-ea")
                .build();
        new Runner(options).run();
    }
}
