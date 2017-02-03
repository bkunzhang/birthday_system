package com.tyb.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 日志切入
 * 记录每个方法请求的参数、响应及损耗时间
 * @author 北辰不落雪
 *
 */
@Component
@Aspect
public class LogIntercptor {
	
	private final static Log log =  LogFactory.getLog(LogIntercptor.class);
	
	@Pointcut("within(@org.springframework.stereotype.Controller *)")
	public void cutController(){}
	
	//任意权限的 com.tyb包及子包包含“service”的关键字 其所有方法不管参数个数 都将切入
	@Pointcut("execution(* com.tyb..*Service*.*(..))")
	public void cutService(){}
	
	@Around("cutController() || cutService()")
	public Object log(JoinPoint joinPoint) throws Throwable{
		//返回的对象
		Object rs = null;
		Long startTime = System.currentTimeMillis();

		try{
			rs = ((ProceedingJoinPoint) joinPoint).proceed();
			Long endTime = System.currentTimeMillis();
			StringBuffer buffer = new StringBuffer();
			buffer.append("操作: " );
			buffer.append(joinPoint);
			buffer.append("\n参数: ");
			print(joinPoint.getArgs(),buffer,0); //此处直接返回stringbuffer性能更加优化
			buffer.append("\n结果: ");
			print(rs,buffer,0);
			buffer.append("\n耗时: ");
			buffer.append(endTime - startTime);
			buffer.append("ms");

			log.info(buffer.toString());
			
		}catch(Exception e){
			Long endTime = System.currentTimeMillis();
			
			StringBuffer buffer = new StringBuffer();
			buffer.append("操作: " );
			buffer.append(joinPoint);
			buffer.append("\n参数: ");
			print(joinPoint.getArgs(),buffer,0); //此处直接返回stringbuffer性能更加优化
			buffer.append("\n结果: ");
			print(rs,buffer,0);
			buffer.append("\n耗时: ");
			buffer.append(endTime - startTime);
			buffer.append("ms");
			buffer.append("\n异常信息:　");
			buffer.append(e.getMessage());
			
			log.error(buffer.toString());
			throw e;
		}

		return rs;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private String print(Object o,StringBuffer sb,int level)
	{
		level++;
		if(null == sb)
		{
			sb = new StringBuffer();
		}
		
		if(o instanceof Object[])
		{
			
			Object[] oa = (Object[]) o;
			sb.append(ReflectionToStringBuilder.toString(o));
			for(int i = 0;i<oa.length; i++)
			{
				print(oa[i],sb,level);
			}
		}
		else if(o instanceof Collection)
		{
			Collection<Object> c = (Collection<Object>) o;
			print(c.toArray(),sb,level);
			
		}
		else if(o instanceof Map)
		{
			Map c = (Map) o;
			Iterator<Map.Entry<String, Object>> it = c.entrySet().iterator();
			for(;it.hasNext();)
			{
				 Map.Entry<String, Object> entry = it.next();
				 	sb.append("\n");
					for(int i=0;i<level;i++)
					{
						sb.append("--");
					}
				 sb.append("key= " + entry.getKey() + " and value= " + entry.getValue());
			}
			
		}
		else if(o instanceof String)
		{
			sb.append("\n");
			for(int i=0;i<level;i++)
			{
				sb.append("--");
			}
			sb.append(o);
		}
		else {
			sb.append("\n");
			for(int i=0;i<level;i++)
			{
				sb.append("--");
			}
			sb.append(ReflectionToStringBuilder.toString(o));
		}
		return sb.toString();
		
		
	}
	
	@AfterThrowing("cutController() || cutService()")  
    public void catchInfo() {  
        System.out.println("异常信息");  
    } 
}
