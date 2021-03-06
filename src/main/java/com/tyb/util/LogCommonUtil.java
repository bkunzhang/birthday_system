package com.tyb.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 * apache-common日志管理（默认log4j日志）
 * 
 * <p>记录点：控制器，服务层	
 * @author 北辰不落雪
 * <P>PS: Logger来自log4j自己的包。如果用Logger.getLogger，需要一个log4j的jar包，用此方式你只能依靠log4j；
 * LogFactory来自common-logging包。如果用LogFactory.getLog，你可以用任何实现了通用日志接口的日志记录器替换log4j。
 */
public class LogCommonUtil {
	
	private LogCommonUtil(){
		
	}
	
	/**
	 * 调试级别（业务：仅仅用于调试，业务中不推荐使用）
	 */
	public static final Log DEBUG = LogFactory.getLog("debug");
	/**
	 * 正常信息级别（业务：业务流程记录）
	 */
	public static final Log INFO = LogFactory.getLog("info");
	/**
	 * 警告级别（业务：已知异常记录）
	 */
	public static final Log WARN = LogFactory.getLog("warn");
	/**
	 * 错误级别（业务：未知异常记录）
	 */
	public static final Log ERROR = LogFactory.getLog("error");
	/**
	 * 致命错误级别（业务：一般不使用）
	 */
	public static final Log FATAL = LogFactory.getLog("fatal");
}
