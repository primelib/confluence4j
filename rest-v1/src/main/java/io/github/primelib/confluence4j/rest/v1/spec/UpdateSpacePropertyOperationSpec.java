package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Space;
import io.github.primelib.confluence4j.rest.v1.model.SpaceProperty;
import io.github.primelib.confluence4j.rest.v1.model.SpacePropertyUpdate;
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
 * UpdateSpacePropertySpec
 * <p>
 * Specification for the UpdateSpaceProperty operation.
 * <p>
 * Update space property
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateSpacePropertyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the space that the property is in.
     */
    @NotNull 
    private String spaceKey;

    /**
     * The key of the property to be updated.
     */
    @NotNull 
    private String key;

    /**
     * The space property being updated.
     */
    @NotNull 
    private SpacePropertyUpdate body;

    /**
     * Constructs a validated instance of {@link UpdateSpacePropertyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateSpacePropertyOperationSpec(Consumer<UpdateSpacePropertyOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateSpacePropertyOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param spaceKey             The key of the space that the property is in.
     * @param key                  The key of the property to be updated.
     * @param body                 The space property being updated.
     */
    @ApiStatus.Internal
    public UpdateSpacePropertyOperationSpec(String spaceKey, String key, SpacePropertyUpdate body) {
        this.spaceKey = spaceKey;
        this.key = key;
        this.body = body;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(spaceKey, "spaceKey is a required parameter!");
        Objects.requireNonNull(key, "key is a required parameter!");
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}
