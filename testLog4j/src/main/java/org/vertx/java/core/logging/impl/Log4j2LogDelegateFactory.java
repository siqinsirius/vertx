package org.vertx.java.core.logging.impl;

/**
 * Created by siqin on 8/31/15.
 */
public class Log4j2LogDelegateFactory implements LogDelegateFactory
{
  public LogDelegate createDelegate(final String name)
  {
    return new Log4j2LogDelegate(name);
  }

}