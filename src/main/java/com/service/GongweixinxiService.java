package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongweixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongweixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongweixinxiView;


/**
 * 工位信息
 *
 * @author 
 * @email 
 * @date 2021-05-13 10:57:07
 */
public interface GongweixinxiService extends IService<GongweixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongweixinxiVO> selectListVO(Wrapper<GongweixinxiEntity> wrapper);
   	
   	GongweixinxiVO selectVO(@Param("ew") Wrapper<GongweixinxiEntity> wrapper);
   	
   	List<GongweixinxiView> selectListView(Wrapper<GongweixinxiEntity> wrapper);
   	
   	GongweixinxiView selectView(@Param("ew") Wrapper<GongweixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongweixinxiEntity> wrapper);
   	
}

