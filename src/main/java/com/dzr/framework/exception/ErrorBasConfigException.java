package com.dzr.framework.exception;

/**
 * 系统参数未配置或配置错误
 */
public class ErrorBasConfigException extends BaseException {

	private static final long serialVersionUID = 2263196920034158855L;

	public ErrorBasConfigException() {
		super("errorBasConfig");
	}

	public ErrorBasConfigException(String messageKey, Throwable cause) {
		super(messageKey, cause);
	}

	public ErrorBasConfigException(String messageKey) {
		super(messageKey);
	}

	public ErrorBasConfigException(Throwable cause) {
		super("errorBasConfig", cause);
	}
	
}
