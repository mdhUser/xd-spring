package net.xdclass.sp.domain;

import java.util.List;
import java.util.Map;

/**
 * @description: test
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/14 16:39
 */
public class Test {

    private long id;
    private String title;
    private String summary;
    private Map<Integer, String> videoMap;
    private List<String> chapterList;

    public Test() {
        System.out.println("sdhajak");
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
}
