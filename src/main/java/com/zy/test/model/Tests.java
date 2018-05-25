package com.zy.test.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Tests {

    private Integer id;


    private Integer epId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return ep_id
     */
    public Integer getEpId() {
        return epId;
    }

    /**
     * @param epId
     */
    public void setEpId(Integer epId) {
        this.epId = epId;
    }
}