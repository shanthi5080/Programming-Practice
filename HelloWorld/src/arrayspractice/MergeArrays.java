package arrayspractice;

public class MergeArrays {


	static int[] arr1=new int[]{1,3,4,5,7,7,9,11,13,15,17,19};
    static int[] arr2=new int[]{2,4,6,8,10,12,14,14,16,18,20,22};

    public static void main(String[] args){
        int FirstArrayLocation =0 ;
        int SecondArrayLocation=0;
        int[] mergeArr=new int[arr1.length + arr2.length];

        for ( int i=0; i<= arr1.length + arr2.length; i++){
            if (( FirstArrayLocation < arr1.length ) && (SecondArrayLocation < arr2.length)){
                if ( arr1[FirstArrayLocation] <= arr2[SecondArrayLocation]){
                    mergeArr[i]=arr1[FirstArrayLocation];
                    FirstArrayLocation++;
                }else{
                    mergeArr[i]=arr2[SecondArrayLocation];
                    SecondArrayLocation++;
                }
            }
            else if(SecondArrayLocation < arr2.length){
                    mergeArr[i]=arr2[SecondArrayLocation];
                    SecondArrayLocation++;
            }else if ( FirstArrayLocation < arr1.length ){
                    mergeArr[i]=arr1[FirstArrayLocation];
                    FirstArrayLocation++;
            }
        }//for loop
        
        System.out.println("merged array is "+ mergeArr[1]+" "+ mergeArr[2]);
        System.out.println("merged array's length is "+ mergeArr.length);
        
    }//psvm
		
}//class
		
		