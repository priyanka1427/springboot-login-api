package com.factory.utilities;

public class ApiResponse<T> {

	private int status;
	private String message;
	private T result;

	public ApiResponse(int status, String message, T result) {
		this.status = status;
		this.message = message;
		this.result = result;
	}

	public ApiResponse() {

	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "ApiResponse [status=" + status + ", message=" + message + ", result=" + result + "]";
	}
}
