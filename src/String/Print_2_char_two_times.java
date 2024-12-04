
package String;

public class Print_2_char_two_times {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "";
		int times = 3;
		for (int i = 0; i < s1.length(); i++) {//0<3 //1<3 //2<3 //3<3
			String s3 = "";
			for (int j = 0; j < times; j++) {//0<3 1<3 2<3 3<3 //0<3 1<3 2<3 3<3
				s3 = s3 + s1.charAt(i);//""+a a+a aa+a//""+b b+b bb+b //""+c c+c cc+c
			}

			char ch = s1.charAt(i);
			s2 = s2 + s3;//""+aaa aaa+bbb aaabbb+ccc

		}
		System.out.println(s2);

	}

}
