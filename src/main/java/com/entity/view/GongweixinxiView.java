package com.entity.view;

import com.entity.GongweixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 工位信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-13 10:57:07
 */
@TableName("gongweixinxi")
public class GongweixinxiView  extends GongweixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongweixinxiView(){
	}
 
 	public GongweixinxiView(GongweixinxiEntity gongweixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, gongweixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
