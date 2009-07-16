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

package org.codehaus.gmaven.runtime.support.stubgen.model;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Representation of an enum definition.
 *
 * @version $Id$
 * @author <a href="mailto:jason@planet57.com">Jason Dillon</a>
 */
public class EnumDef
    extends ClassDef
{
    private final Set/*<EnumConstantDef*/ constants = new LinkedHashSet();

    public EnumDef() {
        super(Type.ENUM);
    }

    public void addConstant(final EnumConstantDef constant) {
        assert constant != null;

        constants.add(constant);
    }

    public void addConstant(final String constant) {
        assert constant != null;

        addConstant(new EnumConstantDef(constant));
    }

    public Set getConstants() {
        return constants;
    }
}