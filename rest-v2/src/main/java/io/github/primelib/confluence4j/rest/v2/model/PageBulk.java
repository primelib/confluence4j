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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PageBulk
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
    "spaceId",
    "parentId",
    "parentType",
    "position",
    "authorId",
    "ownerId",
    "lastOwnerId",
    "createdAt",
    "version",
    "body",
    "_links"
})
@JsonTypeName("PageBulk")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PageBulk {

    /**
     * ID of the page.
     */
    @JsonProperty("id")
    protected String id;

    @JsonProperty("status")
    protected ContentStatus status;

    /**
     * Title of the page.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * ID of the space the page is in.
     */
    @JsonProperty("spaceId")
    protected String spaceId;

    /**
     * ID of the parent page, or null if there is no parent page.
     */
    @JsonProperty("parentId")
    protected String parentId;

    @JsonProperty("parentType")
    protected ParentContentType parentType;

    /**
     * Position of child page within the given parent page tree.
     */
    @JsonProperty("position")
    protected Integer position;

    /**
     * The account ID of the user who created this page originally.
     */
    @JsonProperty("authorId")
    protected String authorId;

    /**
     * The account ID of the user who owns this page.
     */
    @JsonProperty("ownerId")
    protected String ownerId;

    /**
     * The account ID of the user who owned this page previously, or null if there is no previous owner.
     */
    @JsonProperty("lastOwnerId")
    protected String lastOwnerId;

    /**
     * Date and time when the page was created. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     */
    @JsonProperty("createdAt")
    protected OffsetDateTime createdAt;

    @JsonProperty("version")
    protected Version version;

    @JsonProperty("body")
    protected BodyBulk body;

    @JsonProperty("_links")
    protected AbstractPageLinks _links;

    /**
     * Constructs a validated instance of {@link PageBulk}.
     *
     * @param spec the specification to process
     */
    public PageBulk(Consumer<PageBulk> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PageBulk}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PageBulk(Consumer)} instead.
     * @param id ID of the page.
     * @param status status
     * @param title Title of the page.
     * @param spaceId ID of the space the page is in.
     * @param parentId ID of the parent page, or null if there is no parent page.
     * @param parentType parentType
     * @param position Position of child page within the given parent page tree.
     * @param authorId The account ID of the user who created this page originally.
     * @param ownerId The account ID of the user who owns this page.
     * @param lastOwnerId The account ID of the user who owned this page previously, or null if there is no previous owner.
     * @param createdAt Date and time when the page was created. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     * @param version version
     * @param body body
     * @param _links _links
     */
    @ApiStatus.Internal
    public PageBulk(String id, ContentStatus status, String title, String spaceId, String parentId, ParentContentType parentType, Integer position, String authorId, String ownerId, String lastOwnerId, OffsetDateTime createdAt, Version version, BodyBulk body, AbstractPageLinks _links) {
        this.id = id;
        this.status = status;
        this.title = title;
        this.spaceId = spaceId;
        this.parentId = parentId;
        this.parentType = parentType;
        this.position = position;
        this.authorId = authorId;
        this.ownerId = ownerId;
        this.lastOwnerId = lastOwnerId;
        this.createdAt = createdAt;
        this.version = version;
        this.body = body;
        this._links = _links;
    }

}
