package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongweifenpeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongweifenpeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongweifenpeiView;


/**
 * 工位分配
 *
 * @author 
 * @email 
 * @date 2021-05-13 10:57:07
 */
public interface GongweifenpeiService extends IService<GongweifenpeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongweifenpeiVO> selectListVO(Wrapper<GongweifenpeiEntity> wrapper);
   	
   	GongweifenpeiVO selectVO(@Param("ew") Wrapper<GongweifenpeiEntity> wrapper);
   	
   	List<GongweifenpeiView> selectListView(Wrapper<GongweifenpeiEntity> wrapper);
   	
   	GongweifenpeiView selectView(@Param("ew") Wrapper<GongweifenpeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongweifenpeiEntity> wrapper);
   	
}

