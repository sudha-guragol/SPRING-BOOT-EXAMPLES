package in.ashokit.exception;

public class NoBookFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7210762057728906851L;

	public NoBookFoundException(String msg)
	{
		super(msg);
	}

}
