public class EmailParser {
    public static void main(String[] args) {
        String email = "samlee@yofhs.org";
        //0.m 1.a 2.y 3.a 4."." 5.c 6.o 7.h 
        // 1. length  2. index of @  3. user and domain
        int at = email.indexOf("@");
        System.out.println(at);

        String user = email.substring(0, at);
        String domain = email.substring(at + 1);

        System.out.println("username: " + user);
        System.out.println("domain: " + domain);
        int dot = email.indexOf(".");
        String firstName = email.substring(0,dot);
        String lastName = email.substring(dot + 1, at);

        System.out.println(firstName + " " + lastName);

        String firstInitial = firstName.substring(0,1);
        String lastInitial = lastName.substring(0,1);
        String lastName2 = lastName.substring(1);

        System.out.println(lastInitial.toUpperCase() + lastName2 + ", " + firstInitial.toUpperCase());

        char first = user.charAt(0);
        char last = user.charAt(user.length()- 1);

        System.out.println(first + " " + last);

        //output for email sam.lee@yofhs.org
        //7
        //username: same.lee
        //domain: yofhs.org
        //same lee
        //lee,s
        // se
        // output for email samlee@yofhs.org
        //6
        //user: samlee
        //domain: yofhs.org
        //exception in thread "main" java.lang.stringIndexoutofboundsexception: begin 13, end 6, length 16
        // at java.base/java.lang.string.checkboundbeginend(string.jav:4606)
        // at java.base/java.lang.string.substring(string.java:2709)
        // at emailparser.main(emailparser.java:19)
        }
