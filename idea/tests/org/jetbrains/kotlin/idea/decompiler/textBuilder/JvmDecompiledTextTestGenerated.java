/*
 * Copyright 2010-2016 JetBrains s.r.o.
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

package org.jetbrains.kotlin.idea.decompiler.textBuilder;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/decompiler/decompiledTextJvm")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class JvmDecompiledTextTestGenerated extends AbstractJvmDecompiledTextTest {
    public void testAllFilesPresentInDecompiledTextJvm() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/decompiler/decompiledTextJvm"), Pattern.compile("^([^\\.]+)$"), true);
    }

    @TestMetadata("Modifiers")
    public void testModifiers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledTextJvm/Modifiers/");
        doTest(fileName);
    }

    @TestMetadata("MultifileClass")
    public void testMultifileClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledTextJvm/MultifileClass/");
        doTest(fileName);
    }

    @TestMetadata("TestKt")
    public void testTestKt() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledTextJvm/TestKt/");
        doTest(fileName);
    }

}
