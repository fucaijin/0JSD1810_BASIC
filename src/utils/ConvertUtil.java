package utils;

/**
 * @author fucaijin
 * 转换工具类
 */
public class ConvertUtil {
	
	/**
	 * 将一个二进制数的字符串传进来，第二个参数指明传进来的二进制的字符串的原始类型是long还是int，返回一个补全位数的int或long的二进制数
	 * @param str 传入的二进制字符串
	 * @param type 二进制的字符串的原始类型
	 * @return 返回补全的二进制字符串
	 */
	public static String binaryAddAllNum(String str,String type){
		int length = str.length();
		int needAdd = 0;
		if(type.equals("int")){
			needAdd = 32 - length;
		}else if(type.equals("long")){
			needAdd = 64 - length;
		}
		StringBuilder stringBuilder = new StringBuilder();
		while(needAdd>0){
			stringBuilder.append("0");
			needAdd--;
		}
		return stringBuilder.append(str).toString();
	}
}
