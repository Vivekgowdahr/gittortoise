package owncustomeexception;

public class YouCantAccess extends RuntimeException{
String message;
public YouCantAccess(String message) {
	this.message=message;
}
}