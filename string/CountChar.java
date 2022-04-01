class CountChar {
    public int strStr(String haystack, String needle) {
        int pointer =-1;
        
		//Check if the length of both the needle or haystack are ==0 if so than you can not do the job and you finish 
        if (needle.length() == 0)
            return 0;
        if (haystack.length() == 0)
            return -1;
        
   
        
		//Save the first char of the needle - I need it in order to understand when in the main String I might have the starting point of the needle
        char cc =  needle.charAt(0);
       
		//Save the length of both strings to you can understand if the needle can stand inside the main string
        int lenHay =   haystack.length();
        int lenneedle= needle.length();
        
        for(int i=0;i<haystack.length();i++){
             //Take char by char from main string
			 char c  =  haystack.charAt(i);
			 //Compare the chars 
             if(c == cc){
			 //Check if the dimention of the main string from point i to i+leeneedle is bigger than the main string and if so than the needle can not be found in the main string from that position on since it means that we go beyond the dimention of the main string
                 if((i+lenneedle) > haystack.length())
                     return -1;
				//Save the substring
                 String aa = haystack.substring(i , i +lenneedle);
                //Check if the substring is equal with the needle and if so you save the starting point and return it
				if(needle.equals(aa))
                 {
                      pointer=i;
                      return pointer;
                 }
             }
        }
    return pointer;
    }
}
