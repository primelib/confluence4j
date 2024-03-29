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
 * FooterCommentModel
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
    "pageId",
    "attachmentId",
    "customContentId",
    "parentCommentId",
    "version",
    "body",
    "_links"
})
@JsonTypeName("FooterCommentModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FooterCommentModel {

    /**
     * ID of the comment.
     */
    @JsonProperty("id")
    protected String id;

    @JsonProperty("status")
    protected ContentStatus status;

    /**
     * Title of the comment.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * ID of the blog post containing the comment if the comment is on a blog post.
     */
    @JsonProperty("blogPostId")
    protected String blogPostId;

    /**
     * ID of the page containing the comment if the comment is on a page.
     */
    @JsonProperty("pageId")
    protected String pageId;

    /**
     * ID of the attachment containing the comment if the comment is on an attachment.
     */
    @JsonProperty("attachmentId")
    protected String attachmentId;

    /**
     * ID of the custom content containing the comment if the comment is on a custom content.
     */
    @JsonProperty("customContentId")
    protected String customContentId;

    /**
     * ID of the parent comment if the comment is a reply.
     */
    @JsonProperty("parentCommentId")
    protected String parentCommentId;

    @JsonProperty("version")
    protected Version version;

    @JsonProperty("body")
    protected BodySingle body;

    @JsonProperty("_links")
    protected CommentLinks _links;

    /**
     * Constructs a validated instance of {@link FooterCommentModel}.
     *
     * @param spec the specification to process
     */
    public FooterCommentModel(Consumer<FooterCommentModel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FooterCommentModel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FooterCommentModel(Consumer)} instead.
     * @param id ID of the comment.
     * @param status status
     * @param title Title of the comment.
     * @param blogPostId ID of the blog post containing the comment if the comment is on a blog post.
     * @param pageId ID of the page containing the comment if the comment is on a page.
     * @param attachmentId ID of the attachment containing the comment if the comment is on an attachment.
     * @param customContentId ID of the custom content containing the comment if the comment is on a custom content.
     * @param parentCommentId ID of the parent comment if the comment is a reply.
     * @param version version
     * @param body body
     * @param _links _links
     */
    @ApiStatus.Internal
    public FooterCommentModel(String id, ContentStatus status, String title, String blogPostId, String pageId, String attachmentId, String customContentId, String parentCommentId, Version version, BodySingle body, CommentLinks _links) {
        this.id = id;
        this.status = status;
        this.title = title;
        this.blogPostId = blogPostId;
        this.pageId = pageId;
        this.attachmentId = attachmentId;
        this.customContentId = customContentId;
        this.parentCommentId = parentCommentId;
        this.version = version;
        this.body = body;
        this._links = _links;
    }

}
