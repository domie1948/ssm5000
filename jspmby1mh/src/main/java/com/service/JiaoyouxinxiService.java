package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoyouxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoyouxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoyouxinxiView;


/**
 * 交友信息
 *
 * @author 
 * @email 
 * @date 2021-03-03 14:14:54
 */
public interface JiaoyouxinxiService extends IService<JiaoyouxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoyouxinxiVO> selectListVO(Wrapper<JiaoyouxinxiEntity> wrapper);
   	
   	JiaoyouxinxiVO selectVO(@Param("ew") Wrapper<JiaoyouxinxiEntity> wrapper);
   	
   	List<JiaoyouxinxiView> selectListView(Wrapper<JiaoyouxinxiEntity> wrapper);
   	
   	JiaoyouxinxiView selectView(@Param("ew") Wrapper<JiaoyouxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoyouxinxiEntity> wrapper);
   	
}

