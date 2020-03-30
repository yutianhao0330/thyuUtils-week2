package com.yutianhao.common.utils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * 
    * @ClassName: RandomUtil
    * @Description: 随机数工具类
    * @author thyu
    * @date 2020年3月30日
    *
 */
public class RandomUtil {
	/**
	 * 
	    * @Title: random
	    * @Description: 返回min-max之间的随机整数
	    * @param @param min
	    * @param @param max
	    * @param @return    参数
	    * @return int    返回类型
	    * @throws
	 */
	public static int random(int min, int max){
		//TODO 实现代码
		return min + new Random().nextInt(max-min+1);
	}
	/**
	 * 
	    * @Title: subRandom
	    * @Description: 在最小值min与最大值max之间截取subs个不重复的随机数
	    * @param @param min
	    * @param @param max
	    * @param @param subs
	    * @param @return    参数
	    * @return int[]    返回类型
	    * @throws
	 */
	public static int[] subRandom (int min, int max, int subs){
		//TODO 实现代码
		if(subs > max-min+1) {
			throw new RuntimeException("数组长度超出范围!");
		}
		List<Integer> list = new ArrayList<Integer>();
		int num = 0;
		for(;;) {
			int random = random(min, max);
			if(list.contains(random)) {
				continue;
			}
			list.add(random);
			if(++num==subs) {
				break;
			}
		}
		int[] result = new int[subs];
		for (int i=0;i<list.size();i++) {
			result[i] = list.get(i);
		}
		return result;
	}
	/**
	 * 
	    * @Title: randomCharacter
	    * @Description: 返回1个1-9,a-Z之间的随机字符
	    * @param @return    参数
	    * @return char    返回类型
	    * @throws
	 */
	public static char randomCharacter (){
		//TODO 实现代码
		//所有可能的情况写在字符串中
		String content = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		//随机一个下标返回字符
		return content.charAt(random(0, content.length()-1));
	}
	/**
	 * 
	    * @Title: randomString
	    * @Description: 返回长度为length的字符串
	    * @param @param length
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	public static String randomString(int length){
		//TODO 实现代码
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < length; i++) {
			buffer.append(randomCharacter());
		}
		return buffer.toString();
	}
	/**
	 * 
	    * @Title: randomDate
	    * @Description: 在起始日期和终点日期间，随机一个日期
	    * @param @param startDate
	    * @param @param endDate
	    * @param @return    参数
	    * @return Date    返回类型
	    * @throws
	 */
	public static Date randomDate(Date startDate,Date endDate) {
		//将起始日期转化为LocalDateTime类型
		LocalDateTime start = startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		////将终点日期转化为LocalDateTime类型
		LocalDateTime end = endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		//计算日期间的毫秒差值
		long between = ChronoUnit.SECONDS.between(start, end);
		//随机一个毫秒差
		long plus = (long)(Math.random()*between);
		//起始时间加上毫秒差，即为一个随机的时间点
		start = start.plus(plus, ChronoUnit.SECONDS);
		//转化为date类型返回
		return Date.from(start.atZone(ZoneId.systemDefault()).toInstant());
	}
}
