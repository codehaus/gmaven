/*
 * Copyright (C) 2006-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codehaus.groovy.maven.gossip.model.source;

import java.net.URL;

import org.codehaus.groovy.maven.gossip.config.ConfigurationException;
import org.codehaus.groovy.maven.gossip.model.Configuration;
import org.codehaus.groovy.maven.gossip.model.Source;

/**
 * ???
 *
 * @version $Id$
 * @author <a href="mailto:jason@planet57.com">Jason Dillon</a>
 */
public class ResourceSource
    extends Source
{
    private String name;

    private ClassLoader classLoader;

    public ResourceSource() {}

    public ResourceSource(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public ClassLoader getClassLoader() {
        return classLoader;
    }

    public void setClassLoader(final ClassLoader cl) {
        this.classLoader = cl;
    }

    public Configuration load() throws Exception {
        if (name == null) {
            throw new ConfigurationException("Missing property: name");
        }

        Configuration config = null;

        ClassLoader cl = getClassLoader();

        if (cl == null) {
            cl = Thread.currentThread().getContextClassLoader();
        }
        
        URL url = cl.getResource(name);

        if (url == null) {
            log.debug("Unable to load; missing resource: {}", name);
        }
        else {
            config = load(url);
        }

        return config;
    }
}