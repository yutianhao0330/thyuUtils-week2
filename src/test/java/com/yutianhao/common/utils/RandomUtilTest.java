package com.yutianhao.common.utils;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;
/**
 * 
    * @ClassName: RandomUtilTest
    * @Description: 随机数工具类的测试类
    * @author thyu
    * @date 2020年3月30日
    *
 */
public class RandomUtilTest {
	/**
	 * 
	    * @Title: testRandom
	    * @Description: 测试: 返回min-max之间的随机整数
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void testRandom() {
		for (int i = 0; i < 10; i++) {
			int random = RandomUtil.random(0, 2);
			System.out.print(random+" ");
		}
	}
	/**
	 * 
	    * @Title: testSubRandom
	    * @Description: 测试: 在最小值min与最大值max之间截取subs个不重复的随机数
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void testSubRandom() {
		for(int i = 0;i<10;i++) {
			int[] random = RandomUtil.subRandom(1, 10, 5);
			System.out.println(Arrays.toString(random));
		}
	}
	/**
	 * 
	    * @Title: testRandomCharacter
	    * @Description: 测试: 随机返回1个1-9,a-Z之间的随机字符
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void testRandomCharacter() {
		for(int i = 0;i<500;i++) {
			System.out.print(RandomUtil.randomCharacter());
		}
	}
	/**
	 * 
	    * @Title: testRandomString
	    * @Description: 测试: 返回长度为length的字符串
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void testRandomString() {
		for(int i = 0;i<10;i++) {
			System.out.println(RandomUtil.randomString(36));
		}
	}
	/**
	 * 
	    * @Title: testRandomDate
	    * @Description: 测试:在起始日期和终点日期间，随机一个日期
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void testRandomDate() {
		//生成起始日期和结束日期
		Calendar start = Calendar.getInstance();
		start.set(1998, 0, 1, 0,0,0);
		Calendar end = Calendar.getInstance();
		//循环输出随机的时间
		for(int i = 0;i<100;i++) {
			Date randomDate = RandomUtil.randomDate(start.getTime(), end.getTime());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(sdf.format(randomDate));
		}
	}
}
