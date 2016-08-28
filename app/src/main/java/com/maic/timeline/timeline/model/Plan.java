package com.maic.timeline.timeline.model;

import com.orm.dsl.Table;
import com.orm.dsl.Unique;

import java.util.Date;

/**
 * Created by MarlinL on 8/28/16.
 */
@Table
public class Plan {

    @Unique
    private Integer id;
    private String planName;
    private Date alretDate;

    public Integer getId() {
        return id;
    }

    public String getPlanName() {
        return planName;
    }

    public Date getAlretDate() {
        return alretDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public void setAlretDate(Date alretDate) {
        this.alretDate = alretDate;
    }
}
