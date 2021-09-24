

import base.BasePetStore;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.path.json.JsonPath.from;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;


public class PetStoreTest extends BasePetStore {

//#1. post: verify that when a user logs in correctly it shows a status code 200
    @Test

    public void loginteUserTest () {


        given ()
                .contentType (ContentType.JSON)
                .body ("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"username\": \"string\",\n" +
                        "  \"firstName\": \"string\",\n" +
                        "  \"lastName\": \"string\",\n" +
                        "  \"email\": \"string\",\n" +
                        "  \"password\": \"string\",\n" +
                        "  \"phone\": \"string\",\n" +
                        "  \"userStatus\": 0\n" +
                        "}")
                .when ()
                .post ("user")
                .then ()
                .assertThat ()
                .statusCode (HttpStatus.SC_OK);


    }

//#2. Post: verify that when creating a user correctly it shows a status code 200
    @Test

    public void createUserTest () {


                given ()
                .contentType (ContentType.JSON)
                .body ("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"username\": \"string\",\n" +
                        "  \"firstName\": \"string\",\n" +
                        "  \"lastName\": \"string\",\n" +
                        "  \"email\": \"string\",\n" +
                        "  \"password\": \"string\",\n" +
                        "  \"phone\": \"string\",\n" +
                        "  \"userStatus\": 0\n" +
                        "}")
                .when ()
                .post ("user")
                .then ()
                .assertThat ()
                .statusCode (HttpStatus.SC_OK);


    }
//#3. Post: verify that when entering erroneous data of a user a status code 400  is shown
    @Test

    public void isInvalidRequestCreateUserTest () {

                given ()

                .contentType (ContentType.JSON)
                .body ("{\n" +
                        "  \"id\": ,\n" +
                        "  \"username\": \"string\",\n" +
                        "  \"firstName\": \"string\",\n" +
                        "  \"lastName\": \"string\",\n" +
                        "  \"email\": \"string\",\n" +
                        "  \"password\": \"string\",\n" +
                        "  \"phone\": \"string\",\n" +
                        "  \"userStatus\": 0\n" +
                        "}")
                .when ()
                .post ("user")
                .then ()

                .statusCode (HttpStatus.SC_BAD_REQUEST);
    }
//#4. Get: verify that when obtaining the name of a registered user it shows a status code 200
    @Test

    public void getUserByNameTest () {

        given ()

                .when ()
                .get ("user/string")
                .then ()

                .statusCode (HttpStatus.SC_OK);
    }
//#5. Get: verify that when a user is not found it shows a status code 404
    @Test

    public void getIsUserNotFoundTest () {

        given ()

                .when ()
                .get ("user/carlos")
                .then ()

                .statusCode (HttpStatus.SC_NOT_FOUND);
    }

    //#6 get: verify that when obtaining an illegal username it shows a status code 405
    @Test

    public void getNotAllowedUserTest () {

        given ()

                .when ()
                .get ("user/")
                .then ()

                .statusCode (HttpStatus.SC_METHOD_NOT_ALLOWED);
    }

    //#7 Put: verify that updating a username shows a status code 200
    @Test
    public void putUserTest () {
        Response response = given ()
                .body ("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"username\": \"string\",\n" +
                        "  \"firstName\": \"string\",\n" +
                        "  \"lastName\": \"string\",\n" +
                        "  \"email\": \"string\",\n" +
                        "  \"password\": \"string\",\n" +
                        "  \"phone\": \"string\",\n" +
                        "  \"userStatus\": 0\n" +
                        "}")
                .put ("user/string");
        int status = response.getStatusCode ();
        assertThat (status,equalTo (HttpStatus.SC_OK));

    }

    //#8 Delete: verify that when deleting a user a status code 200 is shown
    @Test

    public void deleteUserTest() {
        given()
                .get("user/string")
                .then()
                .statusCode(HttpStatus.SC_OK);

    }
//#9 Delete: verify that when searching for a user who was deleted, a status  code 404 is shown
    @Test

    public void verifyStatusCode404WhenNotFoundUserNameDeleteTest() {
        given()
                .get("user/yoyo")
                .then()
                .statusCode(HttpStatus.SC_NOT_FOUND);


    }

//***************************************TestCaseRoberto*****************************************************

//#1. Post: verify Upload Image Pet shows a status code 200

