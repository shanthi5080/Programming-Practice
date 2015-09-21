package arrayspractice;

public class MergedArraysFinnal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[]a ={1,3,5,7};
 int[]b={6,7,8,10};
 
 int []c=new int[a.length+b.length];
 for(int i=0;i<a.length;i++){
	 c[i]=a[i];
 }
 
 for(int i=0;i<b.length;i++){
	 c[i+a.length]=b[i];
 }
 for(int i=0;i<c.length;i++){
	 System.out.print(c[i]+" ");
	
	 
	}

 }
}
