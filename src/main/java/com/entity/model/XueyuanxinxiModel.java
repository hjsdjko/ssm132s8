package com.entity.model;

import com.entity.XueyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学院信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-10 16:43:07
 */
public class XueyuanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学院类型
	 */
	
	private String xueyuanleixing;
		
	/**
	 * 所属地区
	 */
	
	private String suoshudiqu;
		
	/**
	 * 学院级别
	 */
	
	private String xueyuanjibie;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 学院地址
	 */
	
	private String xueyuandizhi;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 邮箱
	 */
	
	private String youxiang;
		
	/**
	 * 校园风采
	 */
	
	private String xiaoyuanfengcai;
				
	
	/**
	 * 设置：学院类型
	 */
	 
	public void setXueyuanleixing(String xueyuanleixing) {
		this.xueyuanleixing = xueyuanleixing;
	}
	
	/**
	 * 获取：学院类型
	 */
	public String getXueyuanleixing() {
		return xueyuanleixing;
	}
				
	
	/**
	 * 设置：所属地区
	 */
	 
	public void setSuoshudiqu(String suoshudiqu) {
		this.suoshudiqu = suoshudiqu;
	}
	
	/**
	 * 获取：所属地区
	 */
	public String getSuoshudiqu() {
		return suoshudiqu;
	}
				
	
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
	 * 设置：学院地址
	 */
	 
	public void setXueyuandizhi(String xueyuandizhi) {
		this.xueyuandizhi = xueyuandizhi;
	}
	
	/**
	 * 获取：学院地址
	 */
	public String getXueyuandizhi() {
		return xueyuandizhi;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：邮箱
	 */
	 
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
				
	
	/**
	 * 设置：校园风采
	 */
	 
	public void setXiaoyuanfengcai(String xiaoyuanfengcai) {
		this.xiaoyuanfengcai = xiaoyuanfengcai;
	}
	
	/**
	 * 获取：校园风采
	 */
	public String getXiaoyuanfengcai() {
		return xiaoyuanfengcai;
	}
			
}
