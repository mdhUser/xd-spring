package net.xdclass.sp.domain;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Scope("prototype")
public class Video {

    private long id;
    private String title;
    private String summary;
    private String coverImg;
    private long price;
    private java.sql.Timestamp createTime;
    private long cId;
    private double point;
    private Map<Integer, String> videoMap;
    private List<String> chapterList;

    public List<String> getChapterList() {
        return chapterList;
    }

    public void setChapterList(List<String> chapterList) {
        this.chapterList = chapterList;
    }

    public Video() {
        System.out.println("video 空参构造方法被调用");
    }

    public void init(){
        System.out.println("video类 init 方法调用");
    }

    public void destroy(){
        System.out.println("video destroy 方法调用");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        System.out.println("调用setTitle方法");
        this.title = title;
    }


    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }


    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }


    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }


    public java.sql.Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(java.sql.Timestamp createTime) {
        this.createTime = createTime;
    }


    public long getCId() {
        return cId;
    }

    public void setCId(long cId) {
        this.cId = cId;
    }


    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public Map<Integer, String> getVideoMap() {
        return videoMap;
    }

    public void setVideoMap(Map<Integer, String> videoMap) {
        this.videoMap = videoMap;
    }

}
