package com.maic.timeline.timeline.model;

import com.orm.dsl.Table;

import java.util.Date;

/**
 * Created by MarlinL on 8/28/16.
 */
@Table
public class Record {

    private Long id;
    private Integer planId;
    private Integer status;
    private Date updateAt;
    private Date createAt;

    public Long getId() {
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

    public void setId(Long id) {
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

    public Record(Long id, Integer planId, Integer status, Date updateAt, Date createAt) {
        this.id = id;
        this.planId = planId;
        this.status = status;
        this.updateAt = updateAt;
        this.createAt = createAt;
    }
}
