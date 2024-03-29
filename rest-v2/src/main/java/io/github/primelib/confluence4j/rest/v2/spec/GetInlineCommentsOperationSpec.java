package io.github.primelib.confluence4j.rest.v2.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v2.model.CommentSortOrder;
import io.github.primelib.confluence4j.rest.v2.model.PrimaryBodyRepresentation;
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
 * GetInlineCommentsSpec
 * <p>
 * Specification for the GetInlineComments operation.
 * <p>
 * Get inline comments
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetInlineCommentsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.
     */
    @Nullable 
    private PrimaryBodyRepresentation bodyFormat;

    /**
     * Used to sort the result by a particular field.
     */
    @Nullable 
    private CommentSortOrder sort;

    /**
     * Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.
     */
    @Nullable 
    private String cursor;

    /**
     * Maximum number of footer comments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.
     */
    @Nullable 
    private Integer limit;

    /**
     * Constructs a validated instance of {@link GetInlineCommentsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetInlineCommentsOperationSpec(Consumer<GetInlineCommentsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetInlineCommentsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param bodyFormat           The content format type to be returned in the {@code body} field of the response. If available, the representation will be available under a response field of the same name under the {@code body} field.
     * @param sort                 Used to sort the result by a particular field.
     * @param cursor               Used for pagination, this opaque cursor will be returned in the {@code next} URL in the {@code Link} response header. Use the relative URL in the {@code Link} header to retrieve the {@code next} set of results.
     * @param limit                Maximum number of footer comments per result to return. If more results exist, use the {@code Link} header to retrieve a relative URL that will return the next set of results.
     */
    @ApiStatus.Internal
    public GetInlineCommentsOperationSpec(PrimaryBodyRepresentation bodyFormat, CommentSortOrder sort, String cursor, Integer limit) {
        this.bodyFormat = bodyFormat;
        this.sort = sort;
        this.cursor = cursor;
        this.limit = limit;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }
}
