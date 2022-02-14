package net.xdclass.sp.domain;

import java.util.List;
import java.util.Map;

public class Video2{

    private long id;
    private String title;
    private String summary;
    private Map<Integer, String> videoMap;
    private List<String> chapterList;

    public Video2() {
        System.out.println("Video21 空构造函数被调用");
    }

    public void init(){
        System.out.println("video2类 init 方法调用");
    }

    public Map<Integer, String> getVideoMap() {
        return videoMap;
    }

    public void setVideoMap(Map<Integer, String> videoMap) {
        this.videoMap = videoMap;
    }

    public List<String> getChapterList() {
        return chapterList;
    }

    public void setChapterList(List<String> chapterList) {
        this.chapterList = chapterList;
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
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
