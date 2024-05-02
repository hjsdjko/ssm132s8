package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueyuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueyuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueyuanxinxiView;


/**
 * 学院信息
 *
 * @author 
 * @email 
 * @date 2021-05-10 16:43:07
 */
public interface XueyuanxinxiService extends IService<XueyuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueyuanxinxiVO> selectListVO(Wrapper<XueyuanxinxiEntity> wrapper);
   	
   	XueyuanxinxiVO selectVO(@Param("ew") Wrapper<XueyuanxinxiEntity> wrapper);
   	
   	List<XueyuanxinxiView> selectListView(Wrapper<XueyuanxinxiEntity> wrapper);
   	
   	XueyuanxinxiView selectView(@Param("ew") Wrapper<XueyuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueyuanxinxiEntity> wrapper);
   	
}

