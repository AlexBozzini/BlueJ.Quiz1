 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int result = 1;
          for (int i = 1; i <= number; i++){
          result = result * i;
      }
      return result;
    }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
        String s = "";
        int length = phrase.length();
        String initial = (char)(phrase.charAt(0)) + "";
        for (int i = 1; i <= length; i++){
        char c = (char)(phrase.charAt(i - 1));
        String prev = c + "";
        if (prev.equals(" ")){
            s += (char)(phrase.charAt(i));
        } else {
            continue;
        }
    }
    String result = s.toUpperCase();
          return initial.toUpperCase() + result;
        
    }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          String s = "";
          int length = word.length();
          for (int x = 0; x < length; x++){
              char c = (char)(word.charAt(x) + 3);
              if (c > 'z'){
                  s += (char)(word.charAt(x) - (26 - 3));
                } else {
                    s += (char)(word.charAt(x) + 3);
                }
            }
          return s;
    }
}
