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

package test.actual;

import test.Platform;
import test.ValidationAnnotation;

/**
 * Created by shrey.garg on 24/04/17.
 */
public class Two {
    @ValidationAnnotation(name = Platform.ANDROID, since = 2, till = 9)
    private String l1;
    private Integer l2;

    public String getL1() {
        return l1;
    }

    public void setL1(String l1) {
        this.l1 = l1;
    }

    public Integer getL2() {
        return l2;
    }

    public void setL2(Integer l2) {
        this.l2 = l2;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Two{");
        sb.append("l1='").append(l1).append('\'');
        sb.append(", l2=").append(l2);
        sb.append('}');
        return sb.toString();
    }
}
