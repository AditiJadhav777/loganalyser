
package com.github.AditiJadhav777;

public class Context {
    private static Context INSTANCE;

    private String logFilePath;

    private Context() {
    }

    public static Context getInstance() {
        if (INSTANCE == null) INSTANCE = new Context();
        return INSTANCE;
    }

    public String getLogFilePath() {
        return logFilePath;
    }

    public void setLogFilePath(String logFilePath) {
        this.logFilePath = logFilePath;
    }

}