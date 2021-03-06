/*
 * Copyright 2000-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.plugins.groovy.lang.parser

/**
 * @author peter
 */
class GroovydocParsingTest extends GroovyParsingTestCase {
  @Override
  String getBasePath() {
    return super.basePath + "groovydoc"
  }

  void testInlined$inlined1() throws Throwable { doTest() }

  void testInlined$inlined10() throws Throwable { doTest() }

  void testInlined$inlined2() throws Throwable { doTest() }

  void testInlined$inlined3() throws Throwable { doTest() }

  void testInlined$inlined4() throws Throwable { doTest() }

  void testInlined$inlined5() throws Throwable { doTest() }

  void testInlined$inlined6() throws Throwable { doTest() }

  void testInlined$inlined7() throws Throwable { doTest() }

  void testInlined$inlined8() throws Throwable { doTest() }

  void testInlined$inlined9() throws Throwable { doTest() }

  void testParam$param1() throws Throwable { doTest() }

  void testParam$param2() throws Throwable { doTest() }

  void testParam$param3() throws Throwable { doTest() }

  void testParam$param4() throws Throwable { doTest() }

  void testParam$param5() throws Throwable { doTest() }

  void testReferences$link1() throws Throwable { doTest() }

  void testReferences$link2() throws Throwable { doTest() }

  void testReferences$linkplain1() throws Throwable { doTest() }

  void testReferences$see1() throws Throwable { doTest() }

  void testReferences$see2() throws Throwable { doTest() }

  void testReferences$see3() throws Throwable { doTest() }

  void testReferences$see4() throws Throwable { doTest() }

  void testReferences$see5() throws Throwable { doTest() }

  void testReferences$see6() throws Throwable { doTest() }

  void testReferences$throws1() throws Throwable { doTest() }

  void testReferences$throws2() throws Throwable { doTest() }

  void testReferences$val1() throws Throwable { doTest() }

  void testReferences$val2() throws Throwable { doTest() }

  void testSimple$doc1() throws Throwable { doTest() }

  void testSimple$end1() throws Throwable { doTest() }

  void testSimple$endless1() throws Throwable { doTest() }

  void testSimple$tag2() throws Throwable { doTest() }

  void testValue$data1() throws Throwable { doTest() }

  void testValue$val3() throws Throwable { doTest() }
}