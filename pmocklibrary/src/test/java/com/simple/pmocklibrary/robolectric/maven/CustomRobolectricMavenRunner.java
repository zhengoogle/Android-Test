package com.simple.pmocklibrary.robolectric.maven;

import org.junit.runners.model.InitializationError;
import org.robolectric.RoboSettings;
import org.robolectric.RobolectricTestRunner;

/**
 * Custom download
 * ---https://www.jianshu.com/p/06e6b5633054
 */
public class CustomRobolectricMavenRunner extends RobolectricTestRunner {
    public CustomRobolectricMavenRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
        RoboSettings.setMavenRepositoryId("alimaven");
        RoboSettings.setMavenRepositoryUrl("http://maven.aliyun.com/nexus/content/groups/public/");
    }
}
