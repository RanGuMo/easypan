package com.easypan.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author MoRanGu
 * @since 2023-08-18
 */
@TableName("user_info")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * QQ的OpenID
     */
    private String qqOpenId;

    /**
     * QQ的头像
     */
    private String qqAvatar;

    /**
     * 密码（MD5加密(32位)）
     */
    private String password;

    /**
     * 加入时间
     */
    private LocalDateTime joinTime;

    /**
     * 最后一次登录时间
     */
    private LocalDateTime lastLoginTime;

    /**
     * 0:禁用  1:启用
     */
    private Boolean status;

    /**
     * 使用空间单位 byte
     */
    private Long useSpace;

    /**
     * 总空间
     */
    private Long totalSpace;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getQqOpenId() {
        return qqOpenId;
    }

    public void setQqOpenId(String qqOpenId) {
        this.qqOpenId = qqOpenId;
    }
    public String getQqAvatar() {
        return qqAvatar;
    }

    public void setQqAvatar(String qqAvatar) {
        this.qqAvatar = qqAvatar;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public LocalDateTime getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(LocalDateTime joinTime) {
        this.joinTime = joinTime;
    }
    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    public Long getUseSpace() {
        return useSpace;
    }

    public void setUseSpace(Long useSpace) {
        this.useSpace = useSpace;
    }
    public Long getTotalSpace() {
        return totalSpace;
    }

    public void setTotalSpace(Long totalSpace) {
        this.totalSpace = totalSpace;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
            "userId=" + userId +
            ", nickName=" + nickName +
            ", email=" + email +
            ", qqOpenId=" + qqOpenId +
            ", qqAvatar=" + qqAvatar +
            ", password=" + password +
            ", joinTime=" + joinTime +
            ", lastLoginTime=" + lastLoginTime +
            ", status=" + status +
            ", useSpace=" + useSpace +
            ", totalSpace=" + totalSpace +
        "}";
    }
}
