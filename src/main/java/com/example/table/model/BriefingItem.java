package com.example.table.model;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * @ClassName BriefingItem
 * @Description
 * @Author jianquan.liang
 * @Date 9/3/2019 10:54 AM
 * @Version 1.0
 **/
@Entity
@Table(name = "BRIEFING_ITEM")
public class BriefingItem {
    @Id
    @GeneratedValue
    private int id;

    private String title;
    private String content;
    private int sourceType;
    private String source;
    private int category;
    private int state;
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;
    private int isEdited;
    private int needAck;
    private int targetScope;
    private ZonedDateTime publishTime;
    private ZonedDateTime createTime;
    private ZonedDateTime updateTime;
    private ZonedDateTime deletedTime;


    @OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "briefingItemId")
    private List<Attachment> attachmentList;

    public BriefingItem() {
        ZonedDateTime date = ZonedDateTime.now();
//        SimpleDateFormat format0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.createTime = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSourceType() {
        return sourceType;
    }

    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public ZonedDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(ZonedDateTime startTime) {
        this.startTime = startTime;
    }

    public ZonedDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(ZonedDateTime endTime) {
        this.endTime = endTime;
    }

    public int getIsEdited() {
        return isEdited;
    }

    public void setIsEdited(int isEdited) {
        this.isEdited = isEdited;
    }

    public int getNeedAck() {
        return needAck;
    }

    public void setNeedAck(int needAck) {
        this.needAck = needAck;
    }

    public int getTargetScope() {
        return targetScope;
    }

    public void setTargetScope(int targetScope) {
        this.targetScope = targetScope;
    }

    public ZonedDateTime getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(ZonedDateTime publishTime) {
        this.publishTime = publishTime;
    }

    public ZonedDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(ZonedDateTime createTime) {
        this.createTime = createTime;
    }

    public ZonedDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(ZonedDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public ZonedDateTime getDeletedTime() {
        return deletedTime;
    }

    public void setDeletedTime(ZonedDateTime deletedTime) {
        this.deletedTime = deletedTime;
    }

    public List<Attachment> getAttachmentList() {
        return attachmentList;
    }

    public void setAttachmentList(List<Attachment> attachmentList) {
        this.attachmentList = attachmentList;
    }

    @Override
    public String toString() {
        return "BriefingItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", sourceType=" + sourceType +
                ", source='" + source + '\'' +
                ", category=" + category +
                ", state=" + state +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", isEdited=" + isEdited +
                ", needAck=" + needAck +
                ", targetScope=" + targetScope +
                ", publishTime=" + publishTime +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", deletedTime=" + deletedTime +
                ", attachmentList=" + attachmentList +
                '}';
    }
}
