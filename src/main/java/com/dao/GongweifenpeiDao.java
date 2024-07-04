package com.dao;

import com.entity.GongweifenpeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongweifenpeiVO;
import com.entity.view.GongweifenpeiView;


/**
 * 工位分配
 * 
 * @author 
 * @email 
 * @date 2021-05-13 10:57:07
 */
public interface GongweifenpeiDao extends BaseMapper<GongweifenpeiEntity> {
	
	List<GongweifenpeiVO> selectListVO(@Param("ew") Wrapper<GongweifenpeiEntity> wrapper);
	
	GongweifenpeiVO selectVO(@Param("ew") Wrapper<GongweifenpeiEntity> wrapper);
	
	List<GongweifenpeiView> selectListView(@Param("ew") Wrapper<GongweifenpeiEntity> wrapper);

	List<GongweifenpeiView> selectListView(Pagination page,@Param("ew") Wrapper<GongweifenpeiEntity> wrapper);
	
	GongweifenpeiView selectView(@Param("ew") Wrapper<GongweifenpeiEntity> wrapper);
	
}
