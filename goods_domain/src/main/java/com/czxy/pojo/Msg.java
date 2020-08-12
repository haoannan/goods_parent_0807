package com.czxy.pojo;

import java.io.Serializable;

/**
 * @author haoannan 169650@qq.com
 * @date 2020/8/7.
 * @infos
 */
public class Msg implements Serializable {
    private String msg;

    @Override
    public String toString() {
        return "Msg{" +
                "msg='" + msg + '\'' +
                '}';
    }

    public Msg(String msg) {
        this.msg = msg;
    }

    public Msg() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
