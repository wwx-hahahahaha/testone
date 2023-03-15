package com.rose.domain;

public class zs_admin {
    private String id;
    private String name;


    public zs_admin() {
    }

    public zs_admin(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "zs_admin{id = " + id + ", name = " + name + "}";
    }
}
