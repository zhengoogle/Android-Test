package com.simple.pmocklibrary.robolectric.maven;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;

@Config(manifest = Config.NONE)
@RunWith(CustomRobolectricMavenRunner.class)
public class RunnerTest {

    @Test
    public void test() {
        System.out.println("maven download...");
    }
}
