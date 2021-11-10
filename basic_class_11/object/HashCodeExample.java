package basic_class_11.object;

import java.util.Objects;
class Student4{
		int sno;
		String name;
		Student4(int sno, String name){
			this.sno = sno;
			this.name = name;
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Student4) {
				Student4 std = (Student4)obj;
				if(sno == std.sno && name == std.name) {
					return true;
				}else {
					return false;
				}
			}
			return false;
		}

		public int hashCode() {
			return Objects.hash(sno, name);
		}
	}
public class HashCodeExample {

	public static void main(String[] args) {
		Student4 s1 = new Student4(1, "홍길동");
		Student4 s2 = new Student4(1, "홍길동");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
	}
	

}
