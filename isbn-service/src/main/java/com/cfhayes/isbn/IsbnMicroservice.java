package com.cfhayes.isbn;

import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@OpenAPIDefinition(
    info = @Info(
        title = "ISBN Rest API",
        description = "Generates ISBN numbers for books",
        version = "1.0"
    ),
    tags = {
        @Tag(name = "api", description = "Public API"),
        @Tag(name = "numbers", description = "Interested in numbers")
    }
)
public class IsbnMicroservice extends Application {
    
}
