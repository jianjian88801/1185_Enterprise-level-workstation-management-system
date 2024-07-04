package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.GongweifenpeiEntity;
import com.entity.view.GongweifenpeiView;

import com.service.GongweifenpeiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 工位分配
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-13 10:57:07
 */
@RestController
@RequestMapping("/gongweifenpei")
public class GongweifenpeiController {
    @Autowired
    private GongweifenpeiService gongweifenpeiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GongweifenpeiEntity gongweifenpei,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			gongweifenpei.setYuangonggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GongweifenpeiEntity> ew = new EntityWrapper<GongweifenpeiEntity>();
		PageUtils page = gongweifenpeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongweifenpei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GongweifenpeiEntity gongweifenpei, 
		HttpServletRequest request){
        EntityWrapper<GongweifenpeiEntity> ew = new EntityWrapper<GongweifenpeiEntity>();
		PageUtils page = gongweifenpeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongweifenpei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GongweifenpeiEntity gongweifenpei){
       	EntityWrapper<GongweifenpeiEntity> ew = new EntityWrapper<GongweifenpeiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gongweifenpei, "gongweifenpei")); 
        return R.ok().put("data", gongweifenpeiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GongweifenpeiEntity gongweifenpei){
        EntityWrapper< GongweifenpeiEntity> ew = new EntityWrapper< GongweifenpeiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gongweifenpei, "gongweifenpei")); 
		GongweifenpeiView gongweifenpeiView =  gongweifenpeiService.selectView(ew);
		return R.ok("查询工位分配成功").put("data", gongweifenpeiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GongweifenpeiEntity gongweifenpei = gongweifenpeiService.selectById(id);
        return R.ok().put("data", gongweifenpei);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GongweifenpeiEntity gongweifenpei = gongweifenpeiService.selectById(id);
        return R.ok().put("data", gongweifenpei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GongweifenpeiEntity gongweifenpei, HttpServletRequest request){
    	gongweifenpei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gongweifenpei);
        gongweifenpeiService.insert(gongweifenpei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GongweifenpeiEntity gongweifenpei, HttpServletRequest request){
    	gongweifenpei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gongweifenpei);
        gongweifenpeiService.insert(gongweifenpei);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GongweifenpeiEntity gongweifenpei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gongweifenpei);
        gongweifenpeiService.updateById(gongweifenpei);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gongweifenpeiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<GongweifenpeiEntity> wrapper = new EntityWrapper<GongweifenpeiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			wrapper.eq("yuangonggonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = gongweifenpeiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
