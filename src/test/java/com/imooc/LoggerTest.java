package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 廖师兄
 * 2017-06-02 17:44
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
//@Data
public class LoggerTest {

    private final Logger log = LoggerFactory.getLogger(LoggerTest.class);
//    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class)

    @Test
    public void test1() {
        String name = "imooc";
        String password = "123456";
        log.debug("中文...");
        log.info("中文name: " + name + " ,password: " + password);
        log.info("中文name: {}, password: {}", name, password);
        log.error("中文error...");
        log.warn("中文warn...");
    }
}
