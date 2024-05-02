package com.dao;

import com.entity.XueyuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueyuanxinxiVO;
import com.entity.view.XueyuanxinxiView;


/**
 * 学院信息
 * 
 * @author 
 * @email 
 * @date 2021-05-10 16:43:07
 */
public interface XueyuanxinxiDao extends BaseMapper<XueyuanxinxiEntity> {
	
	List<XueyuanxinxiVO> selectListVO(@Param("ew") Wrapper<XueyuanxinxiEntity> wrapper);
	
	XueyuanxinxiVO selectVO(@Param("ew") Wrapper<XueyuanxinxiEntity> wrapper);
	
	List<XueyuanxinxiView> selectListView(@Param("ew") Wrapper<XueyuanxinxiEntity> wrapper);

	List<XueyuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XueyuanxinxiEntity> wrapper);
	
	XueyuanxinxiView selectView(@Param("ew") Wrapper<XueyuanxinxiEntity> wrapper);
	
}
