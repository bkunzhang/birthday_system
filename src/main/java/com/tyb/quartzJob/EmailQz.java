package com.tyb.quartzJob;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.tyb.birthdaySystem.dao.IInfoDao;
import com.tyb.util.LogCommonUtil;
import com.tyb.util.MailUtils;

/**
 * 任务调度--邮件提醒
 * @author 北辰不落雪
 *
 */
public class EmailQz {
	
	@Resource
	private IInfoDao dao;
	
	private static Calendar calendar = Calendar.getInstance();

	/**
	 * @throws Exception
	 * @Description 发送生日提醒邮件
	 */
	public void work1() throws Exception {
		String date = calendar.get(Calendar.YEAR) + "-"
				+ (calendar.get(Calendar.MONTH)+1) + "-" //月份从0开始，需要加一
				+ calendar.get(Calendar.DATE);
		
		SimpleDateFormat   sDateFormat   =   new   SimpleDateFormat("yyyy-MM-dd   hh:mm:ss");   
		LogCommonUtil.INFO.info(sDateFormat.format(new Date())+" 进入"+date+"号的Quartz每日任务");
		
		String title = date+"生日提醒";
		String suffix = "今天生日了，记得送他（她）一个祝福哦O(∩_∩)O";
		
		try {
			List<Map<String, Object>> datas = dao.getInfoByDate(date);
			LogCommonUtil.INFO.info("今日需要发送邮件："+datas.size());
			for (int i = 0; i < datas.size(); i++) {
				Map<String, Object> data = datas.get(i);
				MailUtils.sendEmail(data.get("u_email") + "", title,
						data.get("info_name") + suffix);
			}
			LogCommonUtil.INFO.info("执行Quartz的任务调度完毕");
		} catch (Exception e) {
			LogCommonUtil.ERROR.error(e.getMessage());
			throw new Exception();
		}

	}
}
