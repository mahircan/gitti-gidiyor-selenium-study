package com.gittigidiyor.study.test;

import com.gittigidiyor.study.page.Log;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class TestResultLogger implements TestWatcher {
    Log log = new Log();

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        TestWatcher.super.testDisabled(context, reason);
        String testReport = context.getDisplayName();
        log.warn(testReport + " Disabled for " + reason);
    }
    @Override
    public void testSuccessful(ExtensionContext context) {
        TestWatcher.super.testSuccessful(context);
        String testMessage = context.getDisplayName();
        log.info(testMessage + " Passed!");
    }
    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        TestWatcher.super.testFailed(context, cause);
        String testName = context.getDisplayName();
        String testFailCause = cause.getMessage(); // Neden hata aldığımı böyle gösterebilirim
        log.error(testName + " Failed! with cause: " + testFailCause);
    }
}
