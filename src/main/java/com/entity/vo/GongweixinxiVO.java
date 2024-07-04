package com.entity.vo;

import com.entity.GongweixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 工位信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-13 10:57:07
 */
public class GongweixinxiVO  implements Serializable {
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
