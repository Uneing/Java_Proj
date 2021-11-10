package ArrayType04;

public class ArrayType {

	public static void main(String[] args) {
		/* 배열 
		 * -같은 데이터형을 가진 기억장소여러개의 모음
		 * -배열변수의 선언형식
		 * 데이터타입[] 이름;
		 * 
		 * 데이터 타입 이름 [];
		 * 
		 * 1 배열객체의 생성
		 * ex) int[] intArray; or int intArray[];
		 * 
		 * 2 배열객체의 초기화
		 * -선언과 동시에 초기화
		 * 		타입[] 변수={1,2,3,}
		 * 		타입 변수[]={1,2,3,}
		 * -new 연산자로 선언후 초기화
		 * 		타입[] 변수 = new 타입[길이]
		 * 
		 *	특징
		 *모든 배열형의 변수는 참조변수이다. (배열은 객체)
		 *같은 타입만 저장가능하다 (선언과 동시에 타입이 결정)
		 *길이가 고정되어 있음
		 */
		
		//초기화
		// 선언과 동시에 초기화
		int[] intArray = {10,20,30,40,50};
		for(int i =0;i<intArray.length;i++) {
			//System.out.println("intArray : "+intArray);//메모리주소
			System.out.printf("intArray[%d] : %d%n", i,intArray[i]);
		}
		
		// 2 선언 후 new연산자로 초기화
		int[] intArray2;
		//intArray2 = {10,20,30,40,50}; //[x]선언과 동시에 초기화 해야 됨
		
		intArray2 = new int[]{10,20,30,40,50};
		for(int i =0;i<intArray2.length;i++) {
			//System.out.println("intArray : "+intArray);//메모리주소
			System.out.printf("intArray[%d] : %d%n", i,intArray2[i]);
		}
		String strArray[];
		//String strArray[] = new String[2];
		strArray = new String[] {"이순신","강감찬","김자바"};
		for(int i=0;i<strArray.length;i++) {
			System.out.printf("strArray[%d] : %s%n",i,strArray[i]);
		}
		
		/* 다차원 배열
		 * 
		 * 타입[][] 변수 = {{1,2,},{1,2,},   }
		 */
		int[][] intnArray = {{10,20,30,40,50,},{60,70,80,90,100}};
		for(int i=0;i<intnArray.length;i++) {
			for(int j=0;j<intnArray[i].length;j++) {
				System.out.printf("%d, %d:%d%n",i,j,intnArray[i][j]);
			}
		}
		for(int[] i : intnArray) {
			for(int j:i) {
				System.out.printf("%d%n",j);
			}
		}
		
	}

}
