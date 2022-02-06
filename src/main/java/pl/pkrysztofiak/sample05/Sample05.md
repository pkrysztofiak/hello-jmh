```
# JMH version: 1.34
# VM version: JDK 17.0.2, OpenJDK 64-Bit Server VM, 17.0.2+8-LTS
# VM invoker: C:\Program Files\Amazon Corretto\jdk17.0.2_8\bin\java.exe
# VM options: -enableassertions
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 10 s each
# Measurement: 1 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: pl.pkrysztofiak.sample05.Sample05StateFixtures.measureCorrect

# Run progress: 0,00% complete, ETA 00:00:40
# Fork: 1 of 1
# Warmup Iteration   1: Sample05StateFixtures() pl.pkrysztofiak.sample05.Sample05StateFixtures.measureCorrect-jmh-worker-1
setup() [pl.pkrysztofiak.sample05.Sample05StateFixtures.measureCorrect-jmh-worker-1]
407429313,513 ops/s
Iteration   1: tearDown() pl.pkrysztofiak.sample05.Sample05StateFixtures.measureCorrect-jmh-worker-1
408139663,602 ops/s


Result "pl.pkrysztofiak.sample05.Sample05StateFixtures.measureCorrect":
  408139663,602 ops/s


# JMH version: 1.34
# VM version: JDK 17.0.2, OpenJDK 64-Bit Server VM, 17.0.2+8-LTS
# VM invoker: C:\Program Files\Amazon Corretto\jdk17.0.2_8\bin\java.exe
# VM options: -enableassertions
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 10 s each
# Measurement: 1 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: pl.pkrysztofiak.sample05.Sample05StateFixtures.measureIncorrect

# Run progress: 50,00% complete, ETA 00:00:20
# Fork: 1 of 1
# Warmup Iteration   1: Sample05StateFixtures() pl.pkrysztofiak.sample05.Sample05StateFixtures.measureIncorrect-jmh-worker-1
setup() [pl.pkrysztofiak.sample05.Sample05StateFixtures.measureIncorrect-jmh-worker-1]
2214938634,905 ops/s
Iteration   1: tearDown() pl.pkrysztofiak.sample05.Sample05StateFixtures.measureIncorrect-jmh-worker-1
<failure>

java.lang.AssertionError: Nothing changed!
	at pl.pkrysztofiak.sample05.Sample05StateFixtures.tearDown(Sample05StateFixtures.java:27)
	at pl.pkrysztofiak.sample05.jmh_generated.Sample05StateFixtures_measureIncorrect_jmhTest.measureIncorrect_Throughput(Sample05StateFixtures_measureIncorrect_jmhTest.java:97)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)




# Run complete. Total time: 00:00:40

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

Benchmark                              Mode  Cnt          Score   Error  Units
Sample05StateFixtures.measureCorrect  thrpt       408139663,602          ops/s
```