package String;

public class Remove_duplicate {

	public static void main(String[] args) {

		String s1 = "aba";
		for (int i = 0; i < s1.length(); i++) {// 0<3 //1<3 //2<3 //3<3
			int count = 0;
			for (int j = 0; j < i; j++) {// 0<0 //0<1 1<1 //0<2 1<2 2<2
				if (s1.charAt(i) == s1.charAt(j)) {// b==a //a==a //a==b
					count++;// 0 //1 //0

				}

			}
			if (count == 0) {// 0==0 //1==0 //0==0

				System.out.println(s1.charAt(i));// a //b
			}

		}

	}

}
