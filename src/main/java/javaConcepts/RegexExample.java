package javaConcepts;

public class RegexExample {
    public static void main(String[] args) {
        StringBuilder regex = new StringBuilder();
        //it starts witha  string
        regex.append("^");
        // it includes atleast one number
        //?= is for lookahead
        //*. for one or more
        regex.append("(?=.*[0-9]{1,3})");
        //it includes one lowercase letter
        regex.append("(?=.*[a-z])");
        //it includes atleast one upper case
        regex.append("(?=.*[A-Z]{1,2})");
        //atleast one special character
        regex.append("(?=.*[@#$%&])");
        //max length is 7-12
        regex.append(".{7,15}");
        //end of string
        regex.append("$");


        System.out.println("Instagram1$".matches(regex.toString()));

    }
}
