package com.siwang.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.vertx.java.platform.Verticle;

/**
 * Created by Siqin on 27/08/2015.
 */
public class TestWorkerVerticle extends Verticle {

    public void start() {
        Logger logger = LogManager.getLogger(this.getClass());
        for (int i = 0 ; i< 1000; i++) {
            logger.info("Start worker verticle");
        }
    }
}
