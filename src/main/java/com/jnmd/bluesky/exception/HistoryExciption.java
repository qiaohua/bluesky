package com.jnmd.bluesky.exception;

public class HistoryExciption extends Exception {

	public HistoryExciption() {
		super();
	}

	public HistoryExciption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public HistoryExciption(String message, Throwable cause) {
		super(message, cause);
	}

	public HistoryExciption(String message) {
		super(message);
	}

	public HistoryExciption(Throwable cause) {
		super(cause);
	}
}
