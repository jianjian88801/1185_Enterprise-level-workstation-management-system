package com.dao;

import com.entity.GongweixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongweixinxiVO;
import com.entity.view.GongweixinxiView;


/**
 * 工位信息
 * 
 * @author 
 * @email 
 * @date 2021-05-13 10:57:07
 */
public interface GongweixinxiDao extends BaseMapper<GongweixinxiEntity> {
	
	List<GongweixinxiVO> selectListVO(@Param("ew") Wrapper<GongweixinxiEntity> wrapper);
	
	GongweixinxiVO selectVO(@Param("ew") Wrapper<GongweixinxiEntity> wrapper);
	
	List<GongweixinxiView> selectListView(@Param("ew") Wrapper<GongweixinxiEntity> wrapper);

	List<GongweixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GongweixinxiEntity> wrapper);
	
	GongweixinxiView selectView(@Param("ew") Wrapper<GongweixinxiEntity> wrapper);
	
}
