package junitperf;

import com.github.houbb.junitperf.core.annotation.JunitPerfConfig;

public class HelloWorldTest {

    @JunitPerfConfig(duration = 1000)
    public void helloTest() throws InterruptedException {
        Thread.sleep(100);
        System.out.println("Hello Junit5");
    }
}
