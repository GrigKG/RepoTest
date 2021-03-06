package TravelfactoryTest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class CampaignNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8025169688337476030L;
	
	public CampaignNotFoundException(String id) {
		super("Campaign with id " + id + " not found");
	}
}
