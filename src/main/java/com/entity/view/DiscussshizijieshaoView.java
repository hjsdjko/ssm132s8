package com.entity.view;

import com.entity.DiscussshizijieshaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 师资介绍评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-10 16:43:07
 */
@TableName("discussshizijieshao")
public class DiscussshizijieshaoView  extends DiscussshizijieshaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshizijieshaoView(){
	}
 
 	public DiscussshizijieshaoView(DiscussshizijieshaoEntity discussshizijieshaoEntity){
 	try {
			BeanUtils.copyProperties(this, discussshizijieshaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
