package com.dao;

import com.entity.XianxiahuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XianxiahuodongVO;
import com.entity.view.XianxiahuodongView;


/**
 * 线下活动
 * 
 * @author 
 * @email 
 * @date 2021-03-03 14:14:54
 */
public interface XianxiahuodongDao extends BaseMapper<XianxiahuodongEntity> {
	
	List<XianxiahuodongVO> selectListVO(@Param("ew") Wrapper<XianxiahuodongEntity> wrapper);
	
	XianxiahuodongVO selectVO(@Param("ew") Wrapper<XianxiahuodongEntity> wrapper);
	
	List<XianxiahuodongView> selectListView(@Param("ew") Wrapper<XianxiahuodongEntity> wrapper);

	List<XianxiahuodongView> selectListView(Pagination page,@Param("ew") Wrapper<XianxiahuodongEntity> wrapper);
	
	XianxiahuodongView selectView(@Param("ew") Wrapper<XianxiahuodongEntity> wrapper);
	
}
