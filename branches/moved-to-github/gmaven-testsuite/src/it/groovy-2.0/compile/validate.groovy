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

//
// $Id: validate.groovy 81 2009-12-10 09:07:22Z user57 $
//

assert new File(basedir, 'target/generated-sources/groovy-stubs/main/VersionHelper.java').exists()

assert new File(basedir, 'target/classes/VersionHelper.class').exists()
assert new File(basedir, 'target/classes/Testoid.class').exists()

assert new File(basedir, "target/surefire-reports/SimpleTest.txt").exists()
assert new File(basedir, "target/surefire-reports/GroovyTest.txt").exists()

assert new File(basedir, 'target/site/apidocs/VersionHelper.html').exists()
assert new File(basedir, 'target/site/apidocs/Testoid.html').exists()
