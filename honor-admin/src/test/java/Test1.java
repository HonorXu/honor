
public class Test1 {

	public static void main(String[] args) {

		int a = 1;// "正方形";
		int b = 2;// "三角形";
		int c = 3;// "菱形";
		int d = 4;// "圆";
		int e = 0;// "空白";
		A a2 = new A();
		int arr[][] = new int[6][6];
		for (int i = 0; i < 5; i++) { // 行
			int[][] find = a2.find(arr,i);
		}
	}
	
}

class A {

	int total = 0;

	/**
	 * 图形出现次数
	 * 
	 * @param arr
	 * @param num 图形
	 * @return
	 */
	public boolean rule(int arr[][], int i, int j, int num) {

		if (arr[i][j] == num)
			total++;

		if (num != 0) {
			return total == 1 ? true : false;
		} else {
			return total == 2 ? true : false;
		}
	}
	
	public int[][] find(int[][]arr,int num) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 0;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				//初始化列	
				arr[i][0] = 1;
				if(i+1<6)	arr[i+1][1] = 4;
				if(i+1<6) arr[i+1][2] = 2;
				if(i+1<6) arr[i+1][3] = 1;
				if(i+1<6) arr[i+1][5] = 1;
				
				if(5-i>0)	arr[5-i][0] = 4;
				if(5-i>0)	arr[5-i][1] = 2;
				if(5-i>0)	arr[5-i][2] = 1;
				
				//初始化行
				if(j+1<6) 	arr[1][j+1] = 4;
					arr[4][j] = 3;
					arr[5][j] = 1;

					if(5-j-1>0)	arr[2][5-j-1] = 2;
					if(5-j-1>0)	arr[4][5-j-1] = 1;
					if(5-j-1>0)	arr[5][5-j] = 3;
				
				if (rule(arr, i, j, num)) {
					arr[i][j] = num;
					//find(arr,num + 1);
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println("\n");
		}

		return arr;
	}

}

