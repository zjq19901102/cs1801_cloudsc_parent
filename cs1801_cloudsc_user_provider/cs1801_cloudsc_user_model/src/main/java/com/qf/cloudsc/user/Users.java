package com.qf.cloudsc.user;

public class Users {

    private Long uid;
    private String uname;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Users() {
    }

    public Users(Long uid, String uname) {
        this.uid = uid;
        this.uname = uname;

    }

    @Override
    public String toString() {
        return "Users{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                '}';
    }
}
