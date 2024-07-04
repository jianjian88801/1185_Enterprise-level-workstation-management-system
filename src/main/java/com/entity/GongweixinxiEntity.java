package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 工位信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-13 10:57:07
 */
@TableName("gongweixinxi")
public class GongweixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongweixinxiEntity() {
		
	}
	
	public GongweixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 工位编号
	 */
					
	private String gongweibianhao;
	
	/**
	 * 工位名称
	 */
					
	private String gongweimingcheng;
	
	/**
	 * 工位介绍
	 */
					
	private String gongweijieshao;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：工位编号
	 */
	public void setGongweibianhao(String gongweibianhao) {
		this.gongweibianhao = gongweibianhao;
	}
	/**
	 * 获取：工位编号
	 */
	public String getGongweibianhao() {
		return gongweibianhao;
	}
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
