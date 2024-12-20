package RgPractise;

class Test1 {
   /* // A Generic method example
    static <T> void genericDisplay(T str)
    {
        System.out.println(str.getClass().getName()
                           + " = " + str);
    }
 
    // Driver method
    public static void main(String[] args)
    {
        // Calling generic method with Integer argument
        genericDisplay(11);
 
        // Calling generic method with String argument
        genericDisplay("GeeksForGeeks");
 
        // Calling generic method with double argument
        genericDisplay(1.0);
    }*/
	 public static void main(String[] args) {  
	        String s1 = "0123456789";  
	        byte[] barr = s1.getBytes();  
	        for(int i=0;i<barr.length;i++){  
	            System.out.println(barr[i]);  
	        }  
	        // Getting string back   
	        String s2 = new String(barr);  
	        System.out.println(s2);  
	    } 
}