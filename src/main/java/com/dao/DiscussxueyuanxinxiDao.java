package com.dao;

import com.entity.DiscussxueyuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxueyuanxinxiVO;
import com.entity.view.DiscussxueyuanxinxiView;


/**
 * 学院信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-10 16:43:07
 */
public interface DiscussxueyuanxinxiDao extends BaseMapper<DiscussxueyuanxinxiEntity> {
	
	List<DiscussxueyuanxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussxueyuanxinxiEntity> wrapper);
	
	DiscussxueyuanxinxiVO selectVO(@Param("ew") Wrapper<DiscussxueyuanxinxiEntity> wrapper);
	
	List<DiscussxueyuanxinxiView> selectListView(@Param("ew") Wrapper<DiscussxueyuanxinxiEntity> wrapper);

	List<DiscussxueyuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxueyuanxinxiEntity> wrapper);
	
	DiscussxueyuanxinxiView selectView(@Param("ew") Wrapper<DiscussxueyuanxinxiEntity> wrapper);
	
}
