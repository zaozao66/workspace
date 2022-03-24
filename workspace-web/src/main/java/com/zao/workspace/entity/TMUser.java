package com.zao.workspace.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class TMUser implements Serializable {
    private Long id;

    private String loginName;

    private String nickName;

    private String userPwd;

    private String createBy;

    private String updateBy;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", loginName=").append(loginName);
        sb.append(", nickName=").append(nickName);
        sb.append(", userPwd=").append(userPwd);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}