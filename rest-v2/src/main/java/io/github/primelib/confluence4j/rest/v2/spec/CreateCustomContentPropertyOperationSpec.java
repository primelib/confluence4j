package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.ContentProperty;
import io.github.primelib.confluence4j.rest.v2.model.ContentPropertyCreateRequest;
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
 * CreateCustomContentPropertySpec
 * <p>
 * Specification for the CreateCustomContentProperty operation.
 * <p>
 * Create content property for custom content
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateCustomContentPropertyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the custom content to create a property for.
     */
    @NotNull 
    private Long customContentId;

    /**
     * The content property to be created
     */
    @NotNull 
    private ContentPropertyCreateRequest contentPropertyCreateRequest;

    /**
     * Constructs a validated instance of {@link CreateCustomContentPropertyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateCustomContentPropertyOperationSpec(Consumer<CreateCustomContentPropertyOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateCustomContentPropertyOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param customContentId      The ID of the custom content to create a property for.
     * @param contentPropertyCreateRequest The content property to be created
     */
    @ApiStatus.Internal
    public CreateCustomContentPropertyOperationSpec(Long customContentId, ContentPropertyCreateRequest contentPropertyCreateRequest) {
        this.customContentId = customContentId;
        this.contentPropertyCreateRequest = contentPropertyCreateRequest;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(customContentId, "customContentId is a required parameter!");
        Objects.requireNonNull(contentPropertyCreateRequest, "contentPropertyCreateRequest is a required parameter!");
    }
}
