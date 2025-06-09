package com.entity.view;

import com.entity.XianxiahuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 线下活动
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-03 14:14:54
 */
@TableName("xianxiahuodong")
public class XianxiahuodongView  extends XianxiahuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XianxiahuodongView(){
	}
 
 	public XianxiahuodongView(XianxiahuodongEntity xianxiahuodongEntity){
 	try {
			BeanUtils.copyProperties(this, xianxiahuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
