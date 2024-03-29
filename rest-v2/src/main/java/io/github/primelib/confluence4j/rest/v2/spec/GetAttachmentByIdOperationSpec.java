package io.github.primelib.confluence4j.rest.v2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.Attachment;
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
 * GetAttachmentByIdSpec
 * <p>
 * Specification for the GetAttachmentById operation.
 * <p>
 * Get attachment by id
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAttachmentByIdOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the attachment to be returned. If you don't know the attachment's ID, use Get attachments for page/blogpost/custom content.
     */
    @NotNull 
    private String id;

    /**
     * Allows you to retrieve a previously published version. Specify the previous version's number to retrieve its details.
     */
    @Nullable 
    private Integer version;

    /**
     * Constructs a validated instance of {@link GetAttachmentByIdOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAttachmentByIdOperationSpec(Consumer<GetAttachmentByIdOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetAttachmentByIdOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the attachment to be returned. If you don't know the attachment's ID, use Get attachments for page/blogpost/custom content.
     * @param version              Allows you to retrieve a previously published version. Specify the previous version's number to retrieve its details.
     */
    @ApiStatus.Internal
    public GetAttachmentByIdOperationSpec(String id, Integer version) {
        this.id = id;
        this.version = version;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(id, "id is a required parameter!");
    }
}
