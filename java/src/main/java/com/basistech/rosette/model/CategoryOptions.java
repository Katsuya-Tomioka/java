/******************************************************************************
 ** This data and information is proprietary to, and a valuable trade secret
 ** of, Basis Technology Corp.  It is given in confidence by Basis Technology
 ** and may only be used as permitted under the license agreement under which
 ** it has been distributed, and in no other way.
 **
 ** Copyright (c) 2015 Basis Technology Corporation All rights reserved.
 **
 ** The technical data and information provided herein are provided with
 ** `limited rights', and the computer software provided herein is provided
 ** with `restricted rights' as those terms are defined in DAR and ASPR
 ** 7-104.9(a).
 ******************************************************************************/

package com.basistech.rosette.model;

public final class CategoryOptions {
    private String model;
    private Boolean explain = false;
    private int numCategories = 1;

    public CategoryOptions() { }

    public CategoryOptions(
            String model,
            Boolean explain,
            int numCategories
    ) {
        this.model = model;
        this.explain = explain;
        this.numCategories = numCategories;
    }

    public CategoryOptions(
            String model,
            Boolean explain
    ) {
        this.model = model;
        this.explain = explain;
    }

    public CategoryOptions(
            String model
    ) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public Boolean getExplain() {
        return explain;
    }

    public Integer getNumCategories() {
        return numCategories;
    }
}
