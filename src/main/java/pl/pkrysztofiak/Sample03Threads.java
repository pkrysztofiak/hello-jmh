package pl.pkrysztofiak;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class Sample03Threads {

    @Benchmark
    @Fork(value = 2, warmups = 4)
    @Measurement(iterations = 2)
    public void measure() {

    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder().include(Sample03States.class.getSimpleName()).build();
        new Runner(options).run();
    }
}
