public class StringPractise3 {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
   //1.      
        /*
        String str1="Pyramid";
        String str2="pyramid";
        
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        //System.out.println(str1==str2);
        */
        
        /*
        //String str1="pyramid";
        
        String str1="china wall";
        String str2=new String("china tall");
        
        //System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));
        */
        
        
        String str1="the great wall ";
        String str2="of china";
        System.out.println(str1.contains("wall"));
        System.out.println(str1.concat(str2));//System.out.println(str1 + str2);
       
        
        //2.
       
                /*String str1="f";
                System.out.println(str1.matches("."));*/
                
                /*String str1="a";//b,c
                System.out.println(str1.matches("[abc]"));*/
                
                /*String str1="p";//true for alphabets other than abc
                System.out.println(str1.matches("[^abc]"));*/
                
                /*String str1="7";//A,a7
                System.out.println(str1.matches("[a-zA-Z0-9]"));//[a-z][0-9]*/
                
                /*String str1="b";
                System.out.println(str1.matches("a|b"));*/
                
                /*String str1="b";
                System.out.println(str1.matches("\\w"));*/
                
                /*String str1="5";
                System.out.println(str1.matches("\\d"));*/
                
                // String str1="$";
                // System.out.println(str1.matches("\\D"));
          

            
            //3. 

              /*String str1="abcdef";//ab6cdef,abBcdef
        System.out.println(str1.matches("[abc]*"));*/
        
        
        /*String str1="accbdefg";//accb
        System.out.println(str1.matches("[abc]{3,7}"));*/
        
        // String str1="john@gmail.com";
        //System.out.println(str1.matches(".*gmail.*"));
        // System.out.println(str1.matches("\\w*@gmail(.*)"));
    }
    
}