package com.cfhayes.isbn;

import java.time.Instant;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(description = "Several ISBN formats")
public class IsbnNumbers {

    @Schema(required = true)
    @JsonbProperty("ISBN_13")
    public String isbn13;

    @Schema(required = true)
    @JsonbProperty("ISBN_10")
    public String isbn10;

    @JsonbTransient
    public Instant generationDate;
    
    @Override
    public String toString() {
        return "IsbnNumbers [isbn13=" + isbn13 + ", isbn10=" + isbn10 + 
        ", generationDate=" + generationDate + "]";
    }

    
}
