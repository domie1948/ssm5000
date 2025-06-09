package com.dao;

import com.entity.JiaoyouxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoyouxinxiVO;
import com.entity.view.JiaoyouxinxiView;


/**
 * 交友信息
 * 
 * @author 
 * @email 
 * @date 2021-03-03 14:14:54
 */
public interface JiaoyouxinxiDao extends BaseMapper<JiaoyouxinxiEntity> {
	
	List<JiaoyouxinxiVO> selectListVO(@Param("ew") Wrapper<JiaoyouxinxiEntity> wrapper);
	
	JiaoyouxinxiVO selectVO(@Param("ew") Wrapper<JiaoyouxinxiEntity> wrapper);
	
	List<JiaoyouxinxiView> selectListView(@Param("ew") Wrapper<JiaoyouxinxiEntity> wrapper);

	List<JiaoyouxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoyouxinxiEntity> wrapper);
	
	JiaoyouxinxiView selectView(@Param("ew") Wrapper<JiaoyouxinxiEntity> wrapper);
	
}
