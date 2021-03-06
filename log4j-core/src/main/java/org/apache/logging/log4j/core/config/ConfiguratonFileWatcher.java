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
package org.apache.logging.log4j.core.config;

import java.io.File;
import java.util.List;

import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.util.FileWatcher;

/**
 * Watcher for configuration files. Causes a reconfiguration when a file changes.
 */
public class ConfiguratonFileWatcher implements FileWatcher {

    private final Reconfigurable reconfigurable;
    private final List<ConfigurationListener> listeners;

    public ConfiguratonFileWatcher(final Reconfigurable reconfigurable, final List<ConfigurationListener> listeners) {
        this.reconfigurable = reconfigurable;
        this.listeners = listeners;
    }

    public List<ConfigurationListener> getListeners() {
        return listeners;
    }


    @Override
    public void fileModified(final File file) {
        for (final ConfigurationListener listener : listeners) {
            LoggerContext.getContext(false).submitDaemon(new ReconfigurationWorker(listener, reconfigurable));
        }
    }

    /**
     * Helper class for triggering a reconfiguration in a background thread.
     */
    private static class ReconfigurationWorker implements Runnable {

        private final ConfigurationListener listener;
        private final Reconfigurable reconfigurable;

        public ReconfigurationWorker(final ConfigurationListener listener, final Reconfigurable reconfigurable) {
            this.listener = listener;
            this.reconfigurable = reconfigurable;
        }

        @Override
        public void run() {
            listener.onChange(reconfigurable);
        }
    }
}
