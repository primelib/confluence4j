package io.github.primelib.confluence4j.rest.v1.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.confluence4j.rest.v1.model.Content;
import io.github.primelib.confluence4j.rest.v1.model.ContentChildren;
import io.github.primelib.confluence4j.rest.v1.model.Version;
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
 * GetContentChildrenByTypeSpec
 * <p>
 * Specification for the GetContentChildrenByType operation.
 * <p>
 * Get content children by type
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetContentChildrenByTypeOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the content to be queried for its children.
     */
    @NotNull 
    private String id;

    /**
     * The type of children to return.
     */
    @NotNull 
    private String type;

    /**
     * A multi-value parameter indicating which properties of the content to expand.
     * - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).
     * In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment.
     */
    @Nullable 
    private List<String> expand;

    /**
     * The version of the parent content to retrieve children for. Currently, this only works for the latest version.
     */
    @Nullable 
    private Integer parentVersion;

    /**
     * The starting index of the returned content.
     */
    @Nullable 
    private Integer start;

    /**
     * The maximum number of content to return per page. Note, this may be restricted by fixed system limits.
     */
    @Nullable 
    private Integer limit;

    /**
     * Constructs a validated instance of {@link GetContentChildrenByTypeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetContentChildrenByTypeOperationSpec(Consumer<GetContentChildrenByTypeOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetContentChildrenByTypeOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the content to be queried for its children.
     * @param type                 The type of children to return.
     * @param expand               A multi-value parameter indicating which properties of the content to expand.  - {@code childTypes.all} returns whether the content has attachments, comments, or child pages/whiteboards. Use this if you only need to check whether the content has children of a particular type. - {@code childTypes.attachment} returns whether the content has attachments. - {@code childTypes.comment} returns whether the content has comments. - {@code childTypes.page} returns whether the content has child pages. - {@code container} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get). - {@code metadata.currentuser} returns information about the current user in relation to the content, including when they last viewed it, modified it, contributed to it, or added it as a favorite. - {@code metadata.properties} returns content properties that have been set via the Confluence REST API. - {@code metadata.labels} returns the labels that have been added to the content. - {@code metadata.frontend} this property is only used by Atlassian. - {@code operations} returns the operations for the content, which are used when setting permissions. - {@code children.page} returns pages that are descendants at the level immediately below the content. - {@code children.attachment} returns all attachments for the content. - {@code children.comment} returns all comments on the content. - {@code restrictions.read.restrictions.user} returns the users that have permission to read the content. - {@code restrictions.read.restrictions.group} returns the groups that have permission to read the content. Note that this may return deleted groups, because deleting a group doesn't remove associated restrictions. - {@code restrictions.update.restrictions.user} returns the users that have permission to update the content. - {@code restrictions.update.restrictions.group} returns the groups that have permission to update the content. Note that this may return deleted groups because deleting a group doesn't remove associated restrictions. - {@code history} returns the history of the content, including the date it was created. - {@code history.lastUpdated} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code history.previousVersion} returns information about the update prior to the current content update. - {@code history.contributors} returns all of the users who have contributed to the content. - {@code history.nextVersion} returns information about the update after to the current content update. - {@code ancestors} returns the parent content, if the content is a page or whiteboard. - {@code body} returns the body of the content in different formats, including the editor format, view format, and export format. - {@code body.storage} returns the body of content in storage format. - {@code body.view} returns the body of content in view format. - {@code version} returns information about the most recent update of the content, including who updated it and when it was updated. - {@code descendants.page} returns pages that are descendants at any level below the content. - {@code descendants.attachment} returns all attachments for the content, same as {@code children.attachment}. - {@code descendants.comment} returns all comments on the content, same as {@code children.comment}. - {@code space} returns the space that the content is in. This is the same as the information returned by [Get space](#api-space-spaceKey-get).  In addition, the following comment-specific expansions can be used: - {@code extensions.inlineProperties} returns inline comment-specific properties. - {@code extensions.resolution} returns the resolution status of each comment.
     * @param parentVersion        The version of the parent content to retrieve children for. Currently, this only works for the latest version.
     * @param start                The starting index of the returned content.
     * @param limit                The maximum number of content to return per page. Note, this may be restricted by fixed system limits.
     */
    @ApiStatus.Internal
    public GetContentChildrenByTypeOperationSpec(String id, String type, List<String> expand, Integer parentVersion, Integer start, Integer limit) {
        this.id = id;
        this.type = type;
        this.expand = expand;
        this.parentVersion = parentVersion;
        this.start = start;
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
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(type, "type is a required parameter!");
    }
}
