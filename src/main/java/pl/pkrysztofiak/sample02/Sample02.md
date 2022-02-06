```
# JMH version: 1.34
# VM version: JDK 17.0.2, OpenJDK 64-Bit Server VM, 17.0.2+8-LTS
# VM invoker: C:\Program Files\Amazon Corretto\jdk17.0.2_8\bin\java.exe
# VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2021.2.3\lib\idea_rt.jar=56959:C:\Program Files\JetBrains\IntelliJ IDEA 2021.2.3\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 10 s each
# Measurement: 1 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: pl.pkrysztofiak.sample02.Sample02BenchmarkModes.measureThroughput

# Run progress: 0,00% complete, ETA 00:01:00
# Fork: 1 of 1
# Warmup Iteration   1: 9,182 ops/s
Iteration   1: 9,161 ops/s


Result "pl.pkrysztofiak.sample02.Sample02BenchmarkModes.measureThroughput":
9,161 ops/s


# JMH version: 1.34
# VM version: JDK 17.0.2, OpenJDK 64-Bit Server VM, 17.0.2+8-LTS
# VM invoker: C:\Program Files\Amazon Corretto\jdk17.0.2_8\bin\java.exe
# VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2021.2.3\lib\idea_rt.jar=56959:C:\Program Files\JetBrains\IntelliJ IDEA 2021.2.3\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 10 s each
# Measurement: 1 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: pl.pkrysztofiak.sample02.Sample02BenchmarkModes.measureAverageTime

# Run progress: 33,33% complete, ETA 00:00:41
# Fork: 1 of 1
# Warmup Iteration   1: 109,351 ms/op
Iteration   1: 109,100 ms/op


Result "pl.pkrysztofiak.sample02.Sample02BenchmarkModes.measureAverageTime":
109,100 ms/op


# JMH version: 1.34
# VM version: JDK 17.0.2, OpenJDK 64-Bit Server VM, 17.0.2+8-LTS
# VM invoker: C:\Program Files\Amazon Corretto\jdk17.0.2_8\bin\java.exe
# VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2021.2.3\lib\idea_rt.jar=56959:C:\Program Files\JetBrains\IntelliJ IDEA 2021.2.3\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 10 s each
# Measurement: 1 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: pl.pkrysztofiak.sample02.Sample02BenchmarkModes.measureSamples

# Run progress: 66,66% complete, ETA 00:00:20
# Fork: 1 of 1
# Warmup Iteration   1: 108913,709 ±(99.9%) 342,279 us/op
Iteration   1: 109103,193 ±(99.9%) 370,806 us/op
measureSamples·p0.00:   107085,824 us/op
measureSamples·p0.50:   109051,904 us/op
measureSamples·p0.90:   110375,731 us/op
measureSamples·p0.95:   110932,787 us/op
measureSamples·p0.99:   113508,352 us/op
measureSamples·p0.999:  113508,352 us/op
measureSamples·p0.9999: 113508,352 us/op
measureSamples·p1.00:   113508,352 us/op



Result "pl.pkrysztofiak.sample02.Sample02BenchmarkModes.measureSamples":
N = 92
mean = 109103,193 ±(99.9%) 370,806 us/op

Histogram, us/op:
[107000,000, 107500,000) = 6
[107500,000, 108000,000) = 1
[108000,000, 108500,000) = 18
[108500,000, 109000,000) = 18
[109000,000, 109500,000) = 21
[109500,000, 110000,000) = 17
[110000,000, 110500,000) = 3
[110500,000, 111000,000) = 4
[111000,000, 111500,000) = 2
[111500,000, 112000,000) = 1
[112000,000, 112500,000) = 0
[112500,000, 113000,000) = 0
[113000,000, 113500,000) = 0

Percentiles, us/op:
p(0,0000) = 107085,824 us/op
p(50,0000) = 109051,904 us/op
p(90,0000) = 110375,731 us/op
p(95,0000) = 110932,787 us/op
p(99,0000) = 113508,352 us/op
p(99,9000) = 113508,352 us/op
p(99,9900) = 113508,352 us/op
p(99,9990) = 113508,352 us/op
p(99,9999) = 113508,352 us/op
p(100,0000) = 113508,352 us/op


# JMH version: 1.34
# VM version: JDK 17.0.2, OpenJDK 64-Bit Server VM, 17.0.2+8-LTS
# VM invoker: C:\Program Files\Amazon Corretto\jdk17.0.2_8\bin\java.exe
# VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2021.2.3\lib\idea_rt.jar=56959:C:\Program Files\JetBrains\IntelliJ IDEA 2021.2.3\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, single-shot each
# Measurement: 1 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: pl.pkrysztofiak.sample02.Sample02BenchmarkModes.measureSingleShot

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 1
# Warmup Iteration   1: 105,767 ms/op
Iteration   1: 102,197 ms/op



# Run complete. Total time: 00:01:03

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

Benchmark                                                       Mode  Cnt       Score     Error  Units
Sample02BenchmarkModes.measureThroughput                       thrpt            9,161            ops/s
Sample02BenchmarkModes.measureAverageTime                       avgt          109,100            ms/op
Sample02BenchmarkModes.measureSamples                         sample   92  109103,193 ± 370,806  us/op
Sample02BenchmarkModes.measureSamples:measureSamples·p0.00    sample       107085,824            us/op
Sample02BenchmarkModes.measureSamples:measureSamples·p0.50    sample       109051,904            us/op
Sample02BenchmarkModes.measureSamples:measureSamples·p0.90    sample       110375,731            us/op
Sample02BenchmarkModes.measureSamples:measureSamples·p0.95    sample       110932,787            us/op
Sample02BenchmarkModes.measureSamples:measureSamples·p0.99    sample       113508,352            us/op
Sample02BenchmarkModes.measureSamples:measureSamples·p0.999   sample       113508,352            us/op
Sample02BenchmarkModes.measureSamples:measureSamples·p0.9999  sample       113508,352            us/op
Sample02BenchmarkModes.measureSamples:measureSamples·p1.00    sample       113508,352            us/op
Sample02BenchmarkModes.measureSingleShot                          ss          102,197            ms/op

Process finished with exit code 0
```