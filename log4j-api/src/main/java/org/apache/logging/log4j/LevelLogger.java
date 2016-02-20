/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache license, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the license for the specific language governing permissions and
 * limitations under the license.
 */
package org.apache.logging.log4j;

import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.util.Supplier;

/**
 * Logger that logs at a certain level. If the level is not enabled, log statements are not processed.
 */
public interface LevelLogger {

    /**
     * Gets the Level at which the Logger is enabled in configuration.
     *
     * @return the the Level at which the Logger is enabled in configuration.
     */
    public Level getEnabledLevel();

    /**
     * Gets the Level at which this {@code LevelLogger} attempts to log.
     * <p>
     * For a logger obtained with {@code LogManager.getLogger().info()}, this method returns {@link Level#INFO}.
     * </p>
     *
     * @return the Level at which this {@code LevelLogger} attempts to log.
     */
    public Level getLogLevel();

    /**
     * Gets the logger name.
     *
     * @return the logger name.
     */
    String getName();

    /**
     * Checks whether this LevelLogger is enabled.
     *
     * @return boolean - {@code true} if this LevelLogger is enabled, {@code false} otherwise.
     */
    boolean isEnabled();

    /**
     * Checks whether this LevelLogger is enabled given the specified (optional) Marker.
     *
     * @param marker The marker data specific to this log statement.
     * @return boolean - {@code true} if this LevelLogger is enabled, {@code false}
     * otherwise.
     */
    boolean isEnabled(Marker marker);

    /**
     * Logs a message with the specific Marker at this {@code LevelLogger}'s level.
     *
     * @param marker the marker data specific to this log statement
     * @param msg the message string to be logged
     */
    void log(Marker marker, Message msg);

    /**
     * Logs a message with the specific Marker at this {@code LevelLogger}'s level.
     *
     * @param marker the marker data specific to this log statement
     * @param msg the message string to be logged
     * @param t A Throwable or null.
     */
    void log(Marker marker, Message msg, Throwable t);

    /**
     * Logs a message object at this {@code LevelLogger}'s level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message object to log.
     */
    void log(Marker marker, Object message);

    /**
     * Logs a message at this {@code LevelLogger}'s level including the stack trace of the {@link Throwable}
     * <code>t</code> passed as parameter.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message to log.
     * @param t the exception to log, including its stack trace.
     */
    void log(Marker marker, Object message, Throwable t);

    /**
     * Logs a message object at this {@code LevelLogger}'s level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message object to log.
     */
    void log(Marker marker, String message);

    /**
     * Logs a message with parameters at this {@code LevelLogger}'s level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0 parameter to the message.
     */
    void log(Marker marker, String message, Object p0);

    /**
     * Logs a message with parameters at this {@code LevelLogger}'s level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0 parameter to the message.
     * @param p1 parameter to the message.
     */
    void log(Marker marker, String message, Object p0, Object p1);

    /**
     * Logs a message with parameters at this {@code LevelLogger}'s level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0 parameter to the message.
     * @param p1 parameter to the message.
     * @param p2 parameter to the message.
     */
    void log(Marker marker, String message, Object p0, Object p1, Object p2);

    /**
     * Logs a message with parameters at this {@code LevelLogger}'s level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0 parameter to the message.
     * @param p1 parameter to the message.
     * @param p2 parameter to the message.
     * @param p3 parameter to the message.
     */
    void log(Marker marker, String message, Object p0, Object p1, Object p2, Object p3);

    /**
     * Logs a message with parameters at this {@code LevelLogger}'s level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0 parameter to the message.
     * @param p1 parameter to the message.
     * @param p2 parameter to the message.
     * @param p3 parameter to the message.
     * @param p4 parameter to the message.
     */
    void log(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4);

    /**
     * Logs a message with parameters at this {@code LevelLogger}'s level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0 parameter to the message.
     * @param p1 parameter to the message.
     * @param p2 parameter to the message.
     * @param p3 parameter to the message.
     * @param p4 parameter to the message.
     * @param p5 parameter to the message.
     */
    void log(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5);

    /**
     * Logs a message with parameters at this {@code LevelLogger}'s level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0 parameter to the message.
     * @param p1 parameter to the message.
     * @param p2 parameter to the message.
     * @param p3 parameter to the message.
     * @param p4 parameter to the message.
     * @param p5 parameter to the message.
     * @param p6 parameter to the message.
     */
    void log(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
            Object p6);

    /**
     * Logs a message with parameters at this {@code LevelLogger}'s level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0 parameter to the message.
     * @param p1 parameter to the message.
     * @param p2 parameter to the message.
     * @param p3 parameter to the message.
     * @param p4 parameter to the message.
     * @param p5 parameter to the message.
     * @param p6 parameter to the message.
     * @param p7 parameter to the message.
     */
    void log(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
            Object p7);

