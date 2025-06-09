package com.entity.view;

import com.entity.DiscussjiaoyouxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 交友信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-03 14:14:54
 */
@TableName("discussjiaoyouxinxi")
public class DiscussjiaoyouxinxiView  extends DiscussjiaoyouxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiaoyouxinxiView(){
	}
 
 	public DiscussjiaoyouxinxiView(DiscussjiaoyouxinxiEntity discussjiaoyouxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiaoyouxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
