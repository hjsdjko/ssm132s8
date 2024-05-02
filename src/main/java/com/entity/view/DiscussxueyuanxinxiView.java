package com.entity.view;

import com.entity.DiscussxueyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学院信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-10 16:43:07
 */
@TableName("discussxueyuanxinxi")
public class DiscussxueyuanxinxiView  extends DiscussxueyuanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxueyuanxinxiView(){
	}
 
 	public DiscussxueyuanxinxiView(DiscussxueyuanxinxiEntity discussxueyuanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussxueyuanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
