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


import com.dao.DiscussshizijieshaoDao;
import com.entity.DiscussshizijieshaoEntity;
import com.service.DiscussshizijieshaoService;
import com.entity.vo.DiscussshizijieshaoVO;
import com.entity.view.DiscussshizijieshaoView;

@Service("discussshizijieshaoService")
public class DiscussshizijieshaoServiceImpl extends ServiceImpl<DiscussshizijieshaoDao, DiscussshizijieshaoEntity> implements DiscussshizijieshaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshizijieshaoEntity> page = this.selectPage(
                new Query<DiscussshizijieshaoEntity>(params).getPage(),
                new EntityWrapper<DiscussshizijieshaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshizijieshaoEntity> wrapper) {
		  Page<DiscussshizijieshaoView> page =new Query<DiscussshizijieshaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshizijieshaoVO> selectListVO(Wrapper<DiscussshizijieshaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshizijieshaoVO selectVO(Wrapper<DiscussshizijieshaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshizijieshaoView> selectListView(Wrapper<DiscussshizijieshaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshizijieshaoView selectView(Wrapper<DiscussshizijieshaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
