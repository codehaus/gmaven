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

package org.codehaus.groovy.maven.runtime.v1_6.stubgen;

import org.codehaus.groovy.maven.runtime.support.stubgen.model.ClassDef;
import org.codehaus.groovy.maven.runtime.support.stubgen.render.Renderer;
import org.codehaus.groovy.maven.runtime.support.stubgen.render.RendererFactorySupport;
import org.codehaus.groovy.maven.runtime.support.stubgen.render.RendererSupport;

/**
 * Provides source defintion renderers for Groovy 1.6.
 *
 * @version $Id$
 * @author <a href="mailto:jason@planet57.com">Jason Dillon</a>
 */
public class RendererFactoryImpl
    extends RendererFactorySupport
{
    protected Renderer createRenderer(final ClassDef def) {
        assert def != null;

        return new RendererImpl(def);
    }

    //
    // RendererImpl
    //

    private class RendererImpl
        extends RendererSupport
    {
        public RendererImpl(final ClassDef def) {
            super(def);
        }
    }
}