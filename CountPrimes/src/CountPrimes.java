
public class CountPrimes {

    public int countPrimes(int n) {
        
    	boolean prime = false;
    	int counter = 0;
    	for(int i = 0; i < n ; i ++	){
    		
    		prime = determinePrime(i);
    		if(prime == true){
    			counter++;
    		}
    	}
    	
    	return counter;
    }
    
    public boolean determinePrime(int n){
    	
    	if( n == 2){
    		return true;
    	}
    	
        if(n == 1 ){
            return false;
        }
    	
    	if(n % 2 == 0){
    		return false;
    	}
    	
    	for(int i = 3; i * i <= n; i += 2){
    		
    		if( n % i == 0){
    			return false;
    		}
    	}
    	
    	return true;
    }
	
	public static void main(String[] args) {

		CountPrimes cp = new CountPrimes();
		int i = cp.countPrimes(3);
		
		System.out.println(i);
		
	}

}
