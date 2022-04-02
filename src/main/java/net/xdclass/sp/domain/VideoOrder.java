package net.xdclass.sp.domain;

public class VideoOrder {
    private int id;
    //订单号
    private String outTradeNo;
    private Video video;

    public VideoOrder() {
        System.out.println("VideoOrder 空构造函数被调用");
    }

    public VideoOrder(Video video) {
        this.video = video;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public void init(){
        System.out.println("videoOrder init方法被调用");
    }

    public void destroy(){
        System.out.println("videoOrder destroy方法被调用");
    }

    @Override
    public String toString() {
        return "VideoOrder{" +
                "id=" + id +
                ", outTradeNo='" + outTradeNo + '\'' +
                ", video=" + video +
                '}';
    }
}
