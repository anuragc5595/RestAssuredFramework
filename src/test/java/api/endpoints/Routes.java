package api.endpoints;

/*
 Swagger Petstore URI ---> https://petstore.swagger.io
 
 Create User(POST) --> https://petstore.swagger.io/v2/user
 Get User(GET) --> https://petstore.swagger.io/v2/user/{username}
 Update User(PUT) ---> https://petstore.swagger.io/v2/user/{username}
 Delete User(Delete) --> https://petstore.swagger.io/v2/user/{username}
 
 */


public class Routes {
	
	public static String base_url = "https://petstore.swagger.io/v2";
	
	//User Module
	
	public static String post_url = base_url +"/user";
	public static String get_url = base_url +"/user/{username}";
	public static String update_url = base_url +"/user/{username}";
	public static String delete_url = base_url +"/user/{username}";
	
	//Store Module
	   // here you will create Store module url's
	
	//Pet Module
		// here you will create Pet module url's

}
