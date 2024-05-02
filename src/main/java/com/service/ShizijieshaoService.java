package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShizijieshaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShizijieshaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShizijieshaoView;


/**
 * 师资介绍
 *
 * @author 
 * @email 
 * @date 2021-05-10 16:43:07
 */
public interface ShizijieshaoService extends IService<ShizijieshaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShizijieshaoVO> selectListVO(Wrapper<ShizijieshaoEntity> wrapper);
   	
   	ShizijieshaoVO selectVO(@Param("ew") Wrapper<ShizijieshaoEntity> wrapper);
   	
   	List<ShizijieshaoView> selectListView(Wrapper<ShizijieshaoEntity> wrapper);
   	
   	ShizijieshaoView selectView(@Param("ew") Wrapper<ShizijieshaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShizijieshaoEntity> wrapper);
   	
}

