public class StringBufferMethod{
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Ajay");
        sb.append(" Gangwar");
        int ab = sb.capacity();  // 20
        sb.deleteCharAt(0) ;
        System.out.println(sb);  // Gangwar
        sb.insert(0 , "Mr.");
        System.out.println(sb);  // Mr. Gangwar
        sb.insert(3 , "A");
        System.out.println(sb);
        System.out.println(ab);
         
    }

}