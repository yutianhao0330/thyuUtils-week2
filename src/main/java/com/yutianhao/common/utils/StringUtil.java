package com.yutianhao.common.utils;

import java.io.UnsupportedEncodingException;

/**
 * 
    * @ClassName: StringUtil
    * @Description: 字符串工具类
    * @author thyu
    * @date 2020年3月30日
    *
 */
public class StringUtil {
	/**
	 * 
	    * @Title: hasLength
	    * @Description: 判断源字符串是否有值，空引号(空白字符串)也算没值
	    * @param @param src
	    * @param @return    参数
	    * @return boolean    返回类型
	    * @throws
	 */
	public static boolean hasLength(String src){
		//TODO 实现代码
		return null!=src && src.length()>0;
	}
	/**
	 * 
	    * @Title: hasText
	    * @Description: 判断源字符串是否有值，空引号(空白字符串)和空格也算没值 
	    * @param @param src
	    * @param @return    参数
	    * @return boolean    返回类型
	    * @throws
	 */
	public static boolean hasText(String src){
		//TODO 实现代码
		return null!=src && src.trim().length()>0;
	}
	/**
	 * 
	    * @Title: randomChineseString
	    * @Description: 返回参数length个中文汉字字符串,字符集必须在GB2312范围内
	    * @param @param length
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	public static String randomChineseString(int length){
		//TODO 实现代码
		StringBuffer buffer = new StringBuffer();
		//循环调用length次生成一个中文字符的方法，生成随机的length个中文汉字字符拼接为stringbuffer
		for(int i = 0;i<length;i++) {
			buffer.append(randomChinese());
		}
		//返回满足条件的字符串
		return buffer.toString();
	}
	/**
	 * 
	    * @Title: randomChinese
	    * @Description: 返回一个中文汉字字符串,字符集必须在GB2312范围内
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	public static String randomChinese() {
		//创建byte数组
		byte[] bytes = new byte[2];
		//根据GB2312的编码范围，16-55区为一级汉字，高位范围为B0-D7，十进制即为176-215
		int highVal = RandomUtil.random(176, 215);
		//根据GB2312的编码范围，高位范围为A1-FE，十进制即为161-254，每个区94个汉字
		int lowVal = RandomUtil.random(161, 254);
		//将byte数组的低位和高位赋值
		bytes[0] = new Integer(highVal).byteValue();
		bytes[1] = new Integer(lowVal).byteValue();
		String chinese = null;
		try {
			//生成随机中文字符
			chinese = new String(bytes, "GB2312");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return chinese;
	}
	/**
	 * 
	    * @Title: generateChineseName
	    * @Description: 随机一个中文姓名，百家姓开头, 名字为1-2个随机汉字
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	public static String generateChineseName(){
		//TODO 实现代码
		StringBuffer buffer = new StringBuffer();
		//所有姓氏放到数组里
		String[] firstNames = {"赵","钱","孙","李","周","吴","郑","王","冯","陈","楮","卫","蒋","沈","韩","杨","朱","秦","尤","许","何","吕","施","张","孔","曹","严","华","金","魏","陶","姜","戚","谢","邹","喻","柏","水","窦","章","云","苏","潘","葛","奚","范","彭","郎","鲁","韦","昌","马","苗","凤","花","方","俞","任","袁","柳","酆","鲍","史","唐","费","廉","岑","薛","雷","贺","倪","汤","滕","殷","罗","毕","郝","邬","安","常","乐","于","时","傅","皮","卞","齐","康","伍","余","元","卜","顾","孟","平","黄","和","穆","萧","尹","姚","邵","湛","汪","祁","毛","禹","狄","米","贝","明","臧","计","伏","成","戴","谈","宋","茅","庞","熊","纪","舒","屈","项","祝","董","梁","杜","阮","蓝","闽","席","季","麻","强","贾","路","娄","危","江","童","颜","郭","梅","盛","林","刁","锺","徐","丘","骆","高","夏","蔡","田","樊","胡","凌","霍","虞","万","支","柯","昝","管","卢","莫","经","房","裘","缪","干","解","应","宗","丁","宣","贲","邓","郁","单","杭","洪","包","诸","左","石","崔","吉","钮","龚","程","嵇","邢","滑","裴","陆","荣","翁","荀","羊","於","惠","甄","麹","家","封","芮","羿","储","靳","汲","邴","糜","松","井","段","富","巫","乌","焦","巴","弓","牧","隗","山","谷","车","侯","宓","蓬","全","郗","班","仰","秋","仲","伊","宫","宁","仇","栾","暴","甘","斜","厉","戎","祖","武","符","刘","景","詹","束","龙","叶","幸","司","韶","郜","黎","蓟","薄","印","宿","白","怀","蒲","邰","从","鄂","索","咸","籍","赖","卓","蔺","屠","蒙","池","乔","阴","郁","胥","能","苍","双","闻","莘","党","翟","谭","贡","劳","逄","姬","申","扶","堵","冉","宰","郦","雍","郤","璩","桑","桂","濮","牛","寿","通","边","扈","燕","冀","郏","浦","尚","农","温","别","庄","晏","柴","瞿","阎","充","慕","连","茹","习","宦","艾","鱼","容","向","古","易","慎","戈","廖","庾","终","暨","居","衡","步","都","耿","满","弘","匡","国","文","寇","广","禄","阙","东","欧","殳","沃","利","蔚","越","夔","隆","师","巩","厍","聂","晁","勾","敖","融","冷","訾","辛","阚","那","简","饶","空","曾","毋","沙","乜","养","鞠","须","丰","巢","关","蒯","相","查","后","荆","红","游","竺","权","逑","盖","益","桓","公","晋","楚","阎","法","汝","鄢","涂","钦","岳","帅","缑","亢","况","后","有","琴","商","牟","佘","佴","伯","赏","墨","哈","谯","笪","年","爱","阳","佟","万俟","司马","上官","欧阳","夏侯","诸葛","闻人","东方","赫连","皇甫","尉迟","公羊","澹台","公冶","宗政","濮阳","淳于","单于","太叔","申屠","公孙","仲孙","轩辕","令狐","锺离","宇文","长孙","慕容","鲜于","闾丘","司徒","司空","丌官","司寇","仉","督","子车","颛孙","端木","巫马","公西","漆雕","乐正","壤驷","公良","拓拔","夹谷","宰父","谷梁","段干","百里","东郭","南门","呼延","归","海","羊舌","微生","梁丘","左丘","东门","西门","南宫"};
		//从数组中随机生成一个姓
		buffer.append(firstNames[RandomUtil.random(0, firstNames.length-1)]);
		//随机生成一个名字，为1到2位的随机中文
		buffer.append(randomChineseString(RandomUtil.random(1, 2)));
		return buffer.toString();
	}
}
