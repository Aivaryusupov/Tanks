package com.yusupov.utils;

/**
 * 22.01.2018
 * Time
 *
 * @author Aivar Yusupov
 * @version v0.1
 */
public class Time {

    public static final long SECOND = 1000000000l;

    public static long get() {
        return System.nanoTime();
    }

}
