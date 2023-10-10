package Array;

public class DuplicateElement2 {
	public static void main(String[] args) {
		int[] x = {1,1,2,2,3,3,4,4,5,6,7,7};
		int[] temp = new int[x.length];
		int y=0;
		for (int i = 0; i < temp.length-1; i++) {
			if (x[i]!=x[i+1]) {
				temp[y]=x[i];
				y++;
			}
		}
		temp[y]=x[x.length-1];
		for (int z = 0; z <=y; z++) {
			System.out.println(temp[z]);
		}
	}
}
