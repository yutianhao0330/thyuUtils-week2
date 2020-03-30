package com.yutianhao.testMethod;
/**
 * 
    * @ClassName: TestMethod
    * @Description: 测试类: 测试工具类方法
    * @author thyu
    * @date 2020年3月30日
    *
 */

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.yutianhao.common.utils.RandomUtil;
import com.yutianhao.common.utils.StringUtil;
import com.yutianhao.testBean.Person;

public class TestMethod {
	/**
	 * 
	    * @Title: testCreatePersons
	    * @Description: 测试: 批量生成1万个Person对象并在控制台输出
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void testCreatePersons() {
		//设置好注册日期的起始时间
		Calendar start = Calendar.getInstance();
		start.set(2010, 0, 1);
		//需要生成的记录数
		int num = 10000;
		List<Person> personList = new ArrayList<Person>(10000);
		for(int i=0;i<num;i++) {
			//创建person对象
			Person person = new Person();
			//生成姓名
			person.setName(StringUtil.generateChineseName());
			//生成年龄
			person.setAge(RandomUtil.random(1, 120));
			//生成介绍
			person.setAbout(StringUtil.randomChineseString(140));
			//生成注册日期
			person.setCreate(RandomUtil.randomDate(start.getTime(), new Date()));
			//添加到集合中
			personList.add(person);
		}
		//输出生成的10000条person数据
		for (int i=0;i<personList.size();i++) {
			System.out.println((i+1)+":"+personList.get(i));
		}
	}
}
