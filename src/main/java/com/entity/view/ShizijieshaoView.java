package com.entity.view;

import com.entity.ShizijieshaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 师资介绍
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-10 16:43:07
 */
@TableName("shizijieshao")
public class ShizijieshaoView  extends ShizijieshaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShizijieshaoView(){
	}
 
 	public ShizijieshaoView(ShizijieshaoEntity shizijieshaoEntity){
 	try {
			BeanUtils.copyProperties(this, shizijieshaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
