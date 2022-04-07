package apiTesting;

import static org.junit.Assert.assertTrue;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Test;



import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class Testapi {
	
	@Test
	public void validateFirstNameField() {
	RequestSpecification request = RestAssured.given(); request.header("Content-Type", "application/json"); JSONObject json = new JSONObject(); json.put("address", "street");
	json.put("city", "pune");
	json.put("firstName", "");
	json.put("id", "0");
	json.put("lastName", "safeena");
	json.put("telephone", "999999999"); request.body(json.toJSONString()); Response response = request.post("http://20.239.27.227/petclinic/api/owners"); int code = response.getStatusCode();
	// Response str=response.getBody();
	System.out.println("Response body for FirstNameField: " + response.body().asString());
	Headers headers = response.getHeaders();
	for (Header header : headers) {
	System.out.println("Key : " + header.getName() + " Value : " + header.getValue());
	}
	String errorMessage = response.header("errors");
	System.out.println("errors of Firstname field:" + errorMessage);
	System.out.println("Status Code of FristName field:" + code);
	} @Test
	public void validateTelephoneField() {
	RequestSpecification request = RestAssured.given(); request.header("Content-Type", "application/json"); JSONObject json = new JSONObject(); json.put("address", "street");
	json.put("city", "pune");
	json.put("firstName", "Hema");
	json.put("id", "0");
	json.put("lastName", "safeena");
	json.put("telephone", ""); request.body(json.toJSONString()); Response response = request.post("http://20.239.27.227/petclinic/api/owners"); int code = response.getStatusCode();
	// Response str=response.getBody();
	System.out.println("Response body for TelephoneField: " + response.body().asString());
	Headers headers = response.getHeaders();
	for (Header header : headers) {
	System.out.println("Key : " + header.getName() + " Value : " + header.getValue());
	}
	String errorMessage = response.header("errors");
	System.out.println("errors of telephone field:" + errorMessage);
	System.out.println("Status Code of telephone field:" + code); Assert.assertEquals(code, 400);
	}
	@Test
	public void validateNonNumericTelephoneField() {
	RequestSpecification request = RestAssured.given(); request.header("Content-Type", "application/json"); JSONObject json = new JSONObject(); json.put("address", "street");
	json.put("city", "pune");
	json.put("firstName", "Hema");
	json.put("id", "0");
	json.put("lastName", "safeena");
	json.put("telephone", "a1d1d2hjh"); request.body(json.toJSONString()); Response response = request.post("http://20.239.27.227/petclinic/api/owners"); int code = response.getStatusCode();
	// Response str=response.getBody();
	System.out.println("Response body for NonNumeric TelephoneField: " + response.body().asString());
	Headers headers = response.getHeaders();
	for (Header header : headers) {
	System.out.println("Key : " + header.getName() + " Value : " + header.getValue());
	}
	String errorMessage = response.header("errors");
	System.out.println("errors of NonNumeric telephone field:" + errorMessage);
	System.out.println("Status Code of NonNumeric telephone field:" + code); Assert.assertEquals(code, 400);
	}
	@Test public void validateAddressField() {
	RequestSpecification request = RestAssured.given(); request.header("Content-Type", "application/json"); JSONObject json = new JSONObject(); json.put("address", "");
	json.put("city", "pune");
	json.put("firstName", "Banu");
	json.put("id", "0");
	json.put("lastName", "safeena");
	json.put("telephone", "906789021"); request.body(json.toJSONString()); Response response = request.post("http://20.239.27.227/petclinic/api/owners"); int code = response.getStatusCode(); System.out.println("Response body for AddressField: " + response.body().asString());
	Headers headers = response.getHeaders();
	for (Header header : headers) {
	System.out.println("Key : " + header.getName() + " Value : " + header.getValue());
	}
	String errorMessage = response.header("errors");
	System.out.println("errors of Address field:" + errorMessage);
	System.out.println("Status Code of Address field:" + code); Assert.assertEquals(code, 400);
	} @Test public void validateCityField() {
	RequestSpecification request = RestAssured.given(); request.header("Content-Type", "application/json"); JSONObject json = new JSONObject(); json.put("address", "street");
	json.put("city", "");
	json.put("firstName", "Reenu");
	json.put("id", "0");
	json.put("lastName", "safeena");
	json.put("telephone", "9067890121"); request.body(json.toJSONString()); Response response = request.post("http://20.239.27.227/petclinic/api/owners"); int code = response.getStatusCode();
	//Response str=response.getBody();
	System.out.println("Response body for cityField: " + response.body().asString());
	Headers headers = response.getHeaders();
	for (Header header : headers) {
	System.out.println("Key : " + header.getName() + " Value : " + header.getValue());
	}
	String errorMessage = response.header("errors");
	System.out.println("errors of city field:" + errorMessage);
	System.out.println("Status Code of city field:" + code); Assert.assertEquals(code, 400);
	} @Test public void validateLastNameField() {
	RequestSpecification request = RestAssured.given(); request.header("Content-Type", "application/json");
	JSONObject json = new JSONObject(); json.put("address", "street");
	json.put("city", "chennai");
	json.put("firstName", "Java");
	json.put("id", "0");
	json.put("lastName", "");
	json.put("telephone", "9876541567"); request.body(json.toJSONString()); Response response = request.post("http://20.239.27.227/petclinic/api/owners"); int code = response.getStatusCode();
	System.out.println("Response body for LastNameField: " + response.body().asString()); Headers headers = response.getHeaders();
	for (Header header : headers) {
	System.out.println("Key : " + header.getName() + " Value : " + header.getValue());
	}
	String errorMessage = response.header("errors");
	System.out.println("errors of lastNameFeild:" + errorMessage);
	System.out.println("Status Code of LastName:" + code); Assert.assertEquals(code, 400);
	}

	



}
	