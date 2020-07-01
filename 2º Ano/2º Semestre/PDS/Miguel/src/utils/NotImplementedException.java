package utils;

@SuppressWarnings("serial")
public class NotImplementedException extends Exception
{
    public NotImplementedException()
    {
        super(String.format("NotImplementedException"));
    }

}
