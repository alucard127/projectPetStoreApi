package base;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.Filter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.BeforeClass;

import java.util.ArrayList;
import java.util.List;

    public abstract class BasePetStore {

        @BeforeClass
        public static void setUp(){
            RestAssured.requestSpecification=defaultRequestSpecification ();

        }
        public static RequestSpecification defaultRequestSpecification(){

            List<Filter> filters = new ArrayList<>();
            filters.add(new RequestLoggingFilter());
            filters.add(new ResponseLoggingFilter());

            return new RequestSpecBuilder().setBaseUri("https://petstore.swagger.io")
                    .setBasePath ("/v2")

                    .addFilters(filters)
                    .setContentType(ContentType.JSON).build();
        }
        }
