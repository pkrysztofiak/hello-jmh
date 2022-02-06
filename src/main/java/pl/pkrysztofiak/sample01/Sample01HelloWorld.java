package pl.pkrysztofiak.sample01;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class Sample01HelloWorld {

    /**
     * <pre>
     * JMH version: 1.34
     * VM version: JDK 17.0.2, OpenJDK 64-Bit Server VM, 17.0.2+8-LTS
     * VM invoker: C:\Program Files\Amazon Corretto\jdk17.0.2_8\bin\java.exe
     * VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2021.2.3\lib\idea_rt.jar=54948:C:\Program Files\JetBrains\IntelliJ IDEA 2021.2.3\bin -Dfile.encoding=UTF-8
     * Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
     * Warmup: 5 iterations, 10 s each
     * Measurement: 5 iterations, 10 s each
     * Timeout: 10 min per iteration
     * Threads: 1 thread, will synchronize iterations
     * Benchmark mode: Throughput, ops/time
     * Benchmark: pl.pkrysztofiak.sample01.Sample01HelloWorld.hello
     * </pre>
     */
    public void hello() {

    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(Sample01HelloWorld.class.getSimpleName())
                .build();
        new Runner(options).run();
    }
}