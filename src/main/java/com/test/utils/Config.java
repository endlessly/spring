package com.test.utils;

import java.util.Date;

public class Config {
    public static Integer getTime() {
        Long time = new Date().getTime() / 1000;
        return time.intValue();
    }
}
