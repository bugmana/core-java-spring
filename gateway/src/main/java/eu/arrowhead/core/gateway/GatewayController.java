package eu.arrowhead.core.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {

	@Value("${sr_port}")
	private long srPort;
	
	@RequestMapping(method = { RequestMethod.GET }, path = "/")
	public String echoSRPort() {
		System.out.println(srPort);
		return String.valueOf(srPort);
	}
}
