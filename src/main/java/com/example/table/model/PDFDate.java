package com.example.table.model;

/**
 * @ClassName PDFDate
 * @Description
 * @Author jianquan.liang
 * @Date 9/6/2019 2:45 PM
 * @Version 1.0
 **/
public class PDFDate {
    private String title;
    private String sourceInfo;
    private String period;

    public PDFDate(String title, String sourceInfo, String period) {
        this.title = title;
        this.sourceInfo = sourceInfo;
        this.period = period;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSourceInfo() {
        return sourceInfo;
    }

    public void setSourceInfo(String sourceInfo) {
        this.sourceInfo = sourceInfo;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
