import java.util.Scanner;


public class InanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int N=sc.nextInt();
	    int K=sc.nextInt();
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	    int count=0;
	    int[] arr=new int[N];
	    for(int i=0;i<N;i++){
	        arr[i]=sc.nextInt();
	    }

	    for(int i=0;i<N-1;i++){
	        for(int j=i+1;j<N;j++){
	            if((arr[i]+arr[j])%K==x&&(arr[i]*arr[j])%K==y){
	                count++;
	            }
	        }
	    }
	    System.out.print(count);


	}

}
