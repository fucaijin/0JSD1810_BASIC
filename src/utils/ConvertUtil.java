package utils;

/**
 * @author fucaijin
 * ת��������
 */
public class ConvertUtil {
	
	/**
	 * ��һ�������������ַ������������ڶ�������ָ���������Ķ����Ƶ��ַ�����ԭʼ������long����int������һ����ȫλ����int��long�Ķ�������
	 * @param str ����Ķ������ַ���
	 * @param type �����Ƶ��ַ�����ԭʼ����
	 * @return ���ز�ȫ�Ķ������ַ���
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
