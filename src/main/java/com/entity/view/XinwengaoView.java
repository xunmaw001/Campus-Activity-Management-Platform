package com.entity.view;

import com.entity.XinwengaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 新闻稿
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
@TableName("xinwengao")
public class XinwengaoView  extends XinwengaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinwengaoView(){
	}
 
 	public XinwengaoView(XinwengaoEntity xinwengaoEntity){
 	try {
			BeanUtils.copyProperties(this, xinwengaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