    @Test
    public void uploadImagePetTest() {

        RestAssured
                .given()
                .log()
                .all()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"code\": 0,\n" +
                        "  \"type\": \"string\",\n" +
                        "  \"message\": \"string\"\n" +
                        "}")

                .when()
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .log()
                .all()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
//#2. Post: verify Not Found Upload Image Pet shows a status code 405
    public void notFoundUploadImagePetTest() {

        RestAssured
                .given()
                .log()
                .all()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "    \"code\": 405,\n" +
                        "    \"type\": \"unknown\",\n" +
                        "    \"message\": \"no data\"\n" +
                        "}")

                .when()
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .log()
                .all()
                .statusCode(HttpStatus.SC_OK);
    }
    //#3. Post: verify add Pet store shows a status code 200
    @Test

    public void addPetStoreTest() {

        RestAssured
                .given()
                .log()
                .all()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 0,\n" +
                        "    \"name\": \"string\"\n" +
                        "  },\n" +
                        "  \"name\": \"doggie\",\n" +
                        "  \"photoUrls\": [\n" +
                        "    \"string\"\n" +
                        "  ],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 0,\n" +
                        "      \"name\": \"string\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available\"\n" +
                        "}")

                .when()
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .log()
                .all()
                .statusCode(HttpStatus.SC_OK);
    }
    //#4. Post: verify Not Allow Add Pet shows a status code 405
    @Test

    public void notAlloweAddPetStoreTest() {

        RestAssured
                .given()
                .log()
                .all()
                .contentType(ContentType.JSON)
                .when()
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .log()
                .all()
                .statusCode(HttpStatus.SC_METHOD_NOT_ALLOWED);
    }

    //#5. Put: verify Update Data Pet shows a status code 200
    @Test
    public void putUpdatePet () {
        RestAssured
                .given()
                .log()
                .all()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 0,\n" +
                        "    \"name\": \"string\"\n" +
                        "  },\n" +
                        "  \"name\": \"doggie\",\n" +
                        "  \"photoUrls\": [\n" +
                        "    \"string\"\n" +
                        "  ],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 0,\n" +
                        "      \"name\": \"string\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available\"\n" +
                        "}")

                .when()
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .log()
                .all()
                .statusCode(HttpStatus.SC_OK);
    }
    //#6. Get: verify find Pet ID shows a status code 200
    @Test
    public void  getFindPetID(){
        RestAssured
                .given()
                .log()
                .all()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 0,\n" +
                        "    \"name\": \"string\"\n" +
                        "  },\n" +
                        "  \"name\": \"doggie\",\n" +
                        "  \"photoUrls\": [\n" +
                        "    \"string\"\n" +
                        "  ],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 0,\n" +
                        "      \"name\": \"string\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available\"\n" +
                        "}")

                .when()
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .log()
                .all()
                .statusCode(HttpStatus.SC_OK);

    }
    //#7. Get: verify Not Alloed Find By Status Pet shows a status code 405
    @Test

    public void getNotAllowedFindByStatusPet() {

        RestAssured
                .given()
                .log()
                .all()
                .contentType(ContentType.JSON)
                .body("[\n" +
                        "  {\n" +
                        "    \"id\": 0,\n" +
                        "    \"category\": {\n" +
                        "      \"id\": 0,\n" +
                        "      \"name\": \"string\"\n" +
                        "    },\n" +
                        "    \"name\": \"doggie\",\n" +
                        "    \"photoUrls\": [\n" +
                        "      \"string\"\n" +
                        "    ],\n" +
                        "    \"tags\": [\n" +
                        "      {\n" +
                        "        \"id\": 0,\n" +
                        "        \"name\": \"string\"\n" +
                        "      }\n" +
                        "    ],\n" +
                        "    \"status\": \"available\"\n" +
                        "  }\n" +
                        "]")

                .when()
                .post("https://petstore.swagger.io/v2/pet/findByStatus?status=available")
                .then()
                .log()
                .all()
                .statusCode(HttpStatus.SC_METHOD_NOT_ALLOWED);
    }
    //#8. Post: verify invalid Update Data Pet shows a status code 415
    @Test
    public void  isInvalidUpdatesPetStore(){
        RestAssured
                .given()
                .log()
                .all()
                .contentType(ContentType.JSON)
                .when()
                .post("https://petstore.swagger.io/v2/pet/101")
                .then()
                .log()
                .all()
                .statusCode(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE);
    }
    //#9. Delete: verify Invalid Delete Pet shows a status code 415
    @Test
    public void  isInvalidDeletePet(){
        RestAssured
                .given()
                .log()
                .all()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"code\": 200,\n" +
                        "  \"type\": \"unknown\",\n" +
                        "  \"message\": \"101\"\n" +
                        "}")
                .when()
                .post("https://petstore.swagger.io/v2/pet/101")
                .then()
                .log()
                .all()
                .statusCode(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE);
    }



