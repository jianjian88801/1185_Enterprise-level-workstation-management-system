package com.entity.model;

import com.entity.BumenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 部门信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-13 10:57:07
 */
public class BumenxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 部门名称
	 */
	
	private String bumenmingcheng;
		
	/**
	 * 部门主管
	 */
	
	private String bumenzhuguan;
		
	/**
	 * 部门人数
	 */
	
	private Integer bumenrenshu;
		
	/**
	 * 部门电话
	 */
	
	private String bumendianhua;
		
	/**
	 * 部门介绍
	 */
	
	private String bumenjieshao;
				
	
	/**
	 * 设置：部门名称
	 */
	 
	public void setBumenmingcheng(String bumenmingcheng) {
		this.bumenmingcheng = bumenmingcheng;
	}
	
	/**
	 * 获取：部门名称
	 */
	public String getBumenmingcheng() {
		return bumenmingcheng;
	}
				
	
	/**
	 * 设置：部门主管
	 */
	 
	public void setBumenzhuguan(String bumenzhuguan) {
		this.bumenzhuguan = bumenzhuguan;
	}
	
	/**
	 * 获取：部门主管
	 */
	public String getBumenzhuguan() {
		return bumenzhuguan;
	}
				
	
	/**
	 * 设置：部门人数
	 */
	 
	public void setBumenrenshu(Integer bumenrenshu) {
		this.bumenrenshu = bumenrenshu;
	}
	
	/**
	 * 获取：部门人数
	 */
	public Integer getBumenrenshu() {
		return bumenrenshu;
	}
				
	
	/**
	 * 设置：部门电话
	 */
	 
	public void setBumendianhua(String bumendianhua) {
		this.bumendianhua = bumendianhua;
	}
	
	/**
	 * 获取：部门电话
	 */
	public String getBumendianhua() {
		return bumendianhua;
	}
				
	
	/**
	 * 设置：部门介绍
	 */
	 
	public void setBumenjieshao(String bumenjieshao) {
		this.bumenjieshao = bumenjieshao;
	}
	
	/**
	 * 获取：部门介绍
	 */
	public String getBumenjieshao() {
		return bumenjieshao;
	}
			
}
