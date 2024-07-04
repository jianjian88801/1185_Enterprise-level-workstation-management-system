package com.entity.model;

import com.entity.GongweixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 工位信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-13 10:57:07
 */
public class GongweixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 工位名称
	 */
	
	private String gongweimingcheng;
		
	/**
	 * 工位介绍
	 */
	
	private String gongweijieshao;
				
	
	/**
	 * 设置：工位名称
	 */
	 
	public void setGongweimingcheng(String gongweimingcheng) {
		this.gongweimingcheng = gongweimingcheng;
	}
	
	/**
	 * 获取：工位名称
	 */
	public String getGongweimingcheng() {
		return gongweimingcheng;
	}
				
	
	/**
	 * 设置：工位介绍
	 */
	 
	public void setGongweijieshao(String gongweijieshao) {
		this.gongweijieshao = gongweijieshao;
	}
	
	/**
	 * 获取：工位介绍
	 */
	public String getGongweijieshao() {
		return gongweijieshao;
	}
			
}
