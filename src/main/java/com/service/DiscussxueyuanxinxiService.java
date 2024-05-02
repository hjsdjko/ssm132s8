package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxueyuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxueyuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxueyuanxinxiView;


/**
 * 学院信息评论表
 *
 * @author 
 * @email 
 * @date 2021-05-10 16:43:07
 */
public interface DiscussxueyuanxinxiService extends IService<DiscussxueyuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxueyuanxinxiVO> selectListVO(Wrapper<DiscussxueyuanxinxiEntity> wrapper);
   	
   	DiscussxueyuanxinxiVO selectVO(@Param("ew") Wrapper<DiscussxueyuanxinxiEntity> wrapper);
   	
   	List<DiscussxueyuanxinxiView> selectListView(Wrapper<DiscussxueyuanxinxiEntity> wrapper);
   	
   	DiscussxueyuanxinxiView selectView(@Param("ew") Wrapper<DiscussxueyuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxueyuanxinxiEntity> wrapper);
   	
}

