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
package org.apache.logging.log4j.spi;

import java.io.Serializable;
import java.util.Objects;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LevelLogger;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.message.MessageFactory2;
import org.apache.logging.log4j.util.Supplier;

/**
 * LevelLogger implementation.
 */
class LevelLoggerImpl implements LevelLogger, Serializable {
    private static final long serialVersionUID = -6052243590471663046L;
    private static final String FQCN = LevelLoggerImpl.class.getName();

    private final Level level;
    private final AbstractLogger logger;

    public LevelLoggerImpl(final Level level, final AbstractLogger logger) {
        this.level = Objects.requireNonNull(level, "level");
        this.logger = Objects.requireNonNull(logger, "logger");
    }

    @Override
    public Level getEnabledLevel() {
        return logger.getLevel();
    }

    @Override
    public Level getLogLevel() {
        return level;
    }

    @Override
    public String getName() {
        return logger.getName();
    }

    @Override
    public boolean isEnabled() {
        return logger.isEnabled(getLogLevel());
    }

    @Override
    public boolean isEnabled(final Marker marker) {
        return logger.isEnabled(getLogLevel(), marker);
    }

    @Override
    public void log(final Marker marker, final Message msg) {
        logger.logIfEnabled(FQCN, level, marker, msg, null);
    }

    @Override
    public void log(final Marker marker, final Message msg, final Throwable t) {
        logger.logIfEnabled(FQCN, level, marker, msg, t);
    }

    @Override
    public void log(final Marker marker, final Object message) {
        logger.logIfEnabled(FQCN, level, marker, message, null);
    }

    @Override
    public void log(final Marker marker, final Object message, final Throwable t) {
        logger.logIfEnabled(FQCN, level, marker, message, t);
    }

    @Override
    public void log(final Marker marker, final String message) {
        logger.logIfEnabled(FQCN, level, marker, message);
    }

    @Override
    public void log(final Marker marker, final String message, final Object p0) {
        if (logger.isEnabled(level, marker, message)) {
            final Message msg = newMessage(message, p0);
            logger.logMessage(FQCN, level, marker, msg, msg.getThrowable());
        }
    }

    @Override
    public void log(final Marker marker, final String message, final Object p0, final Object p1) {
        if (logger.isEnabled(level, marker, message)) {
            final Message msg = newMessage(message, p0, p1);
            logger.logMessage(FQCN, level, marker, msg, msg.getThrowable());
        }
    }

    @Override
    public void log(final Marker marker, final String message, final Object p0, final Object p1, final Object p2) {
        if (logger.isEnabled(level, marker, message)) {
            final Message msg = newMessage(message, p0, p1, p2);
            logger.logMessage(FQCN, level, marker, msg, msg.getThrowable());
        }
    }

    @Override
    public void log(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3) {
        if (logger.isEnabled(level, marker, message)) {
            final Message msg = newMessage(message, p0, p1, p2, p3);
            logger.logMessage(FQCN, level, marker, msg, msg.getThrowable());
        }
    }

    @Override
    public void log(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4) {
        if (logger.isEnabled(level, marker, message)) {
            final Message msg = newMessage(message, p0, p1, p2, p3, p4);
            logger.logMessage(FQCN, level, marker, msg, msg.getThrowable());
        }
    }

    @Override
    public void log(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5) {
        if (logger.isEnabled(level, marker, message)) {
            final Message msg = newMessage(message, p0, p1, p2, p3, p4, p5);
            logger.logMessage(FQCN, level, marker, msg, msg.getThrowable());
        }
    }

    @Override
    public void log(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5,
            final Object p6) {
        if (logger.isEnabled(level, marker, message)) {
            final Message msg = newMessage(message, p0, p1, p2, p3, p4, p5, p6);
            logger.logMessage(FQCN, level, marker, msg, msg.getThrowable());
        }
    }

    @Override
    public void log(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7) {
        if (logger.isEnabled(level, marker, message)) {
            final Message msg = newMessage(message, p0, p1, p2, p3, p4, p5, p6, p7);
            logger.logMessage(FQCN, level, marker, msg, msg.getThrowable());
        }
    }

