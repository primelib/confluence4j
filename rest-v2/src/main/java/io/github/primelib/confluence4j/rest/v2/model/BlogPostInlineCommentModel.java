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
 * BlogPostInlineCommentModel
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
    "blogPostId",
    "version",
    "body",
    "resolutionStatus",
    "properties",
    "_links"
})
@JsonTypeName("BlogPostInlineCommentModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BlogPostInlineCommentModel {

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
     * ID of the blog post the comment is in.
     * Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     */
    @JsonProperty("blogPostId")
    protected Long blogPostId;

    @JsonProperty("version")
    protected Version version;

    @JsonProperty("body")
    protected BodyBulk body;

    @JsonProperty("resolutionStatus")
    protected InlineCommentResolutionStatus resolutionStatus;

    @JsonProperty("properties")
    protected InlineCommentProperties properties;

    @JsonProperty("_links")
    protected CommentLinks _links;

    /**
     * Constructs a validated instance of {@link BlogPostInlineCommentModel}.
     *
     * @param spec the specification to process
     */
    public BlogPostInlineCommentModel(Consumer<BlogPostInlineCommentModel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BlogPostInlineCommentModel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BlogPostInlineCommentModel(Consumer)} instead.
     * @param id ID of the comment.  Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     * @param status status
     * @param title Title of the comment.
     * @param blogPostId ID of the blog post the comment is in.  Due to JavaScript's max integer representation of 2^53-1, the type of this field will be changed from a numeric type to a string type at the end of the deprecation period. In the meantime, {@code serialize-ids-as-strings=true} can be passed as a query param to any v2 endpoint to opt-in to this change now. See this [changelog](https://developer.atlassian.com/cloud/confluence/changelog/#CHANGE-905) for more detail.
     * @param version version
     * @param body body
     * @param resolutionStatus resolutionStatus
     * @param properties properties
     * @param _links _links
     */
    @ApiStatus.Internal
    public BlogPostInlineCommentModel(Long id, ContentStatus status, String title, Long blogPostId, Version version, BodyBulk body, InlineCommentResolutionStatus resolutionStatus, InlineCommentProperties properties, CommentLinks _links) {
        this.id = id;
        this.status = status;
        this.title = title;
        this.blogPostId = blogPostId;
        this.version = version;
        this.body = body;
        this.resolutionStatus = resolutionStatus;
        this.properties = properties;
        this._links = _links;
    }

}
