package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyongqingkuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyongqingkuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyongqingkuangView;


/**
 * 使用情况
 *
 * @author 
 * @email 
 * @date 2021-05-13 10:57:07
 */
public interface ShiyongqingkuangService extends IService<ShiyongqingkuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyongqingkuangVO> selectListVO(Wrapper<ShiyongqingkuangEntity> wrapper);
   	
   	ShiyongqingkuangVO selectVO(@Param("ew") Wrapper<ShiyongqingkuangEntity> wrapper);
   	
   	List<ShiyongqingkuangView> selectListView(Wrapper<ShiyongqingkuangEntity> wrapper);
   	
   	ShiyongqingkuangView selectView(@Param("ew") Wrapper<ShiyongqingkuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyongqingkuangEntity> wrapper);
   	
}

