package com.maic.timeline.timeline.model;

import com.orm.SugarRecord;

import java.util.Date;

/**
 * Created by MarlinL on 8/28/16.
 */
public class Plan extends SugarRecord {

    public String planName;
    public Date alret;

    public Plan() {
    }

    public Plan(String planName, Date alret) {
        this.planName = planName;
        this.alret = alret;
    }
}
