package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 学院信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-10 16:43:07
 */
@TableName("xueyuanxinxi")
public class XueyuanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XueyuanxinxiEntity() {
		
	}
	
	public XueyuanxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学院名称
	 */
					
	private String xueyuanmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学院名称
	 */
	public void setXueyuanmingcheng(String xueyuanmingcheng) {
		this.xueyuanmingcheng = xueyuanmingcheng;
	}
	/**
	 * 获取：学院名称
	 */
	public String getXueyuanmingcheng() {
		return xueyuanmingcheng;
	}
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
