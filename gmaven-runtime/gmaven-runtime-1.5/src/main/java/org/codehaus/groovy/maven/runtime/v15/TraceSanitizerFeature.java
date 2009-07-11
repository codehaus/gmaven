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

package org.codehaus.groovy.maven.runtime.v15;

import org.codehaus.groovy.maven.feature.Component;
import org.codehaus.groovy.maven.feature.support.FeatureSupport;
import org.codehaus.groovy.maven.runtime.TraceSanitizer;
import org.codehaus.groovy.maven.runtime.support.TraceSanitizerSupport;

/**
 * Provides the stack trace sanitization feature.
 *
 * @plexus.component role="org.codehaus.groovy.maven.feature.Feature#1.5"
 *                   role-hint="org.codehaus.groovy.maven.runtime.TraceSanitizer"
 *
 * @version $Id$
 * @author <a href="mailto:jason@planet57.com">Jason Dillon</a>
 */
public class TraceSanitizerFeature
    extends FeatureSupport
{
    public TraceSanitizerFeature() {
        super(TraceSanitizer.KEY);
    }

    protected Component doCreate() throws Exception {
        return new TraceSanitizerSupport(this);
    }
}