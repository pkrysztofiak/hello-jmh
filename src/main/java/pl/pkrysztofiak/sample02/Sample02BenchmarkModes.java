package pl.pkrysztofiak.sample02;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

@Fork(1)
@Warmup(iterations = 1)
@Measurement(iterations = 1)
public class Sample02BenchmarkModes {

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.SECONDS)
    public void measureThroughput() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(100);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void measureAverageTime() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(100);
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void measureSamples() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(100);
    }

    @Benchmark
    @BenchmarkMode(Mode.SingleShotTime)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void measureSingleShot() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(100);
    }

//    @Benchmark
//    @BenchmarkMode({Mode.Throughput, Mode.AverageTime, Mode.SampleTime, Mode.SingleShotTime})
//    @OutputTimeUnit(TimeUnit.MILLISECONDS)
//    public void measureMultipleModes() throws InterruptedException {
//        TimeUnit.MILLISECONDS.sleep(100);
//    }

//    @Benchmark
//    @BenchmarkMode(Mode.All)
//    @OutputTimeUnit(TimeUnit.MILLISECONDS)
//    public void measureAll() throws InterruptedException {
//        TimeUnit.MILLISECONDS.sleep(100);
//    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(Sample02BenchmarkModes.class.getSimpleName())
                .build();
        new Runner(options).run();
    }
}