//***************************************TestCaseDAMARIS*****************************************************

//#1. Post: verify that when requesting an order a pet correctly shows a status code 200
    @Test

    public void postSuccessfulOperation () {


        given ()
                .contentType (ContentType.JSON)
                .body ("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"petId\": 0,\n" +
                        "  \"quantity\": 0,\n" +
                        "  \"shipDate\": \"2021-09-23T12:08:17.410Z\",\n" +
                        "  \"status\": \"placed\",\n" +
                        "  \"complete\": true\n" +
                        "}")
                .when ()
                .post ("store/order")
                .then ()
                .assertThat ()
                .statusCode (HttpStatus.SC_OK);


    }

//#2    Post: verify that when entering erroneous data of a pet order, a status code 400 is shown
    @Test

    public void postIsInvalidOrder () {

        given ()

                .contentType (ContentType.JSON)
                .body ("{\n" +
                        "  \"id\": ,\n" +
                        "  \"username\": \"string\",\n" +
                        "  \"firstName\": \"string\",\n" +
                        "  \"lastName\": \"string\",\n" +
                        "  \"email\": \"string\",\n" +
                        "  \"password\": \"string\",\n" +
                        "  \"phone\": \"string\",\n" +
                        "  \"userStatus\": 0\n" +
                        "}")
                .when ()
                .post ("store/order")
                .then ()

                .statusCode (HttpStatus.SC_BAD_REQUEST);
    }
//#3. Get: verify that when obtaining a valid order in the store it shows a status code 200
    @Test
    public void getValidOrder () {

        given ()

                .contentType (ContentType.JSON)
                .body ("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"petId\": 0,\n" +
                        "  \"quantity\": 0,\n" +
                        "  \"shipDate\": \"2021-09-23T14:07:13.677Z\",\n" +
                        "  \"status\": \"placed\",\n" +
                        "  \"complete\": true\n" +
                        "}")
                .when ()
                .post ("store/order")
                .then ()

                .statusCode (HttpStatus.SC_OK);
    }
//#4. Get: verify that when an order is not found in the store, a status code 404 is shown
    @Test

    public void getOrderNotFoundById() {

        given ()

                .when ()
                .get ("store/order/0")
                .then ()

                .statusCode (HttpStatus.SC_NOT_FOUND);
    }

//#5. Get: verify that when requesting the search for not allowed orders it shows a status code 405
    @Test

    public void getOrderNotAllowedById() {

        given ()

                .when ()
                .get ("store")
                .then ()

                .statusCode (HttpStatus.SC_METHOD_NOT_ALLOWED);
    }

//#6. Get: verify that updating an inventory order shows a code 200 status
@Test
    public void getInventoryByStatusValid() {

        given ()

                .when ()
                .get ("store/inventory")
                .then ()

                .statusCode (HttpStatus.SC_OK);
    }

//#7. Delete: Verify that when an order is removed from the store a status code 200  is show
    @Test
    public void deletePurchaseOrderById() {
        given()
                .get("store/order/1")
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

//#8. Delete: verify that not allowed orders cannot be deleted, a status code 405  is shown
    @Test
    public void deleteOrderWhenMethodNotAllowed() {
        given()
                .get("store/order")
                .then()
                .statusCode(HttpStatus.SC_METHOD_NOT_ALLOWED);
    }
}
