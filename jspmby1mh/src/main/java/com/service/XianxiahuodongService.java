package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XianxiahuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XianxiahuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XianxiahuodongView;


/**
 * 线下活动
 *
 * @author 
 * @email 
 * @date 2021-03-03 14:14:54
 */
public interface XianxiahuodongService extends IService<XianxiahuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XianxiahuodongVO> selectListVO(Wrapper<XianxiahuodongEntity> wrapper);
   	
   	XianxiahuodongVO selectVO(@Param("ew") Wrapper<XianxiahuodongEntity> wrapper);
   	
   	List<XianxiahuodongView> selectListView(Wrapper<XianxiahuodongEntity> wrapper);
   	
   	XianxiahuodongView selectView(@Param("ew") Wrapper<XianxiahuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XianxiahuodongEntity> wrapper);
   	
}

