package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshizijieshaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshizijieshaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshizijieshaoView;


/**
 * 师资介绍评论表
 *
 * @author 
 * @email 
 * @date 2021-05-10 16:43:07
 */
public interface DiscussshizijieshaoService extends IService<DiscussshizijieshaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshizijieshaoVO> selectListVO(Wrapper<DiscussshizijieshaoEntity> wrapper);
   	
   	DiscussshizijieshaoVO selectVO(@Param("ew") Wrapper<DiscussshizijieshaoEntity> wrapper);
   	
   	List<DiscussshizijieshaoView> selectListView(Wrapper<DiscussshizijieshaoEntity> wrapper);
   	
   	DiscussshizijieshaoView selectView(@Param("ew") Wrapper<DiscussshizijieshaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshizijieshaoEntity> wrapper);
   	
}

