package com.huaying.common.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.huaying.common.page.PageData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * <P>File name : BaseController.java </P>
 * <P>Date : 2017年4月12日下午2:38:53 </P>
 * <P>Desc : 基础的控制层方法</P>
 * <P>Update History : <ul>
 *     </ul>
 * </P>
 */
public  class BaseController {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 得到ModelAndView
	 */
//	public ModelAndView getModelAndView() {
//		return new ModelAndView();
//	}
	
	/**
	 * 得到request对象
	 */
	public HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		return request;
	}
	

	/**
	 * 得到PageData 
	 */
	public PageData getPageData() {
		PageData pd = new PageData(this.getRequest());
		return pd;
	}
	
	/**
	 * 得到PageData 
	 */
	public PageData getSaasPageData() {
		PageData pd = new PageData(this.getRequest());
		return pd;
	}
	
	/**
	 * 获取web用户id
	 * @Title: getBusinessUserId 
	 * @Description: TODO
	 * @return
	 * @return: String
	 */
//	public String getUserId(){
//		String userId =String.valueOf(this.getRequest().getSession().getAttribute(SessionConstant.SESSION_USER_ID));
//		if(StringUtil.isEmpty(userId)){
//			return "1";
//		}
//		return  userId;
//	}
//
//	public JSONObject getUserInfo(){
//		String userInfo=String.valueOf(this.getRequest().getSession().getAttribute(SessionConstant.SESSION_USER_INFO));
//		if(StringUtil.isEmpty(userInfo)){
//			return null;
//		}
//		return JSONObject.parseObject(userInfo, JSONObject.class);
//	}

	


}