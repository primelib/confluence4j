package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Content;
import io.github.primelib.confluence4j.rest.v1.model.ContentBody;
import io.github.primelib.confluence4j.rest.v1.model.ContentBodyCreate;
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
 * ConvertContentBodySpec
 * <p>
 * Specification for the ConvertContentBody operation.
 * <p>
 * Convert content body
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConvertContentBodyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The name of the target format for the content body.
     */
    @NotNull 
    private String to;

    /**
     * The content body to convert.
     */
    @NotNull 
    private ContentBodyCreate body;

    /**
     * The space key used for resolving embedded content (page includes, files, and links) in the content body. For example, if the source content contains the link {@code &amp;lt;ac:link&amp;gt;&amp;lt;ri:page ri:content-title="Example page" /&amp;gt;&amp;lt;ac:link&amp;gt;} and the {@code spaceKeyContext=TEST} parameter is provided, then the link will be converted to a link to the "Example page" page in the "TEST" space.
     */
    @Nullable 
    private String spaceKeyContext;

    /**
     * The content ID used to find the space for resolving embedded content (page includes, files, and links) in the content body. For example, if the source content contains the link {@code &amp;lt;ac:link&amp;gt;&amp;lt;ri:page ri:content-title="Example page" /&amp;gt;&amp;lt;ac:link&amp;gt;} and the {@code contentIdContext=123} parameter is provided, then the link will be converted to a link to the "Example page" page in the same space that has the content with ID=123. Note, {@code spaceKeyContext} will be ignored if this parameter is provided.
     */
    @Nullable 
    private String contentIdContext;

    /**
     * Mode used for rendering embedded content, like attachments.
     * - {@code current} renders the embedded content using the latest version. - {@code version-at-save} renders the embedded content using the version at the time of save.
     */
    @Nullable 
    private String embeddedContentRender;

    /**
     * A multi-value parameter indicating which properties of the content to expand and populate. Expands are dependent on the {@code to} conversion format and may be irrelevant for certain conversions (e.g. {@code macroRenderedOutput} is redundant when converting to {@code view} format).
     *  If rendering to {@code view} format, and the body content being converted includes arbitrary nested content (such as macros); then it is
     * necessary to include webresource expands in the request. Webresources for content body are the batched JS and CSS dependencies for any nested dynamic content (i.e. macros).
     * - {@code embeddedContent} returns metadata for nested content (e.g. page included using page include macro) - {@code mediaToken} returns JWT token for retrieving attachment data from Media API - {@code macroRenderedOutput} additionally converts body to view format - {@code webresource.superbatch.uris.js} returns all common JS dependencies as static URLs - {@code webresource.superbatch.uris.css} returns all common CSS dependencies as static URLs - {@code webresource.superbatch.uris.all} returns all common dependencies as static URLs - {@code webresource.superbatch.tags.all} returns all common JS dependencies as html {@code &amp;lt;script&amp;gt;} tags - {@code webresource.superbatch.tags.css} returns all common CSS dependencies as html {@code &amp;lt;style&amp;gt;} tags - {@code webresource.superbatch.tags.js} returns all common dependencies as html {@code &amp;lt;script&amp;gt;} and {@code &amp;lt;style&amp;gt;} tags - {@code webresource.uris.js} returns JS dependencies specific to conversion - {@code webresource.uris.css} returns CSS dependencies specific to conversion - {@code webresource.uris.all} returns all dependencies specific to conversion
     * 
     * 
     * - {@code webresource.tags.all} returns common JS dependencies as html {@code &amp;lt;script&amp;gt;} tags - {@code webresource.tags.css} returns common CSS dependencies as html {@code &amp;lt;style&amp;gt;} tags - {@code webresource.tags.js} returns common dependencies as html {@code &amp;lt;script&amp;gt;} and {@code &amp;lt;style&amp;gt;} tags
     */
    @Nullable 
    private List<String> expand;

    /**
     * Constructs a validated instance of {@link ConvertContentBodyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ConvertContentBodyOperationSpec(Consumer<ConvertContentBodyOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ConvertContentBodyOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param to                   The name of the target format for the content body.
     * @param body                 The content body to convert.
     * @param spaceKeyContext      The space key used for resolving embedded content (page includes, files, and links) in the content body. For example, if the source content contains the link {@code &amp;lt;ac:link&amp;gt;&amp;lt;ri:page ri:content-title="Example page" /&amp;gt;&amp;lt;ac:link&amp;gt;} and the {@code spaceKeyContext=TEST} parameter is provided, then the link will be converted to a link to the "Example page" page in the "TEST" space.
     * @param contentIdContext     The content ID used to find the space for resolving embedded content (page includes, files, and links) in the content body. For example, if the source content contains the link {@code &amp;lt;ac:link&amp;gt;&amp;lt;ri:page ri:content-title="Example page" /&amp;gt;&amp;lt;ac:link&amp;gt;} and the {@code contentIdContext=123} parameter is provided, then the link will be converted to a link to the "Example page" page in the same space that has the content with ID=123. Note, {@code spaceKeyContext} will be ignored if this parameter is provided.
     * @param embeddedContentRender Mode used for rendering embedded content, like attachments.  - {@code current} renders the embedded content using the latest version. - {@code version-at-save} renders the embedded content using the version at the time of save.
     * @param expand               A multi-value parameter indicating which properties of the content to expand and populate. Expands are dependent on the {@code to} conversion format and may be irrelevant for certain conversions (e.g. {@code macroRenderedOutput} is redundant when converting to {@code view} format).   If rendering to {@code view} format, and the body content being converted includes arbitrary nested content (such as macros); then it is  necessary to include webresource expands in the request. Webresources for content body are the batched JS and CSS dependencies for any nested dynamic content (i.e. macros).  - {@code embeddedContent} returns metadata for nested content (e.g. page included using page include macro) - {@code mediaToken} returns JWT token for retrieving attachment data from Media API - {@code macroRenderedOutput} additionally converts body to view format - {@code webresource.superbatch.uris.js} returns all common JS dependencies as static URLs - {@code webresource.superbatch.uris.css} returns all common CSS dependencies as static URLs - {@code webresource.superbatch.uris.all} returns all common dependencies as static URLs - {@code webresource.superbatch.tags.all} returns all common JS dependencies as html {@code &amp;lt;script&amp;gt;} tags - {@code webresource.superbatch.tags.css} returns all common CSS dependencies as html {@code &amp;lt;style&amp;gt;} tags - {@code webresource.superbatch.tags.js} returns all common dependencies as html {@code &amp;lt;script&amp;gt;} and {@code &amp;lt;style&amp;gt;} tags - {@code webresource.uris.js} returns JS dependencies specific to conversion - {@code webresource.uris.css} returns CSS dependencies specific to conversion - {@code webresource.uris.all} returns all dependencies specific to conversion      - {@code webresource.tags.all} returns common JS dependencies as html {@code &amp;lt;script&amp;gt;} tags - {@code webresource.tags.css} returns common CSS dependencies as html {@code &amp;lt;style&amp;gt;} tags - {@code webresource.tags.js} returns common dependencies as html {@code &amp;lt;script&amp;gt;} and {@code &amp;lt;style&amp;gt;} tags
     */
    @ApiStatus.Internal
    public ConvertContentBodyOperationSpec(String to, ContentBodyCreate body, String spaceKeyContext, String contentIdContext, String embeddedContentRender, List<String> expand) {
        this.to = to;
        this.body = body;
        this.spaceKeyContext = spaceKeyContext;
        this.contentIdContext = contentIdContext;
        this.embeddedContentRender = embeddedContentRender;
        this.expand = expand;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(to, "to is a required parameter!");
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}
