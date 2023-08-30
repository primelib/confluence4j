package io.github.primelib.confluence4j.rest.v2.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OnlyArchivedAndCurrentContentStatus
 * 
 *
 */
@JsonTypeName("OnlyArchivedAndCurrentContentStatus")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum OnlyArchivedAndCurrentContentStatus {
    CURRENT("current"),
    ARCHIVED("archived");

    private final String value;
}
