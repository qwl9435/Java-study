
public class JiugonggeSum {
//体验不同二维数组赋值方式
	public static void main(String[] args) {
	int Elements1[][] = {{1,2,3},{4,5,6},{7,8,9}};
	int Elements2[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
	int Elements3[][] = new int[3][3];
	Elements3[0] = new int[] {1,2,3};
	Elements3[1] = new int[] {4,5,6};
	Elements3[2] = new int[] {7,8,9};
	int i=0,j=0,s1=0,s2=0,s3=0,s12=0,s22=0,s32=0;
	while (i <= 2) {
		for (j=0; j <= 2; j++) {
			s1+=Elements1[i][j];
			s2+=Elements2[i][j];
			s3+=Elements3[i][j];
		}
		i++;
	}
	System.out.println(s1+"\n"+s2+"\n"+s3+"\n");  
	//尝试foreach循环
	}

}
