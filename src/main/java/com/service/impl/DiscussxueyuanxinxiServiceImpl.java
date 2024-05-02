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


import com.dao.DiscussxueyuanxinxiDao;
import com.entity.DiscussxueyuanxinxiEntity;
import com.service.DiscussxueyuanxinxiService;
import com.entity.vo.DiscussxueyuanxinxiVO;
import com.entity.view.DiscussxueyuanxinxiView;

@Service("discussxueyuanxinxiService")
public class DiscussxueyuanxinxiServiceImpl extends ServiceImpl<DiscussxueyuanxinxiDao, DiscussxueyuanxinxiEntity> implements DiscussxueyuanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxueyuanxinxiEntity> page = this.selectPage(
                new Query<DiscussxueyuanxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussxueyuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxueyuanxinxiEntity> wrapper) {
		  Page<DiscussxueyuanxinxiView> page =new Query<DiscussxueyuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxueyuanxinxiVO> selectListVO(Wrapper<DiscussxueyuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxueyuanxinxiVO selectVO(Wrapper<DiscussxueyuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxueyuanxinxiView> selectListView(Wrapper<DiscussxueyuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxueyuanxinxiView selectView(Wrapper<DiscussxueyuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
