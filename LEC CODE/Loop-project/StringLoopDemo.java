public class StringLoopDemo {

    public static void main (String [] args) {
     
        String str = "Wonderful.";
        printChars(str);
        System.out.println("");
        printOddChars(str);
        System.out.println("");
        printFirstFiveChars(str);
        System.out.println("");
        boolean result = containsChar(str, 'f');
        System.out.println(result);
    }

    public static void printChars(String inputStr) {
        for(int i=0; i<inputStr.length(); i++) { 
            System.out.print(inputStr.charAt(i));
        } 
    }
    
    public static void printOddChars(String inputStr) {
        for(int i=1; i<inputStr.length(); i+=2) { 
            System.out.print(inputStr.charAt(i));
        } 
    }
    
    public static void printFirstFiveChars(String inputStr) {
        for(int i=0; i<5; i++) { 
            System.out.println(inputStr.charAt(i));
        } 
    }
    
    public static boolean containsChar(String inputStr, char target) {
        boolean found = false;
        char curChar;
        for (int i=0; i<inputStr.length(); i++) { 
            curChar = inputStr.charAt(i);
            if (curChar == target) 
                found = true;
        }
        return found;
    }
    
    public static boolean containsCharEarlyExit(String inputStr, char target) {
        boolean found = false;
        char curChar;
        for (int i=0; i<inputStr.length(); i++) { 
            curChar = inputStr.charAt(i);
            if (curChar == target) {
                found = true;
                break;
            }
        }
        return found;
    } 
    
}




    
    
    
    