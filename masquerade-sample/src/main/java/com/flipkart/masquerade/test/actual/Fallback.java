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

package com.flipkart.masquerade.test.actual;

import com.flipkart.masquerade.test.NotIncluded;

import java.util.List;

/**
 * Created by shrey.garg on 18/07/17.
 */
public class Fallback {
    private NotIncluded notIncluded;
    private List<Object> objects;
    private String string;

    public NotIncluded getNotIncluded() {
        return notIncluded;
    }

    public void setNotIncluded(NotIncluded notIncluded) {
        this.notIncluded = notIncluded;
    }

    public List<Object> getObjects() {
        return objects;
    }

    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
