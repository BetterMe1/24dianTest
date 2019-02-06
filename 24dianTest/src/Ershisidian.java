import java.util.Random;

public class Ershisidian { 	
	static String yunsuan[] = { "+", "-", "*", "/" }; 
	public static void main(String args[]) {
		/**
		 * 随机生成4个代表扑克牌牌面的数字，放进数组array[]
		 */
		int [] array=new int[4];
		Random random = new Random();  
	        for(int i = 0; i < 4; i++) { 
	        	int temp=random.nextInt(12)+1;
	        	array[i]=temp;
	        	//输出牌面数字
	            System.out.println("随机生成的第"+(i+1)+"张扑克牌牌面数字为:"+array[i]);  
	        }  
	        /**
	         * 列出可计算出24的表达式
	         * 利用for循环遍历所有数字与运算符号组成的式子，将结果为24的表达式输出
	         */
	        String [] biaoda=new String[13];
	        for (int i = 0; i < 4; i++) {	
	        	for (int j = 0; j < 4; j++) {
	        		if (i == j) {
	        			continue;		
	        			}
	        		for (int x = 0; x < 4; x++) {	
	        			if (x == j || x == i) {		
						continue;				
						}					
	        			for (int y = 0; y < 4; y++) {	
	        				if (y == i || y == x || y == j) {	
							continue;					
							}
	        				//调用Test(int a, int b, String x)函数来遍历运算符号
	        				for (int jia = 0; jia < 4; jia++) {		
	        					int sum = 0;
	        					sum = Test(array[i], array[j], yunsuan[jia]);	
	        					for (int jian = 0; jian < 4; jian++) {			
	        						int sum1 = 0;	
	        						sum1 = Test(sum, array[x], yunsuan[jian]);	
	        						for (int cheng = 0; cheng < 4; cheng++) {	
	        							int sum2 = 0;	
	        							sum2 = Test(sum1, array[y], yunsuan[cheng]);
	        							//将可计算出24的表达式输出
										if (sum2 == 24){
	        								biaoda[0]="((("+ array[i] + yunsuan[jia] + array[j]+")" + yunsuan[jian] + array[x]+")" + yunsuan[cheng] + array[y]+")";
	        								System.out.println("可计算出24的表达式为："+biaoda[0]+"="+sum2);
										}	
	        					} 			
	        				}			
	        			}		
	        		}	
	        	}
	        }
	    }
	}
	/**
	 * 函数Test(int a, int b, String x)来定义数与数之间的加、减、乘、除
	 * a、b为参与运算的两个数
	 * x为运算符号
	 * @param a
	 * @param b
	 * @param x
	 * @return
	 */
public static int Test(int a, int b, String x) {
	if (x.equals("+")) {	
		return a + b;	
		} 
	else if (x.equals("-")) {
		return a - b;	
		} 
	else if (x.equals("*")) {
		return a * b;		
		}
	else{	
		return a / b;	
	}	
	}
}

