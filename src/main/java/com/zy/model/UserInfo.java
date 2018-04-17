package com.zy.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_info")
public class UserInfo {
    @Id
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_age")
    private Integer userAge;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "start_date")
    private Date startDate;

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return user_age
     */
    public Integer getUserAge() {
        return userAge;
    }

    /**
     * @param userAge
     */
    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return start_date
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}