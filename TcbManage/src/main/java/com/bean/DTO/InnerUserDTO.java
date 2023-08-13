package com.bean.DTO;

/**
 *  Tcb 网站管理员用户
 */
public class InnerUserDTO {
    // 内部用户名称
    private String innerUserName;
    // 内部用户Id
    private String innerUserId;

    public void setInnerUserId(String innerUserId) {
        this.innerUserId = innerUserId;
    }

    public void setInnerUserName(String innerUserName) {
        this.innerUserName = innerUserName;
    }

    public String getInnerUserId() {
        return innerUserId;
    }

    public String getInnerUserName() {
        return innerUserName;
    }
}
