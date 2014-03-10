package execptions;

public class InvalidRangeException extends Exception
{

	public InvalidRangeException( )
	{
	}

	public InvalidRangeException( String message )
	{
		super( message );
	}

	public InvalidRangeException( Throwable cause )
	{
		super( cause );
	}

	public InvalidRangeException( String message, Throwable cause )
	{
		super( message, cause );
	}

	public InvalidRangeException( String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace )
	{
		super( message, cause, enableSuppression, writableStackTrace );
	}

}
