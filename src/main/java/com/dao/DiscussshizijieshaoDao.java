package com.dao;

import com.entity.DiscussshizijieshaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshizijieshaoVO;
import com.entity.view.DiscussshizijieshaoView;


/**
 * 师资介绍评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-10 16:43:07
 */
public interface DiscussshizijieshaoDao extends BaseMapper<DiscussshizijieshaoEntity> {
	
	List<DiscussshizijieshaoVO> selectListVO(@Param("ew") Wrapper<DiscussshizijieshaoEntity> wrapper);
	
	DiscussshizijieshaoVO selectVO(@Param("ew") Wrapper<DiscussshizijieshaoEntity> wrapper);
	
	List<DiscussshizijieshaoView> selectListView(@Param("ew") Wrapper<DiscussshizijieshaoEntity> wrapper);

	List<DiscussshizijieshaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshizijieshaoEntity> wrapper);
	
	DiscussshizijieshaoView selectView(@Param("ew") Wrapper<DiscussshizijieshaoEntity> wrapper);
	
}
