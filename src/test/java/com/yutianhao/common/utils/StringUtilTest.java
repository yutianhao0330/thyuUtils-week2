package com.yutianhao.common.utils;

import org.junit.Test;
/**
 * 
    * @ClassName: StringUtilTest
    * @Description: 字符串工具类测试类
    * @author thyu
    * @date 2020年3月30日
    *
 */
public class StringUtilTest {
	/**
	 * 
	    * @Title: testHasLength
	    * @Description: 测试: 判断源字符串是否有值，空引号(空白字符串)也算没值
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void testHasLength() {
		System.out.println(StringUtil.hasLength(null));
		System.out.println(StringUtil.hasLength(""));
		System.out.println(StringUtil.hasLength("  "));
		System.out.println(StringUtil.hasLength("abcd"));
	}
	/**
	 * 
	    * @Title: testHasText
	    * @Description: 测试: 判断源字符串是否有值，空引号(空白字符串)和空格也算没值 
	    * @param @return    参数
	    * @return boolean    返回类型
	    * @throws
	 */
	@Test
	public void testHasText(){
		//TODO 实现代码
		System.out.println(StringUtil.hasText(null));
		System.out.println(StringUtil.hasText(""));
		System.out.println(StringUtil.hasText("  "));
		System.out.println(StringUtil.hasText("abcd"));
	}
	/**
	 * 
	    * @Title: testRandomChinese
	    * @Description: 测试:返回一个中文汉字字符串,字符集必须在GB2312范围内
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void testRandomChinese() {
		for(int i=0;i<1000;i++) {
			System.out.print(StringUtil.randomChinese());
			if(i%10==9) {
				System.out.println();
			}
		}
	}
	/**
	 * 
	    * @Title: testRandomChineseString
	    * @Description: 测试:返回参数length个中文汉字字符串,字符集必须在GB2312范围内
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void testRandomChineseString() {
		for(int i=0;i<10;i++) {
			System.out.print(StringUtil.randomChineseString(5));
			System.out.println();
		}
	}
	/**
	 * 
	    * @Title: testGenerateChineseName
	    * @Description: 测试: 随机一个中文姓名，百家姓开头, 名字为1-2个随机汉字
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void testGenerateChineseName() {
		for(int i=0;i<100;i++) {
			System.out.print(StringUtil.generateChineseName());
			System.out.println();
		}
	}
}
