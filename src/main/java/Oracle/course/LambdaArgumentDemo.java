package Oracle.course;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LambdaArgumentDemo {
    static String changeStr(StringFunc sf, String input) {
        return sf.func(input);
    }


    public static void main(String[] args) {

        String input = "Hello world";
        String output;
        StringFunc reverse = (str) -> {
            String ret = "";
            for (int i=input.length()-1; i>=0; i--) {
                ret +=str.charAt(i);
            }
            return ret;
        };
        output = changeStr(reverse, input);
        System.out.println("The reverse output is: " + output);

        output = changeStr((str) -> str.replace(" ", "-"), input);
        System.out.println("The hyphen output is: " + output);

        output = changeStr((str) -> {
                    String ret = "";
                    for (int i=0; i< str.length(); i++) {
                        char c = str.charAt(i);
                        if (Character.isUpperCase(c)) {
                            ret +=Character.toLowerCase(c);
                        } else  {
                            ret+= Character.toUpperCase(c);
                        }
                    }
                    return ret;
                }
                , input);

        System.out.println("The Upper Lower output is: " + output);


    }

}
