import java.util.Random;

public class Ershisidian { 	
	static String yunsuan[] = { "+", "-", "*", "/" }; 
	public static void main(String args[]) {
		/**
		 * �������4�������˿�����������֣��Ž�����array[]
		 */
		int [] array=new int[4];
		Random random = new Random();  
	        for(int i = 0; i < 4; i++) { 
	        	int temp=random.nextInt(12)+1;
	        	array[i]=temp;
	        	//�����������
	            System.out.println("������ɵĵ�"+(i+1)+"���˿�����������Ϊ:"+array[i]);  
	        }  
	        /**
	         * �г��ɼ����24�ı��ʽ
	         * ����forѭ�������������������������ɵ�ʽ�ӣ������Ϊ24�ı��ʽ���
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
	        				//����Test(int a, int b, String x)�����������������
	        				for (int jia = 0; jia < 4; jia++) {		
	        					int sum = 0;
	        					sum = Test(array[i], array[j], yunsuan[jia]);	
	        					for (int jian = 0; jian < 4; jian++) {			
	        						int sum1 = 0;	
	        						sum1 = Test(sum, array[x], yunsuan[jian]);	
	        						for (int cheng = 0; cheng < 4; cheng++) {	
	        							int sum2 = 0;	
	        							sum2 = Test(sum1, array[y], yunsuan[cheng]);
	        							//���ɼ����24�ı��ʽ���
										if (sum2 == 24){
	        								biaoda[0]="((("+ array[i] + yunsuan[jia] + array[j]+")" + yunsuan[jian] + array[x]+")" + yunsuan[cheng] + array[y]+")";
	        								System.out.println("�ɼ����24�ı��ʽΪ��"+biaoda[0]+"="+sum2);
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
	 * ����Test(int a, int b, String x)������������֮��ļӡ������ˡ���
	 * a��bΪ���������������
	 * xΪ�������
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

