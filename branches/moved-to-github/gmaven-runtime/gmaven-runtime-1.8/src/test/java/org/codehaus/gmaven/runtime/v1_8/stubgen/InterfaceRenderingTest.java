/*
 * Copyright (C) 2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
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

package org.codehaus.gmaven.runtime.v1_8.stubgen;

import org.codehaus.gmaven.runtime.v1_8.RendererTestSupport;

/**
 * Tests for rendering interfaces.
 *
 * @version $Id: InterfaceRenderingTest.java 50 2009-10-16 14:06:18Z user57 $
 * @author <a href="mailto:jason@planet57.com">Jason Dillon</a>
 */
public class InterfaceRenderingTest
    extends RendererTestSupport
{
    public void testRender() throws Exception {
        chew("interfaces.groovy.txt");
    }
}