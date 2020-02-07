package kr.co.memberLogin;

public class DuplicateMemberException extends RuntimeException {
	
	public DuplicateMemberException(String message) {
		super(message);
	}

}
