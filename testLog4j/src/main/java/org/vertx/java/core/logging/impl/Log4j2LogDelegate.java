package org.vertx.java.core.logging.impl;



import org.apache.logging.log4j.Level;
import org.vertx.java.core.logging.impl.LogDelegate;

/**
 * Created by siqin on 8/31/15.
 */
public class Log4j2LogDelegate implements LogDelegate {
  //private static final String FQCN = Logger.class.getCanonicalName();

  private final org.apache.logging.log4j.Logger logger;

  Log4j2LogDelegate(final String name) {
    logger = org.apache.logging.log4j.LogManager.getLogger(name);
  }

  public boolean isInfoEnabled() {
    return logger.isInfoEnabled();
  }

  public boolean isDebugEnabled() {
    return logger.isDebugEnabled();
  }

  public boolean isTraceEnabled() {
    return logger.isTraceEnabled();
  }

  public void fatal(final Object message) {
    log(Level.FATAL, message);
  }

  public void fatal(final Object message, final Throwable t) {
    log(Level.FATAL, message, t);
  }

  public void error(final Object message) {
    log(Level.ERROR, message);
  }

  public void error(final Object message, final Throwable t) {
    log(Level.ERROR, message, t);
  }

  public void warn(final Object message) {
    log(Level.WARN, message);
  }

  public void warn(final Object message, final Throwable t) {
    log(Level.WARN, message, t);
  }

  public void info(final Object message) {
    log(Level.INFO, message);
  }

  public void info(final Object message, final Throwable t) {
    log(Level.INFO, message, t);
  }

  public void debug(final Object message) {
    log(Level.DEBUG, message);
  }

  public void debug(final Object message, final Throwable t) {
    log(Level.DEBUG, message, t);
  }

  public void trace(final Object message) {
    log(Level.TRACE, message);
  }

  public void trace(final Object message, final Throwable t) {
    log(Level.TRACE, message, t);
  }

  private void log(Level level, Object message) {
    log(level, message, null);
  }

  private void log(Level level, Object message, Throwable t) {
    logger.log(level, message, t);
  }
}
