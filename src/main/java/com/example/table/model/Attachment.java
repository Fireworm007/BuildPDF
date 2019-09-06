package com.example.table.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName Attachment
 * @Description
 * @Author jianquan.liang
 * @Date 9/3/2019 2:14 PM
 * @Version 1.0
 **/
@Entity
@Table(name="BRIEFING_ITEM_ATTACHMENTS")
@ApiModel(value = "附件")
public class Attachment {
    @Id
    @GeneratedValue
    private int id;

    @ApiModelProperty(value = "briefing的ID")
    private int briefingItemId;
    private String fileName;
    private String s3Key;
    private int fileType;
    private String fileUrl;
    private Date uploadTime;

    public Attachment() {
    }

    public Attachment(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBriefingItemId() {
        return briefingItemId;
    }

    public void setBriefingItemId(int briefingItemId) {
        this.briefingItemId = briefingItemId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getS3Key() {
        return s3Key;
    }

    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    public int getFileType() {
        return fileType;
    }

    public void setFileType(int fileType) {
        this.fileType = fileType;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }


    @Override
    public String toString() {
        return "Attachment{" +
                "id=" + id +
                ", briefingItemId=" + briefingItemId +
                ", fileName='" + fileName + '\'' +
                ", s3Key='" + s3Key + '\'' +
                ", fileType=" + fileType +
                ", fileUrl='" + fileUrl + '\'' +
                ", uploadTime=" + uploadTime +
                '}';
    }
}
