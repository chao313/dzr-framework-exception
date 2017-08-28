package com.dzr.framework.exception;

/**
 * 表示数据转换失败。
 */
public class DataConvertException extends BaseException {

	private static final long serialVersionUID = 1669843560642800254L;

	public DataConvertException() {
		super("dataCommitFailed");
	}

	public DataConvertException(String messageKey, Throwable cause) {
		super(messageKey, cause);
	}

	public DataConvertException(String messageKey) {
		super(messageKey);
	}

	public DataConvertException(Throwable cause) {
		super("dataCommitFailed", cause);
	}

}
