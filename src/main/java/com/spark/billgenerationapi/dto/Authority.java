package com.spark.billgenerationapi.dto;

public enum Authority {

    GET_EARN("get:earn"),
    WRITE_EARN("write:earn"),
    READ_ORDER("read:order"),
    WRITE_ORDER("write:order"),
    WRITE_USER("write:user");

    private String permission;

    Authority(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
