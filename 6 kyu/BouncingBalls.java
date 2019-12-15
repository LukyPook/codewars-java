public class BouncingBalls {
	public static int bouncingBall(double h, double bounce, double window) {  
		if(h > 0 && bounce > 0 && bounce < 1 && window < h) {       
			int count = 0;
			double temp = h*bounce;
			while(true) { 
				count++;
				if(temp <= window) {
					break;
				}
				else {
					count++;
					temp *= bounce;                
				}
			}
			return count;
		} 
		else {
			return -1;   
		}
	}
}