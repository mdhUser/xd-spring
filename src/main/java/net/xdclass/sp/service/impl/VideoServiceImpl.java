package net.xdclass.sp.service.impl;

import net.xdclass.sp.config.CustomConfig;
import net.xdclass.sp.domain.Video;
import net.xdclass.sp.mapper.VideoMapper;
import net.xdclass.sp.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/17 16:16
 */
@Service("videoService")
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoDao;
    @Autowired
    private CustomConfig config;

    @Override
    public int save(Video video) {
        System.out.println("保存video视频");
        return 1;
    }

    @Override
    public Video findById(int id) {
        System.out.println("根据id=" + id + "找视频" + id);
//        System.out.println(config.getPort());
//        System.out.println(config.getHost());
        return new Video();
    }

    @Override
    public String fuck() {
        System.out.println("切入方法");
        return "shit";
    }

}
