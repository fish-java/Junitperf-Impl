package junitperf;

import com.github.houbb.junitperf.core.annotation.JunitPerfConfig;
import com.github.houbb.junitperf.core.annotation.JunitPerfRequire;
import util.StringExplosion;

public class StringAppendTest {

    @JunitPerfConfig(duration = 100)
    public void stringAppend(){
        StringExplosion.stringAppend("hello world");
    }
    // Ave latency:    5.9159446ms

    @JunitPerfConfig(duration = 100)
    public void stringBuilderAppend(){
        StringExplosion.stringBuilderAppend("hello world");
    }
    // Ave latency:    0.047915455ms

    @JunitPerfConfig(threads = 10, warmUp = 0, duration = 1000)
    @JunitPerfRequire(min = 0.1f, max = 0.2f, average = 0.12f)
    public void stringBuilderAppend2(){
        StringExplosion.stringBuilderAppend("hello world");
    }
}
