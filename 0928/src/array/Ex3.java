package array;

public class Ex3 {
	public static void main(String[] args) {
		
		String[] names = {"RM", "뷔",
				"슈가","진","제이홉","정국","지민"
				};
		
		String[] names1 = new String[7];
		names1[0] = "RM";
		names1[1] = "쀠";
		names1[2] = "슈가";
		names1[3] = "진";
		names1[4] = "제이홉";
		names1[5] = "정국";
		names1[6] = "지민";
		
		
		// for문과 배열과의 궁합은 매우 훌륭함
		for(String name : names1) {
			System.out.println(name);
		}
		
		for(int i=0;i<names1.length;i++) {
			System.out.println(names1[i]);
		}
		
	}//main() end
	
}//Ex3 end
