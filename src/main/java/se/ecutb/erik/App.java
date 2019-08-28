package se.ecutb.erik;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //                   0123456789
        String someString = "Hej svejs!";
        someString = someString.substring(0,3).substring(1);
        System.out.println(someString);

        String anotherString = "Erik Svensson";
        //Få ett char array från en String
        char[] stringAsArray = anotherString.toCharArray();
        //Få en String från en char array
        String fromArray = String.copyValueOf(stringAsArray);

    }
}
