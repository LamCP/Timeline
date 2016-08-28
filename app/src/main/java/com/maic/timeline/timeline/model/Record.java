package com.maic.timeline.timeline.model;

import java.util.Date;

/**
 * Created by MarlinL on 8/28/16.
 */
public class Record {

    private Integer id;
    private Integer planId;
    private Date updateAt;
    private Date createAt;

    public Integer getId() {
        return id;
    }

    public Integer getPlanId() {
        return planId;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
