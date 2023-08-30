package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Content;
import io.github.primelib.confluence4j.rest.v1.model.ContentTemplate;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetContentTemplateSpec
 * <p>
 * Specification for the GetContentTemplate operation.
 * <p>
 * Get content template
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetContentTemplateOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the content template to be returned.
     */
    @NotNull 
    private String contentTemplateId;

    /**
     * Constructs a validated instance of {@link GetContentTemplateOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetContentTemplateOperationSpec(Consumer<GetContentTemplateOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetContentTemplateOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param contentTemplateId    The ID of the content template to be returned.
     */
    @ApiStatus.Internal
    public GetContentTemplateOperationSpec(String contentTemplateId) {
        this.contentTemplateId = contentTemplateId;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(contentTemplateId, "contentTemplateId is a required parameter!");
    }
}
