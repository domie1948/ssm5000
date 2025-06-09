package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiaoyouxinxiDao;
import com.entity.JiaoyouxinxiEntity;
import com.service.JiaoyouxinxiService;
import com.entity.vo.JiaoyouxinxiVO;
import com.entity.view.JiaoyouxinxiView;

@Service("jiaoyouxinxiService")
public class JiaoyouxinxiServiceImpl extends ServiceImpl<JiaoyouxinxiDao, JiaoyouxinxiEntity> implements JiaoyouxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoyouxinxiEntity> page = this.selectPage(
                new Query<JiaoyouxinxiEntity>(params).getPage(),
                new EntityWrapper<JiaoyouxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoyouxinxiEntity> wrapper) {
		  Page<JiaoyouxinxiView> page =new Query<JiaoyouxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoyouxinxiVO> selectListVO(Wrapper<JiaoyouxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoyouxinxiVO selectVO(Wrapper<JiaoyouxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoyouxinxiView> selectListView(Wrapper<JiaoyouxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoyouxinxiView selectView(Wrapper<JiaoyouxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
