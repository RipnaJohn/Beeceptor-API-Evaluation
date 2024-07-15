package RestAssure;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;


public class Beeceptor {
	
	// Schedule a Hook

    @Test(enabled = false)
    
    public void getAllRecipes() {
    	
    	given().post("https://posthook-api.mock.beeceptor.com/v1/hooks").then().statusCode(200).log().all();
    }
    
 // Schedule a Hook

    @Test(enabled = false)
    
    public void GetHooks() {
    	
    	given().get("https://posthook-api.mock.beeceptor.com/v1/hooks").then().statusCode(200).log().all();
    }
    
 // Schedule a Hook

    @Test(enabled = false)
    
    public void GetSingleHook() {
    	
    	given().get("https://posthook-api.mock.beeceptor.com/v1/hooks/6ab4d4d5-4767-452d-b72f-6ec40562b27e").then().statusCode(200).log().all();
    }
    
 // Schedule a Hook

    @Test(enabled = false)
    
    public void DeleteHook() {
    	
    	given().delete("https://posthook-api.mock.beeceptor.com/v1/hooks/6ab4d4d5-4767-452d-b72f-6ec40562b27e").then().statusCode(200).log().all();
    }
    
  //Add a new comment

    @Test(enabled = true)

    public void UpdateHook() {
    	   
    	   JSONObject js = new JSONObject();
    	   
    	   js.put("name","updated-project");
    	   js.put("domain","api.example.com");
    	   js.put("headerAuthorization","");
    	   js.put("minRetries","1");
    	   js.put("retryDelaySecs","5");
    	   
    	   given().contentType("application/json").body(js.toJSONString()).when().put("https://posthook-api.mock.beeceptor.com/v1/projects/").then().log().all();
    }

}
