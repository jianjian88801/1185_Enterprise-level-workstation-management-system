package com.entity.view;

import com.entity.ShiyongqingkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 使用情况
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-13 10:57:07
 */
@TableName("shiyongqingkuang")
public class ShiyongqingkuangView  extends ShiyongqingkuangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiyongqingkuangView(){
	}
 
 	public ShiyongqingkuangView(ShiyongqingkuangEntity shiyongqingkuangEntity){
 	try {
			BeanUtils.copyProperties(this, shiyongqingkuangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
