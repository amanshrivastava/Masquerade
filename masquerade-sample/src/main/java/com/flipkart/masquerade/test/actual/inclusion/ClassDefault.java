package com.flipkart.masquerade.test.actual.inclusion;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.flipkart.masquerade.test.Platform;
import com.flipkart.masquerade.test.ValidationAnnotation;

/**
 * Created by shrey.garg on 11/07/17.
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ClassDefault {
    private boolean def;
    @ValidationAnnotation(name = Platform.ANDROID, since = 12)
    private String abc;

    public boolean isDef() {
        return def;
    }

    public void setDef(boolean def) {
        this.def = def;
    }

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }
}
