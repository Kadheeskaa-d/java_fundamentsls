public class Substring_Extraction
{
    public void String_object(String x)
    {
        System.out.println("From String :");
        System.out.println("The substring is "+x.substring(0,5)+" & "+x.substring(5));
    }

    public void StringBuilder_object(String x)
    {
        StringBuilder bld = new StringBuilder(x);
        System.out.println("From StringBuilder :");
        System.out.println("The substring is "+x.substring(0,5)+" & "+x.substring(5));
    }

    public void StringBuffer_object(String x)
    {
        StringBuffer bfr = new StringBuffer(x);
        System.out.println("From StringBuffer :");
        System.out.println("The substring is "+x.substring(0,5)+" & "+x.substring(5));
    }

    public static void main(String[] args)
    {

        String x = "Java Programming";
        Substring_Extraction str = new Substring_Extraction();
        str.String_object(x);
        str.StringBuilder_object(x);
        str.StringBuffer_object(x);
    }
}
