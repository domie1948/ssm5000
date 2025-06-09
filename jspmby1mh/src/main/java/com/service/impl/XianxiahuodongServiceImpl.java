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


import com.dao.XianxiahuodongDao;
import com.entity.XianxiahuodongEntity;
import com.service.XianxiahuodongService;
import com.entity.vo.XianxiahuodongVO;
import com.entity.view.XianxiahuodongView;

@Service("xianxiahuodongService")
public class XianxiahuodongServiceImpl extends ServiceImpl<XianxiahuodongDao, XianxiahuodongEntity> implements XianxiahuodongService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XianxiahuodongEntity> page = this.selectPage(
                new Query<XianxiahuodongEntity>(params).getPage(),
                new EntityWrapper<XianxiahuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XianxiahuodongEntity> wrapper) {
		  Page<XianxiahuodongView> page =new Query<XianxiahuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XianxiahuodongVO> selectListVO(Wrapper<XianxiahuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XianxiahuodongVO selectVO(Wrapper<XianxiahuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XianxiahuodongView> selectListView(Wrapper<XianxiahuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XianxiahuodongView selectView(Wrapper<XianxiahuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
