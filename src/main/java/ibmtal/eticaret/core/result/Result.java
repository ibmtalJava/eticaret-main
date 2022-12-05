package ibmtal.eticaret.core.result;

import java.util.ArrayList;

public class Result<T> {
	private boolean success;
	private ArrayList<T> data;
	private ArrayList<ErrorItem> errors;
	public void newError(String name,String value) {
		this.success=false;
		this.errors.add(new ErrorItem(name,value));
	}
	public Result() {
		this.success=true;
		this.data=new ArrayList<>();
		this.errors=new ArrayList<>();
	}
	public Result(boolean success, ArrayList<T> data, ArrayList<ErrorItem> errors) {
		super();
		this.success = success;
		this.data = data;
		this.errors = errors;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public ArrayList<T> getData() {
		return data;
	}
	public void setData(ArrayList<T> data) {
		this.data = data;
	}
	public ArrayList<ErrorItem> getErrors() {
		return errors;
	}
	public void setErrors(ArrayList<ErrorItem> errors) {
		this.errors = errors;
	}
	
}
