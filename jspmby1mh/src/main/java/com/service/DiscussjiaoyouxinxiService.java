package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiaoyouxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiaoyouxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiaoyouxinxiView;


/**
 * 交友信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-03 14:14:54
 */
public interface DiscussjiaoyouxinxiService extends IService<DiscussjiaoyouxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiaoyouxinxiVO> selectListVO(Wrapper<DiscussjiaoyouxinxiEntity> wrapper);
   	
   	DiscussjiaoyouxinxiVO selectVO(@Param("ew") Wrapper<DiscussjiaoyouxinxiEntity> wrapper);
   	
   	List<DiscussjiaoyouxinxiView> selectListView(Wrapper<DiscussjiaoyouxinxiEntity> wrapper);
   	
   	DiscussjiaoyouxinxiView selectView(@Param("ew") Wrapper<DiscussjiaoyouxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiaoyouxinxiEntity> wrapper);
   	
}