    /**
     * Logs a message with parameters at this {@code LevelLogger}'s level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0 parameter to the message.
     * @param p1 parameter to the message.
     * @param p2 parameter to the message.
     * @param p3 parameter to the message.
     * @param p4 parameter to the message.
     * @param p5 parameter to the message.
     * @param p6 parameter to the message.
     * @param p7 parameter to the message.
     * @param p8 parameter to the message.
     */
    void log(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
            Object p7, Object p8);

    /**
     * Logs a message with parameters at this {@code LevelLogger}'s level.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0 parameter to the message.
     * @param p1 parameter to the message.
     * @param p2 parameter to the message.
     * @param p3 parameter to the message.
     * @param p4 parameter to the message.
     * @param p5 parameter to the message.
     * @param p6 parameter to the message.
     * @param p7 parameter to the message.
     * @param p8 parameter to the message.
     * @param p9 parameter to the message.
     */
    void log(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
            Object p7, Object p8, Object p9);

    /**
     * Logs a message with parameters at this {@code LevelLogger}'s level.
     * <p>
     * This method allocates temporary objects and is not GC-free.
     * </p>
     *
     * @param marker the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param params parameters to the message.
     */
    void log(Marker marker, String message, Object... params);

    /**
     * Logs a message with parameters which are only to be constructed if the logging level is the {@link Level#DEBUG
     * DEBUG} level.
     * <p>
     * This method allocates temporary objects and is not GC-free.
     * </p>
     *
     * @param marker the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param paramSuppliers An array of functions, which when called, produce the desired log message parameters.
     */
    void log(Marker marker, String message, Supplier<?>... paramSuppliers);

    /**
     * Logs a message at this {@code LevelLogger}'s level including the stack trace of the {@link Throwable}
     * <code>t</code> passed as parameter.
     *
     * @param marker the marker data specific to this log statement
     * @param message the message to log.
     * @param t the exception to log, including its stack trace.
     */
    void log(Marker marker, String message, Throwable t);

    /**
     * Logs a message which is only to be constructed if the logging level is this {@code LevelLogger}'s level with
     * the specified Marker.
     *
     * @param marker the marker data specific to this log statement
     * @param msgSupplier A function, which when called, produces the desired log message; the format depends on the
     * message factory.
     */
    void log(Marker marker, Supplier<?> msgSupplier);

    /**
     * Logs a message (only to be constructed if the logging level is this {@code LevelLogger}'s level) with the
     * specified Marker and including the stack trace of the {@link Throwable} <code>t</code> passed as parameter.
     *
     * @param marker the marker data specific to this log statement
     * @param msgSupplier A function, which when called, produces the desired log message; the format depends on the
     * message factory.
     * @param t A Throwable or null.
     */
    void log(Marker marker, Supplier<?> msgSupplier, Throwable t);

    /**
     * Logs a message with the specific Marker at this {@code LevelLogger}'s level.
     *
     * @param msg the message string to be logged
     */
    void log(Message msg);

    /**
     * Logs a message with the specific Marker at this {@code LevelLogger}'s level.
     *
     * @param msg the message string to be logged
     * @param t A Throwable or null.
     */
    void log(Message msg, Throwable t);

    /**
     * Logs a message object at this {@code LevelLogger}'s level.
     *
     * @param message the message object to log.
     */
    void log(Object message);

    /**
     * Logs a message at this {@code LevelLogger}'s level including the stack trace of the {@link Throwable}
     * <code>t</code> passed as parameter.
     *
     * @param message the message to log.
     * @param t the exception to log, including its stack trace.
     */
    void log(Object message, Throwable t);

    /**
     * Logs a message object at this {@code LevelLogger}'s level.
     *
     * @param message the message string to log.
     */
    void log(String message);

    /**
     * Logs a message with parameters at this {@code LevelLogger}'s level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0 parameter to the message.
     */
    void log(String message, Object p0);

    /**
     * Logs a message with parameters at this {@code LevelLogger}'s level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0 parameter to the message.
     * @param p1 parameter to the message.
     */
    void log(String message, Object p0, Object p1);

    /**
     * Logs a message with parameters at this {@code LevelLogger}'s level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0 parameter to the message.
     * @param p1 parameter to the message.
     * @param p2 parameter to the message.
     */
    void log(String message, Object p0, Object p1, Object p2);

    /**
     * Logs a message with parameters at this {@code LevelLogger}'s level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0 parameter to the message.
     * @param p1 parameter to the message.
     * @param p2 parameter to the message.
     * @param p3 parameter to the message.
     */
    void log(String message, Object p0, Object p1, Object p2, Object p3);

