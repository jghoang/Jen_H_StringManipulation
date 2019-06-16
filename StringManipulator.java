public class StringManipulator {
    public String trimAndConcat(String s, String s1){
        String result = s.trim() + s1.trim();
        return result;
    }
    public Integer getIndexOrNull(String s, char c){
        if(s.indexOf(c) >=0){
            return s.indexOf(c);
        }
        else {
            return null;
        }
    }
    public Integer getIndexOrNull(String s, String s2){
        if(s.indexOf(s2) >=0){
            return s.indexOf(s2);
        }
        else {
            return null;
        }
        }

    public String concatSubstring(String s, int a, int b, String s2){
        return s.substring(a, b).concat(s2);
    }
    
}