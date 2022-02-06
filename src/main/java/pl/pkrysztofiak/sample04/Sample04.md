```
# JMH version: 1.34
# VM version: JDK 17.0.2, OpenJDK 64-Bit Server VM, 17.0.2+8-LTS
# VM invoker: C:\Program Files\Amazon Corretto\jdk17.0.2_8\bin\java.exe
# VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2021.2.3\lib\idea_rt.jar=58449:C:\Program Files\JetBrains\IntelliJ IDEA 2021.2.3\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 10 s each
# Measurement: 1 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 4 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: pl.pkrysztofiak.sample04.Sample04DefaultState.measure

# Run progress: 0,00% complete, ETA 00:00:20
# Fork: 1 of 1
# Warmup Iteration   1: initX() pl.pkrysztofiak.sample04.Sample04DefaultState.measure-jmh-worker-1
initX() pl.pkrysztofiak.sample04.Sample04DefaultState.measure-jmh-worker-3
initX() pl.pkrysztofiak.sample04.Sample04DefaultState.measure-jmh-worker-4
initX() pl.pkrysztofiak.sample04.Sample04DefaultState.measure-jmh-worker-2
7595805534,980 ops/s
Iteration   1: 7788907294,803 ops/s


Result "pl.pkrysztofiak.sample04.Sample04DefaultState.measure":
  7788907294,803 ops/s


# Run complete. Total time: 00:00:20

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

NOTE: Current JVM experimentally supports Compiler Blackholes, and they are in use. Please exercise
extra caution when trusting the results, look into the generated code to check the benchmark still
works, and factor in a small probability of new VM bugs. Additionally, while comparisons between
different JVMs are already problematic, the performance difference caused by different Blackhole
modes can be very significant. Please make sure you use the consistent Blackhole mode for comparisons.

Benchmark                      Mode  Cnt           Score   Error  Units
Sample04DefaultState.measure  thrpt       7788907294,803          ops/s
```