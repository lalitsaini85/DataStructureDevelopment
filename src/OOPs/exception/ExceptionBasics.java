package OOPs.exception;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 2/3/2023
 * Time: 12:52 PM
 * File Name : ExceptionBasics.java
 */
public class ExceptionBasics {
    public static void main(String[] args) {

        try {
            int n = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        catch (IndexOutOfBoundsException e){        //this gives an error -> "Exception 'java.lang.IndexOutOfBoundsException' has already been caught"
//
//        }

        /*catch (Exception e){
            System.out.println(e.getMessage());
        }                                               // This code doesn't work, We already handled arithmetic exception in first catch block
                                                        // we have to write specific exception catch block first.
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }*/
    }
}
