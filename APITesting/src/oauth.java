

import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
public class oauth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		String url ="https://rahulshettyacademy.com/getCourse.php?state=verifyfjdss&code=4%2FvAHBQUZU6o4WJ719NrGBzSELBFVBI9XbxvOtYpmYpeV47bFVExkaxWaF_XR14PHtTZf7ILSEeamywJKwo_BYs9M&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&session_state=0c32992f0d47e93d273922018ade42d1072b9d1f..a35c&prompt=none#";



		String partialcode=url.split("code=")[1];

		String code=partialcode.split("&scope")[0];

		System.out.println(code);
		
		
String accessToken =	given().log().all().queryParam("code", "4%2F0AY0e-g6UUD1-sMKIpsxzb520ZVflKe7i8xD_oQk6X3t_fjDqhaROnrJncgGX7dEF0jllVg").queryParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
.queryParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W").queryParam("redirect_uri", "https://rahulshettyacademy.com/getCourse.php").queryParam("grant_type", "authorization_code").when().post("https://www.googleapis.com/oauth2/v4/token").asString();
	

JsonPath path = new JsonPath(accessToken);

path.getString("access_token");
	String response=	given().log().all().queryParam("accessToken", "").when().get("https://rahulshettyacademy.com/getCourse.php").asString();
		
		
System.out.println(response);
	}

}
