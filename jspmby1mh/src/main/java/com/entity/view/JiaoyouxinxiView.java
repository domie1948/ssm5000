package com.entity.view;

import com.entity.JiaoyouxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 交友信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-03 14:14:54
 */
@TableName("jiaoyouxinxi")
public class JiaoyouxinxiView  extends JiaoyouxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoyouxinxiView(){
	}
 
 	public JiaoyouxinxiView(JiaoyouxinxiEntity jiaoyouxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoyouxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
