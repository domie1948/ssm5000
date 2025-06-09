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


import com.dao.DiscussjiaoyouxinxiDao;
import com.entity.DiscussjiaoyouxinxiEntity;
import com.service.DiscussjiaoyouxinxiService;
import com.entity.vo.DiscussjiaoyouxinxiVO;
import com.entity.view.DiscussjiaoyouxinxiView;

@Service("discussjiaoyouxinxiService")
public class DiscussjiaoyouxinxiServiceImpl extends ServiceImpl<DiscussjiaoyouxinxiDao, DiscussjiaoyouxinxiEntity> implements DiscussjiaoyouxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiaoyouxinxiEntity> page = this.selectPage(
                new Query<DiscussjiaoyouxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussjiaoyouxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiaoyouxinxiEntity> wrapper) {
		  Page<DiscussjiaoyouxinxiView> page =new Query<DiscussjiaoyouxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiaoyouxinxiVO> selectListVO(Wrapper<DiscussjiaoyouxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiaoyouxinxiVO selectVO(Wrapper<DiscussjiaoyouxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiaoyouxinxiView> selectListView(Wrapper<DiscussjiaoyouxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiaoyouxinxiView selectView(Wrapper<DiscussjiaoyouxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
