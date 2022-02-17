package net.xdclass.sp.service.impl;

import net.xdclass.sp.domain.Video;
import net.xdclass.sp.service.VideoService;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/17 16:16
 */
public class VideoServiceImpl implements VideoService {

    @Override
    public int save(Video video) {
        System.out.println("保存video视频");
        return 1;
    }

    @Override
    public Video findById(int id) {
        System.out.println("根据"+id+"找视频" + id);
        return new Video();
    }
}
