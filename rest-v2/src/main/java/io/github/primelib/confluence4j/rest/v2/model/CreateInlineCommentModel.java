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
 * CreateInlineCommentModel
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
    "blogPostId",
    "pageId",
    "parentCommentId",
    "body",
    "inlineCommentProperties"
})
@JsonTypeName("CreateInlineCommentModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateInlineCommentModel {

    /**
     * ID of the containing blog post, if intending to create a top level footer comment. Do not provide if creating a reply.
     */
    @JsonProperty("blogPostId")
    protected String blogPostId;

    /**
     * ID of the containing page, if intending to create a top level footer comment. Do not provide if creating a reply.
     */
    @JsonProperty("pageId")
    protected String pageId;

    /**
     * ID of the parent comment, if intending to create a reply. Do not provide if creating a top level comment.
     */
    @JsonProperty("parentCommentId")
    protected String parentCommentId;

    @JsonProperty("body")
    protected CreateFooterCommentModelBody body;

    @JsonProperty("inlineCommentProperties")
    protected CreateInlineCommentModelInlineCommentProperties inlineCommentProperties;

    /**
     * Constructs a validated instance of {@link CreateInlineCommentModel}.
     *
     * @param spec the specification to process
     */
    public CreateInlineCommentModel(Consumer<CreateInlineCommentModel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateInlineCommentModel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateInlineCommentModel(Consumer)} instead.
     * @param blogPostId ID of the containing blog post, if intending to create a top level footer comment. Do not provide if creating a reply.
     * @param pageId ID of the containing page, if intending to create a top level footer comment. Do not provide if creating a reply.
     * @param parentCommentId ID of the parent comment, if intending to create a reply. Do not provide if creating a top level comment.
     * @param body body
     * @param inlineCommentProperties inlineCommentProperties
     */
    @ApiStatus.Internal
    public CreateInlineCommentModel(String blogPostId, String pageId, String parentCommentId, CreateFooterCommentModelBody body, CreateInlineCommentModelInlineCommentProperties inlineCommentProperties) {
        this.blogPostId = blogPostId;
        this.pageId = pageId;
        this.parentCommentId = parentCommentId;
        this.body = body;
        this.inlineCommentProperties = inlineCommentProperties;
    }

}
