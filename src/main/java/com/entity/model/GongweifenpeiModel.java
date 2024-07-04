package com.entity.model;

import com.entity.GongweifenpeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 工位分配
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-13 10:57:07
 */
public class GongweifenpeiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 分配工位
	 */
	
	private String fenpeigongwei;
		
	/**
	 * 分配原因
	 */
	
	private String fenpeiyuanyin;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
				
	
	/**
	 * 设置：分配工位
	 */
	 
	public void setFenpeigongwei(String fenpeigongwei) {
		this.fenpeigongwei = fenpeigongwei;
	}
	
	/**
	 * 获取：分配工位
	 */
	public String getFenpeigongwei() {
		return fenpeigongwei;
	}
				
	
	/**
	 * 设置：分配原因
	 */
	 
	public void setFenpeiyuanyin(String fenpeiyuanyin) {
		this.fenpeiyuanyin = fenpeiyuanyin;
	}
	
	/**
	 * 获取：分配原因
	 */
	public String getFenpeiyuanyin() {
		return fenpeiyuanyin;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
			
}
