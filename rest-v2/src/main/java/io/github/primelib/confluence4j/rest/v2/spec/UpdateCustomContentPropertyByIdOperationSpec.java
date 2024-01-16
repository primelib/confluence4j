package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.ContentProperty;
import io.github.primelib.confluence4j.rest.v2.model.ContentPropertyUpdateRequest;
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
 * UpdateCustomContentPropertyByIdSpec
 * <p>
 * Specification for the UpdateCustomContentPropertyById operation.
 * <p>
 * Update content property for custom content by id
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateCustomContentPropertyByIdOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the custom content the property belongs to.
     */
    @NotNull 
    private Long customContentId;

    /**
     * The ID of the property to be updated.
     */
    @NotNull 
    private Long propertyId;

    /**
     * The content property to be updated.
     */
    @NotNull 
    private ContentPropertyUpdateRequest contentPropertyUpdateRequest;

    /**
     * Constructs a validated instance of {@link UpdateCustomContentPropertyByIdOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateCustomContentPropertyByIdOperationSpec(Consumer<UpdateCustomContentPropertyByIdOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateCustomContentPropertyByIdOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param customContentId      The ID of the custom content the property belongs to.
     * @param propertyId           The ID of the property to be updated.
     * @param contentPropertyUpdateRequest The content property to be updated.
     */
    @ApiStatus.Internal
    public UpdateCustomContentPropertyByIdOperationSpec(Long customContentId, Long propertyId, ContentPropertyUpdateRequest contentPropertyUpdateRequest) {
        this.customContentId = customContentId;
        this.propertyId = propertyId;
        this.contentPropertyUpdateRequest = contentPropertyUpdateRequest;

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
        Objects.requireNonNull(propertyId, "propertyId is a required parameter!");
        Objects.requireNonNull(contentPropertyUpdateRequest, "contentPropertyUpdateRequest is a required parameter!");
    }
}
