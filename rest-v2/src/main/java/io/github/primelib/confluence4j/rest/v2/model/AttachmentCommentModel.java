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
 * AttachmentCommentModel
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
    "attachmentId",
    "version",
    "body",
    "_links"
})
@JsonTypeName("AttachmentCommentModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AttachmentCommentModel {

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
     * ID of the attachment containing the comment.
     */
    @JsonProperty("attachmentId")
    protected String attachmentId;

    @JsonProperty("version")
    protected Version version;

    @JsonProperty("body")
    protected BodySingle body;

    @JsonProperty("_links")
    protected CommentLinks _links;

    /**
     * Constructs a validated instance of {@link AttachmentCommentModel}.
     *
     * @param spec the specification to process
     */
    public AttachmentCommentModel(Consumer<AttachmentCommentModel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AttachmentCommentModel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AttachmentCommentModel(Consumer)} instead.
     * @param id ID of the comment.
     * @param status status
     * @param title Title of the comment.
     * @param attachmentId ID of the attachment containing the comment.
     * @param version version
     * @param body body
     * @param _links _links
     */
    @ApiStatus.Internal
    public AttachmentCommentModel(String id, ContentStatus status, String title, String attachmentId, Version version, BodySingle body, CommentLinks _links) {
        this.id = id;
        this.status = status;
        this.title = title;
        this.attachmentId = attachmentId;
        this.version = version;
        this.body = body;
        this._links = _links;
    }

}
