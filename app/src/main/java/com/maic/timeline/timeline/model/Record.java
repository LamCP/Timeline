package com.maic.timeline.timeline.model;

import com.orm.dsl.Table;
import com.orm.dsl.Unique;

import java.util.Date;

/**
 * Created by MarlinL on 8/28/16.
 */
@Table
public class Record {

    @Unique
    private Integer id;
    private Integer planId;
    private Integer status;
    private Date updateAt;
    private Date createAt;

    public Integer getId() {
        return id;
    }

    public Integer getPlanId() {
        return planId;
    }

    public Integer getStatus() {
        return status;
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

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
