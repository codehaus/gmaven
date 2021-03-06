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

package org.codehaus.groovy.maven.runtime;

import org.codehaus.groovy.maven.feature.Component;

/**
 * An abstraction of the Groovy CLI shell.
 *
 * @version $Id$
 * @author <a href="mailto:jason@planet57.com">Jason Dillon</a>
 */
public interface Shell
    extends Component
{
    String KEY = Shell.class.getName();

    void execute() throws Exception;

    //
    // TODO: See if we can find a better name for this puppy
    //
    
    interface Keys
    {
        String LEGACY = "legacy";

        String VERBOSE = "verbose";

        String DEBUG = "debug";

        String QUIET = "quiet";

        String COLOR = "color";

        String TERMINAL = "terminal";

        String ARGS = "args";

        String[] ALL = {
            LEGACY,
            VERBOSE,
            DEBUG,
            QUIET,
            COLOR,
            TERMINAL,
            ARGS
        };
    }
}