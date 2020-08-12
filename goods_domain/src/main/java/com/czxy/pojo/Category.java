package com.czxy.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author haoannan 169650@qq.com
 * @date 2020/08/07
 * @infos
 */
@Table(name = "tbl_category")
public class Category {
    @Id
    private String cid;
    private String cname;

    @Override
    public String toString() {
        return "Category{" +
                "cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }

    public Category(String cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Category() {
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
