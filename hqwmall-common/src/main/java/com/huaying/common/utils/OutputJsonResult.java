
package com.huaying.common.utils;

import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 *
 * @author Mark sunlightcs@gmail.com
 */
public class OutputJsonResult extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;
	
	public OutputJsonResult() {
		put("returnCode", 200);
		put("returnDesc", "success");
	}
	
	public static OutputJsonResult error() {
		return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
	}
	
	public static OutputJsonResult error(String msg) {
		return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
	}
	
	public static OutputJsonResult error(int code, String msg) {
		OutputJsonResult r = new OutputJsonResult();
		r.put("returnCode", code);
		r.put("returnDesc", msg);
		return r;
	}

	public static OutputJsonResult ok(String msg) {
		OutputJsonResult r = new OutputJsonResult();
		r.put("returnDesc", msg);
		return r;
	}
	
	public static OutputJsonResult ok(Map<String, Object> map) {
		OutputJsonResult r = new OutputJsonResult();
		r.putAll(map);
		return r;
	}
	
	public static OutputJsonResult ok() {
		return new OutputJsonResult();
	}

	public OutputJsonResult put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
