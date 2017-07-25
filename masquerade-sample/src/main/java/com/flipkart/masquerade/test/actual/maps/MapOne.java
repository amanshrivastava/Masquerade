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

package com.flipkart.masquerade.test.actual.maps;

import java.util.Map;

/**
 * Created by shrey.garg on 09/07/17.
 */
public class MapOne {
    private String abc;
    private boolean someBoolean;
    private Map<String, MapTwo> mapTwoMap;

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }

    public boolean isSomeBoolean() {
        return someBoolean;
    }

    public void setSomeBoolean(boolean someBoolean) {
        this.someBoolean = someBoolean;
    }

    public Map<String, MapTwo> getMapTwoMap() {
        return mapTwoMap;
    }

    public void setMapTwoMap(Map<String, MapTwo> mapTwoMap) {
        this.mapTwoMap = mapTwoMap;
    }
}
