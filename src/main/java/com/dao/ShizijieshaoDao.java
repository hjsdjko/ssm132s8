package com.dao;

import com.entity.ShizijieshaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShizijieshaoVO;
import com.entity.view.ShizijieshaoView;


/**
 * 师资介绍
 * 
 * @author 
 * @email 
 * @date 2021-05-10 16:43:07
 */
public interface ShizijieshaoDao extends BaseMapper<ShizijieshaoEntity> {
	
	List<ShizijieshaoVO> selectListVO(@Param("ew") Wrapper<ShizijieshaoEntity> wrapper);
	
	ShizijieshaoVO selectVO(@Param("ew") Wrapper<ShizijieshaoEntity> wrapper);
	
	List<ShizijieshaoView> selectListView(@Param("ew") Wrapper<ShizijieshaoEntity> wrapper);

	List<ShizijieshaoView> selectListView(Pagination page,@Param("ew") Wrapper<ShizijieshaoEntity> wrapper);
	
	ShizijieshaoView selectView(@Param("ew") Wrapper<ShizijieshaoEntity> wrapper);
	
}
