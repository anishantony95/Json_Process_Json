package com.anish.camel;



import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MyApp {

    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }

    // Define Camel routes
    @Component
    public class MyRoute extends RouteBuilder {
        @Override
        public void configure() throws Exception {
            // Route to read JSON file
            from("file:0406/input/")
                .unmarshal().json(JsonLibrary.Jackson, EntityClass.class) // Convert JSON to Java object
                .bean(YourClassProcessor.class) // Perform business logic
                .marshal().json(JsonLibrary.Jackson) // Convert Java object back to JSON
                .to("file:0406/output/");
        }
    }

   

    // Processor to perform business logic
    public class YourClassProcessor {
        public void process(EntityClass data) {
        	
        	data.setConversionMultiple(data.getConversionMultiple());
        	data.setFrom("anish11");
        	data.setTo("antony111");
            
        }
    }
}
