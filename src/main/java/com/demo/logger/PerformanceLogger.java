package com.demo.logger;

import java.util.logging.Logger;

public class PerformanceLogger {

    private Logger logger = Logger.getLogger("performance.logger");

    public PerformanceLoggerInfo startTime(String methodName) {
        return new PerformanceLoggerInfo(methodName,System.currentTimeMillis());
    }

    public void testPerformance(PerformanceLoggerInfo info) {
        long startTime = info.getTime();
        long finishedTime = System.currentTimeMillis();
        logger.info(info.getName() + "take times "+ (finishedTime-startTime) + "milliseconds.");
    }

    public static class PerformanceLoggerInfo {
        private final String name;
        private final Long time;

        public PerformanceLoggerInfo(String name, Long time) {
            this.name = name;
            this.time = time;
        }

        public String getName() {
            return name;
        }

        public Long getTime() {
            return time;
        }
    }
}
