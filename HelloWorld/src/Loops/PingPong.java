package Loops;

public class PingPong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int sum =0;
				
				for(int i=1;i<=20;i++){
					
					//sum+=i;
					if (i%3==0){
						System.out.println(" ping  "+" " +i);
								}
						if(i%5==0){
							System.out.println(" pong " +" " + i);
						
								}
						
						if ((i%3==0)&&(i%5==0)){
							System.out.println("  ping pong " +" " + i);
							
						}
						
				}

	}

}
