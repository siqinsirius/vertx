package com.siwang.app;
/*
 * Copyright 2013 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
 */


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.vertx.java.core.Handler;
import org.vertx.java.core.eventbus.Message;
import org.vertx.java.core.logging.impl.LoggerFactory;
import org.vertx.java.platform.Verticle;

/*
This is a simple Java verticle which receives `ping` messages on the event bus and sends back `pong` replies
 */
public class StarterVerticle extends Verticle {

  public void start() {

    //container.logger().debug();

    //Logger logger = LogManager.getLogger(this.getClass());

    org.vertx.java.core.logging.Logger logger = LoggerFactory.getLogger(this.getClass());

    logger.info("Start main verticle");

    container.deployWorkerVerticle("com.siwang.app.TestWorkerVerticle");
    container.deployVerticle("com.siwang.app.TestVerticle");

  }
}
