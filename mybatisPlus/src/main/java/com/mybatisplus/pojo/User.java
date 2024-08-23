package com.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;

public class User {
    //对应数据库中的主键(uuid、自增id、雪花算法、redis、 zookeeper ! )
    @TableId(type = IdType.NONE)
    private Integer id;
    private String name;
    private Integer password;
    //时间类型LocalDateTime要与MyDateObjectHandler类中对应
    //自动填写插入操作FieldFill.INSERT
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    //自动填写更新操作时间
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @Version   //乐观锁的注解
    private Integer version;

    @TableLogic  //逻辑删除注解
    private Integer deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public User() {
    }

    public User(Integer id, String name, Integer password, LocalDateTime createTime, LocalDateTime updateTime,Integer version,Integer deleted) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.version = version;
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password=" + password +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", version=" + version +
                ", deleted=" + deleted +
                '}';
    }
}
