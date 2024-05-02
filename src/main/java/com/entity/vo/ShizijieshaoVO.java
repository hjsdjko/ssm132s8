package com.entity.vo;

import com.entity.ShizijieshaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 师资介绍
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-10 16:43:07
 */
public class ShizijieshaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学院级别
	 */
	
	private String xueyuanjibie;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 教师人数
	 */
	
	private String jiaoshirenshu;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 教师风采
	 */
	
	private String jiaoshifengcai;
				
	
	/**
	 * 设置：学院级别
	 */
	 
	public void setXueyuanjibie(String xueyuanjibie) {
		this.xueyuanjibie = xueyuanjibie;
	}
	
	/**
	 * 获取：学院级别
	 */
	public String getXueyuanjibie() {
		return xueyuanjibie;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：教师人数
	 */
	 
	public void setJiaoshirenshu(String jiaoshirenshu) {
		this.jiaoshirenshu = jiaoshirenshu;
	}
	
	/**
	 * 获取：教师人数
	 */
	public String getJiaoshirenshu() {
		return jiaoshirenshu;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：教师风采
	 */
	 
	public void setJiaoshifengcai(String jiaoshifengcai) {
		this.jiaoshifengcai = jiaoshifengcai;
	}
	
	/**
	 * 获取：教师风采
	 */
	public String getJiaoshifengcai() {
		return jiaoshifengcai;
	}
			
}
