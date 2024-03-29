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
 * CommentVersion
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
    "createdAt",
    "message",
    "number",
    "minorEdit",
    "authorId",
    "comment"
})
@JsonTypeName("CommentVersion")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CommentVersion {

    /**
     * Date and time when the version was created. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     */
    @JsonProperty("createdAt")
    protected OffsetDateTime createdAt;

    /**
     * Message associated with the current version.
     */
    @JsonProperty("message")
    protected String message;

    /**
     * The version number.
     */
    @JsonProperty("number")
    protected Integer number;

    /**
     * Describes if this version is a minor version. Email notifications and activity stream updates are not created for minor versions.
     */
    @JsonProperty("minorEdit")
    protected Boolean minorEdit;

    /**
     * The account ID of the user who created this version.
     */
    @JsonProperty("authorId")
    protected String authorId;

    @JsonProperty("comment")
    protected VersionedEntity comment;

    /**
     * Constructs a validated instance of {@link CommentVersion}.
     *
     * @param spec the specification to process
     */
    public CommentVersion(Consumer<CommentVersion> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CommentVersion}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CommentVersion(Consumer)} instead.
     * @param createdAt Date and time when the version was created. In format "YYYY-MM-DDTHH:mm:ss.sssZ".
     * @param message Message associated with the current version.
     * @param number The version number.
     * @param minorEdit Describes if this version is a minor version. Email notifications and activity stream updates are not created for minor versions.
     * @param authorId The account ID of the user who created this version.
     * @param comment comment
     */
    @ApiStatus.Internal
    public CommentVersion(OffsetDateTime createdAt, String message, Integer number, Boolean minorEdit, String authorId, VersionedEntity comment) {
        this.createdAt = createdAt;
        this.message = message;
        this.number = number;
        this.minorEdit = minorEdit;
        this.authorId = authorId;
        this.comment = comment;
    }

}