    /**
     * Logs a message with parameters at this {@code LevelLogger}'s level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0 parameter to the message.
     * @param p1 parameter to the message.
     * @param p2 parameter to the message.
     * @param p3 parameter to the message.
     * @param p4 parameter to the message.
     */
    void log(String message, Object p0, Object p1, Object p2, Object p3, Object p4);

    /**
     * Logs a message with parameters at this {@code LevelLogger}'s level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0 parameter to the message.
     * @param p1 parameter to the message.
     * @param p2 parameter to the message.
     * @param p3 parameter to the message.
     * @param p4 parameter to the message.
     * @param p5 parameter to the message.
     */
    void log(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5);

    /**
     * Logs a message with parameters at this {@code LevelLogger}'s level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0 parameter to the message.
     * @param p1 parameter to the message.
     * @param p2 parameter to the message.
     * @param p3 parameter to the message.
     * @param p4 parameter to the message.
     * @param p5 parameter to the message.
     * @param p6 parameter to the message.
     */
    void log(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6);

    /**
     * Logs a message with parameters at this {@code LevelLogger}'s level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0 parameter to the message.
     * @param p1 parameter to the message.
     * @param p2 parameter to the message.
     * @param p3 parameter to the message.
     * @param p4 parameter to the message.
     * @param p5 parameter to the message.
     * @param p6 parameter to the message.
     * @param p7 parameter to the message.
     */
    void log(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7);

    /**
     * Logs a message with parameters at this {@code LevelLogger}'s level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0 parameter to the message.
     * @param p1 parameter to the message.
     * @param p2 parameter to the message.
     * @param p3 parameter to the message.
     * @param p4 parameter to the message.
     * @param p5 parameter to the message.
     * @param p6 parameter to the message.
     * @param p7 parameter to the message.
     * @param p8 parameter to the message.
     */
    void log(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7,
            Object p8);

    /**
     * Logs a message with parameters at this {@code LevelLogger}'s level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0 parameter to the message.
     * @param p1 parameter to the message.
     * @param p2 parameter to the message.
     * @param p3 parameter to the message.
     * @param p4 parameter to the message.
     * @param p5 parameter to the message.
     * @param p6 parameter to the message.
     * @param p7 parameter to the message.
     * @param p8 parameter to the message.
     * @param p9 parameter to the message.
     */
    void log(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7,
            Object p8, Object p9);

    /**
     * Logs a message with parameters at this {@code LevelLogger}'s level.
     * <p>
     * This method allocates temporary objects and is not GC-free.
     * </p>
     *
     * @param message the message to log; the format depends on the message factory.
     * @param params parameters to the message.
     */
    void log(String message, Object... params);

    /**
     * Logs a message with parameters which are only to be constructed if the logging level is the {@link Level#DEBUG
     * DEBUG} level.
     * <p>
     * This method allocates temporary objects and is not GC-free.
     * </p>
     *
     * @param message the message to log; the format depends on the message factory.
     * @param paramSuppliers An array of functions, which when called, produce the desired log message parameters.
     */
    void log(String message, Supplier<?>... paramSuppliers);

    /**
     * Logs a message at this {@code LevelLogger}'s level including the stack trace of the {@link Throwable}
     * <code>t</code> passed as parameter.
     *
     * @param message the message to log.
     * @param t the exception to log, including its stack trace.
     */
    void log(String message, Throwable t);

    /**
     * Logs a message which is only to be constructed if the logging level is this {@code LevelLogger}'s level.
     *
     * @param msgSupplier A function, which when called, produces the desired log message; the format depends on the
     * message factory.
     */
    void log(Supplier<?> msgSupplier);

    /**
     * Logs a message (only to be constructed if the logging level is this {@code LevelLogger}'s level) including the
     * stack trace of the {@link Throwable} <code>t</code> passed as parameter.
     *
     * @param msgSupplier A function, which when called, produces the desired log message; the format depends on the
     * message factory.
     * @param t the exception to log, including its stack trace.
     */
    void log(Supplier<?> msgSupplier, Throwable t);

    /**
     * Logs a formatted message using the specified format string and arguments.
     * <p>
     * This method allocates temporary objects and is not GC-free.
     * </p>
     *
     * @param marker the marker data specific to this log statement.
     * @param format The format String.
     * @param params Arguments specified by the format.
     */
    // no point in unrolling varargs for this method since StringFormatterMessage is not GC-free
    void printf(Marker marker, String format, Object... params);

    /**
     * Logs a formatted message using the specified format string and arguments.
     * <p>
     * This method allocates temporary objects and is not GC-free.
     * </p>
     *
     * @param format The format String.
     * @param params Arguments specified by the format.
     */
    // no point in unrolling varargs for this method since StringFormatterMessage is not GC-free
    void printf(String format, Object... params);
}
