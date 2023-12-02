package questions.stack;


//https://leetcode.com/problems/make-the-string-great/
public class MakeGood {
    public  String makeGood(String s) {
        boolean isThereBadStrings= true;
        do {
            isThereBadStrings= false;
            for (int i = 0; i < s.length()-1; i++) {
                String element = String.valueOf(s.charAt(i));
                String elementNext = String.valueOf(s.charAt(i+1));
                if (!elementNext.equals(element)){
                    if (elementNext.toLowerCase().equals(element.toLowerCase())){
                        String temp= s.replaceAll(element+elementNext,"");
                        s= temp;
                        isThereBadStrings= true;
                        break;
                    }
                }
            }
        }while (isThereBadStrings);

        return s;
    }
}