    @Override
    public void log(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8) {
        if (logger.isEnabled(level, marker, message)) {
            final Message msg = newMessage(message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
            logger.logMessage(FQCN, level, marker, msg, msg.getThrowable());
        }
    }

    @Override
    public void log(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8, final Object p9) {
        if (logger.isEnabled(level, marker, message)) {
            final Message msg = newMessage(message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
            logger.logMessage(FQCN, level, marker, msg, msg.getThrowable());
        }
    }

    @Override
    public void log(final Marker marker, final String message, final Object... params) {
        logger.logIfEnabled(FQCN, level, marker, message, params);
    }

    @Override
    public void log(final Marker marker, final String message, final Supplier<?>... paramSuppliers) {
        logger.logIfEnabled(FQCN, level, marker, message, paramSuppliers);
    }

    @Override
    public void log(final Marker marker, final String message, final Throwable t) {
        logger.logIfEnabled(FQCN, level, marker, message, t);
    }

    @Override
    public void log(final Marker marker, final Supplier<?> msgSupplier) {
        logger.logIfEnabled(FQCN, level, marker, msgSupplier, null);
    }

    @Override
    public void log(final Marker marker, final Supplier<?> msgSupplier, final Throwable t) {
        logger.logIfEnabled(FQCN, level, marker, msgSupplier, t);
    }

    @Override
    public void log(final Message msg) {
        logger.logIfEnabled(FQCN, level, null, msg, null);
    }

    @Override
    public void log(final Message msg, final Throwable t) {
        logger.logIfEnabled(FQCN, level, null, msg, t);
    }

    @Override
    public void log(final Object message) {
        logger.logIfEnabled(FQCN, level, null, message, null);
    }

    @Override
    public void log(final Object message, final Throwable t) {
        logger.logIfEnabled(FQCN, level, null, message, t);
    }

    @Override
    public void log(final String message) {
        logger.logIfEnabled(FQCN, level, null, message);
    }

    @Override
    public void log(final String message, final Object p0) {
        if (logger.isEnabled(level, null, message)) {
            final Message msg = newMessage(message, p0);
            logger.logMessage(FQCN, level, null, msg, msg.getThrowable());
        }

    }

    @Override
    public void log(final String message, final Object p0, final Object p1) {
        if (logger.isEnabled(level, null, message)) {
            final Message msg = newMessage(message, p0, p1);
            logger.logMessage(FQCN, level, null, msg, msg.getThrowable());
        }
    }

    @Override
    public void log(final String message, final Object p0, final Object p1, final Object p2) {
        if (logger.isEnabled(level, null, message)) {
            final Message msg = newMessage(message, p0, p1, p2);
            logger.logMessage(FQCN, level, null, msg, msg.getThrowable());
        }
    }

    @Override
    public void log(final String message, final Object p0, final Object p1, final Object p2, final Object p3) {
        if (logger.isEnabled(level, null, message)) {
            final Message msg = newMessage(message, p0, p1, p2, p3);
            logger.logMessage(FQCN, level, null, msg, msg.getThrowable());
        }
    }

    @Override
    public void log(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4) {
        if (logger.isEnabled(level, null, message)) {
            final Message msg = newMessage(message, p0, p1, p2, p3, p4);
            logger.logMessage(FQCN, level, null, msg, msg.getThrowable());
        }
    }

    @Override
    public void log(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5) {
        if (logger.isEnabled(level, null, message)) {
            final Message msg = newMessage(message, p0, p1, p2, p3, p4, p5);
            logger.logMessage(FQCN, level, null, msg, msg.getThrowable());
        }
    }

    @Override
    public void log(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6) {
        if (logger.isEnabled(level, null, message)) {
            final Message msg = newMessage(message, p0, p1, p2, p3, p4, p5, p6);
            logger.logMessage(FQCN, level, null, msg, msg.getThrowable());
        }
    }

    @Override
    public void log(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6,
            final Object p7) {
        if (logger.isEnabled(level, null, message)) {
            final Message msg = newMessage(message, p0, p1, p2, p3, p4, p5, p6, p7);
            logger.logMessage(FQCN, level, null, msg, msg.getThrowable());
        }
    }

    @Override
    public void log(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6,
            final Object p7, final Object p8) {
        if (logger.isEnabled(level, null, message)) {
            final Message msg = newMessage(message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
            logger.logMessage(FQCN, level, null, msg, msg.getThrowable());
        }
    }

    @Override
    public void log(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6,
            final Object p7, final Object p8, final Object p9) {
        if (logger.isEnabled(level, null, message)) {
            final Message msg = newMessage(message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
            logger.logMessage(FQCN, level, null, msg, msg.getThrowable());
        }
    }

    @Override
    public void log(final String message, final Object... params) {
        logger.logIfEnabled(FQCN, level, null, message, params);
    }

    @Override
    public void log(final String message, final Supplier<?>... paramSuppliers) {
        logger.logIfEnabled(FQCN, level, null, message, paramSuppliers);
    }

    @Override
    public void log(final String message, final Throwable t) {
        logger.logIfEnabled(FQCN, level, null, message, t);
    }

    @Override
    public void log(final Supplier<?> msgSupplier) {
        logger.logIfEnabled(FQCN, level, null, msgSupplier, null);
    }

    @Override
    public void log(final Supplier<?> msgSupplier, final Throwable t) {
        logger.logIfEnabled(FQCN, level, null, msgSupplier, t);
    }

    private Message newMessage(final String message, final Object p0) {
        MessageFactory factory = logger.getMessageFactory();
        if (factory instanceof MessageFactory2) {
            return ((MessageFactory2) factory).newMessage(message, p0);
        } else {
            return factory.newMessage(message, p0);
        }
    }

    private Message newMessage(final String message, final Object p0, final Object p1) {
        MessageFactory factory = logger.getMessageFactory();
        if (factory instanceof MessageFactory2) {
            return ((MessageFactory2) factory).newMessage(message, p0, p1);
        } else {
            return factory.newMessage(message, p0, p1);
        }
    }

    private Message newMessage(final String message, final Object p0, final Object p1, final Object p2) {
        MessageFactory factory = logger.getMessageFactory();
        if (factory instanceof MessageFactory2) {
            return ((MessageFactory2) factory).newMessage(message, p0, p1, p2);
        } else {
            return factory.newMessage(message, p0, p1, p2);
        }
    }

    private Message newMessage(final String message, final Object p0, final Object p1, final Object p2, final Object p3) {
        MessageFactory factory = logger.getMessageFactory();
        if (factory instanceof MessageFactory2) {
            return ((MessageFactory2) factory).newMessage(message, p0, p1, p2, p3);
        } else {
            return factory.newMessage(message, p0, p1, p2, p3);
        }
    }

    private Message newMessage(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4) {
        MessageFactory factory = logger.getMessageFactory();
        if (factory instanceof MessageFactory2) {
            return ((MessageFactory2) factory).newMessage(message, p0, p1, p2, p3, p4);
        } else {
            return factory.newMessage(message, p0, p1, p2, p3, p4);
        }
    }

    private Message newMessage(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5) {
        MessageFactory factory = logger.getMessageFactory();
        if (factory instanceof MessageFactory2) {
            return ((MessageFactory2) factory).newMessage(message, p0, p1, p2, p3, p4, p5);
        } else {
            return factory.newMessage(message, p0, p1, p2, p3, p4, p5);
        }
    }

    private Message newMessage(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6) {
        MessageFactory factory = logger.getMessageFactory();
        if (factory instanceof MessageFactory2) {
            return ((MessageFactory2) factory).newMessage(message, p0, p1, p2, p3, p4, p5, p6);
        } else {
            return factory.newMessage(message, p0, p1, p2, p3, p4, p5, p6);
        }
    }

    private Message newMessage(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6, final Object p7) {
        MessageFactory factory = logger.getMessageFactory();
        if (factory instanceof MessageFactory2) {
            return ((MessageFactory2) factory).newMessage(message, p0, p1, p2, p3, p4, p5, p6, p7);
        } else {
            return factory.newMessage(message, p0, p1, p2, p3, p4, p5, p6, p7);
        }
    }

    private Message newMessage(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6, final Object p7, final Object p8) {
        MessageFactory factory = logger.getMessageFactory();
        if (factory instanceof MessageFactory2) {
            return ((MessageFactory2) factory).newMessage(message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
        } else {
            return factory.newMessage(message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
        }
    }

    private Message newMessage(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6, final Object p7, final Object p8, final Object p9) {
        MessageFactory factory = logger.getMessageFactory();
        if (factory instanceof MessageFactory2) {
            return ((MessageFactory2) factory).newMessage(message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
        } else {
            return factory.newMessage(message, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
        }
    }

    @Override
    public void printf(final Marker marker, final String format, final Object... params) {
        logger.printf(level, marker, format, params);
    }

    @Override
    public void printf(final String format, final Object... params) {
        logger.printf(level, format, params);
    }
}
