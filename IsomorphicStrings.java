import java.util.HashMap;

public class IsomorphicStrings {
    
    public static boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> map= new HashMap<>();
       
        if(s.length()!=t.length()){
            return false;
        }
        
        for(int i= 0; i< s.length(); i++){
            char x= s.charAt(i);
            char y= t.charAt(i);
            
            if(map.containsKey(x)){
                if(map.get(x)!=y){
                    return false;
                }
            }
            else{
                if(map.containsValue(charT)){
                    return false;
                }
                map.put(charS, charT);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "egg";
        String t1 = "add";
        System.out.println(isIsomorphic(s1, t1)); // Output: true

        String s2 = "foo";
        String t2 = "bar";
        System.out.println(isIsomorphic(s2, t2)); // Output: false

        String s3 = "paper";
        String t3 = "title";
        System.out.println(isIsomorphic(s3, t3)); // Output: true
    }
}
