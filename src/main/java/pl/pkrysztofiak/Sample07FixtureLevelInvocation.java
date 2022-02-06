package pl.pkrysztofiak;

import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class Sample07FixtureLevelInvocation {

    @State(Scope.Benchmark)
    public static class NormalState {
        ExecutorService service;


    }

}
