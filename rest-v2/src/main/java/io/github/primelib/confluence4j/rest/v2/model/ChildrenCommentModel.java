package io.github.primelib.confluence4j.rest.v2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChildrenCommentModel
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "id",
    "status",
    "title",
    "parentCommentId",
    "version",
    "body",
    "_links"
})
@JsonTypeName("ChildrenCommentModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChildrenCommentModel {

    /**
     * ID of the comment.
     * Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     */
    @JsonProperty("id")
    protected Long id;

    @JsonProperty("status")
    protected ContentStatus status;

    /**
     * Title of the comment.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * ID of the parent comment the child comment is in.
     * Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     */
    @JsonProperty("parentCommentId")
    protected Long parentCommentId;

    @JsonProperty("version")
    protected Version version;

    @JsonProperty("body")
    protected BodyBulk body;

    @JsonProperty("_links")
    protected CommentLinks _links;

    /**
     * Constructs a validated instance of {@link ChildrenCommentModel}.
     *
     * @param spec the specification to process
     */
    public ChildrenCommentModel(Consumer<ChildrenCommentModel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ChildrenCommentModel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ChildrenCommentModel(Consumer)} instead.
     * @param id ID of the comment.  Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     * @param status status
     * @param title Title of the comment.
     * @param parentCommentId ID of the parent comment the child comment is in.  Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     * @param version version
     * @param body body
     * @param _links _links
     */
    @ApiStatus.Internal
    public ChildrenCommentModel(Long id, ContentStatus status, String title, Long parentCommentId, Version version, BodyBulk body, CommentLinks _links) {
        this.id = id;
        this.status = status;
        this.title = title;
        this.parentCommentId = parentCommentId;
        this.version = version;
        this.body = body;
        this._links = _links;
    }

}
