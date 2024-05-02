package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XueyuanxinxiDao;
import com.entity.XueyuanxinxiEntity;
import com.service.XueyuanxinxiService;
import com.entity.vo.XueyuanxinxiVO;
import com.entity.view.XueyuanxinxiView;

@Service("xueyuanxinxiService")
public class XueyuanxinxiServiceImpl extends ServiceImpl<XueyuanxinxiDao, XueyuanxinxiEntity> implements XueyuanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueyuanxinxiEntity> page = this.selectPage(
                new Query<XueyuanxinxiEntity>(params).getPage(),
                new EntityWrapper<XueyuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueyuanxinxiEntity> wrapper) {
		  Page<XueyuanxinxiView> page =new Query<XueyuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueyuanxinxiVO> selectListVO(Wrapper<XueyuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueyuanxinxiVO selectVO(Wrapper<XueyuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueyuanxinxiView> selectListView(Wrapper<XueyuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueyuanxinxiView selectView(Wrapper<XueyuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
