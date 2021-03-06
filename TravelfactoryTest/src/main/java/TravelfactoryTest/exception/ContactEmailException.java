package TravelfactoryTest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@ResponseStatus(code = HttpStatus.CONFLICT)
public class ContactEmailException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9044842073929519535L;
	
	public ContactEmailException(String email) {
		super("Format " + email + " not wrong");
	}

}
