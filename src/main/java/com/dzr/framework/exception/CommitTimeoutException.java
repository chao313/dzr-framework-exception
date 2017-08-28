package com.dzr.framework.exception;

/**
 * 表示提交超时。
 */
public class CommitTimeoutException extends BaseException {

	private static final long serialVersionUID = 1669843560642800254L;

	public CommitTimeoutException() {
		super("commitTimeOut");
	}

	public CommitTimeoutException(String messageKey, Throwable cause) {
		super(messageKey, cause);
	}

	public CommitTimeoutException(String messageKey) {
		super(messageKey);
	}

	public CommitTimeoutException(Throwable cause) {
		super("dataCommitFailed", cause);
	}

}
