package se.eneroth.logexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogExample {

	static final Logger LOG = LoggerFactory.getLogger(LogExample.class);


	public static void main(String[] args) {
		LogExample console = new LogExample();
		console.execute();
	}

	public void execute() {

		if (LOG.isTraceEnabled()) {
			LOG.trace("Test: TRACE level message.");
		}
		if (LOG.isDebugEnabled()) {
			LOG.debug("Test: DEBUG level message.");
		}
		if (LOG.isInfoEnabled()) {
			LOG.info("Test: INFO level message.");
		}
		if (LOG.isWarnEnabled()) {
			LOG.warn("Test: WARN level message.");
		}
		if (LOG.isErrorEnabled()) {
			LOG.error("Test: ERROR level message.");
		}
	}

}