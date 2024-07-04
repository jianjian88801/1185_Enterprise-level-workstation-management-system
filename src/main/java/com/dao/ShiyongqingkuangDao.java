package com.dao;

import com.entity.ShiyongqingkuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyongqingkuangVO;
import com.entity.view.ShiyongqingkuangView;


/**
 * 使用情况
 * 
 * @author 
 * @email 
 * @date 2021-05-13 10:57:07
 */
public interface ShiyongqingkuangDao extends BaseMapper<ShiyongqingkuangEntity> {
	
	List<ShiyongqingkuangVO> selectListVO(@Param("ew") Wrapper<ShiyongqingkuangEntity> wrapper);
	
	ShiyongqingkuangVO selectVO(@Param("ew") Wrapper<ShiyongqingkuangEntity> wrapper);
	
	List<ShiyongqingkuangView> selectListView(@Param("ew") Wrapper<ShiyongqingkuangEntity> wrapper);

	List<ShiyongqingkuangView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyongqingkuangEntity> wrapper);
	
	ShiyongqingkuangView selectView(@Param("ew") Wrapper<ShiyongqingkuangEntity> wrapper);
	
}
