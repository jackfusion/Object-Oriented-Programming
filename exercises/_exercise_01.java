/*
What does the uglify_word do?
It checks the char in the given string from the front with an iteration, 
in the iteration it does these steps:
There is a flag and it will be started from 1.
Check the current char in the iteration index.
- If it is an alphabet character [a-zA-Z] and the flag value is equal to 1, 
	then change this character to upper case.
- If it is an alphabet character [a-zA-Z] and the flag value is equal to 0, 
	then change this character to lower case.
	
	
  Otherwise, if it is not an alphabet character, then set the flag value to 1.
  
- If the current char is an alphabet character, do a boolean NOT (!) operation to the flag.
After the iteration has done, return the fixed string that might have been changed in such iteration.
Examples
uglify_word("aaa") === "AaA"
uglify_word("AAA") === "AaA"
uglify_word("BbB") === "BbB"
uglify_word("aaa-bbb-ccc") === "AaA-BbB-CcC"
uglify_word("AaA-BbB-CcC") === "AaA-BbB-CcC"
uglify_word("eeee-ffff-gggg") === "EeEe-FfFf-GgGg"
uglify_word("EeEe-FfFf-GgGg") === "EeEe-FfFf-GgGg"
uglify_word("qwe123asdf456zxc") === "QwE123AsDf456ZxC" 
uglify_word("Hello World") === "HeLlO WoRlD"
*/

public class _exercise_01 {

    public static String uglifyWord(String str) {

        boolean flag = true;
        String res = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                res += flag ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
                flag = !flag;
            } else {
                flag = true;
                res += ch;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(uglifyWord("AAA"));
    }

}