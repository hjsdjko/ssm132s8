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


import com.dao.ShizijieshaoDao;
import com.entity.ShizijieshaoEntity;
import com.service.ShizijieshaoService;
import com.entity.vo.ShizijieshaoVO;
import com.entity.view.ShizijieshaoView;

@Service("shizijieshaoService")
public class ShizijieshaoServiceImpl extends ServiceImpl<ShizijieshaoDao, ShizijieshaoEntity> implements ShizijieshaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShizijieshaoEntity> page = this.selectPage(
                new Query<ShizijieshaoEntity>(params).getPage(),
                new EntityWrapper<ShizijieshaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShizijieshaoEntity> wrapper) {
		  Page<ShizijieshaoView> page =new Query<ShizijieshaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShizijieshaoVO> selectListVO(Wrapper<ShizijieshaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShizijieshaoVO selectVO(Wrapper<ShizijieshaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShizijieshaoView> selectListView(Wrapper<ShizijieshaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShizijieshaoView selectView(Wrapper<ShizijieshaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
