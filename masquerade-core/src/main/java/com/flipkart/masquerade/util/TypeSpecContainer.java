/*
 * Copyright 2017 Flipkart Internet, pvt ltd.
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

package com.flipkart.masquerade.util;

import com.squareup.javapoet.TypeSpec;

/**
 * Created by shrey.garg on 12/05/17.
 */
public class TypeSpecContainer {
    private final String packagePath;
    private final TypeSpec spec;

    public TypeSpecContainer(String packagePath, TypeSpec spec) {
        this.packagePath = packagePath;
        this.spec = spec;
    }

    public String getPackagePath() {
        return packagePath;
    }

    public TypeSpec getSpec() {
        return spec;
    }
}
