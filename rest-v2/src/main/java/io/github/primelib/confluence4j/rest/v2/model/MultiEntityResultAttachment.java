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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MultiEntityResultAttachment
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
    "results",
    "_links"
})
@JsonTypeName("MultiEntityResult_Attachment_")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MultiEntityResultAttachment {

    @JsonProperty("results")
    protected List<Attachment> results;

    @JsonProperty("_links")
    protected MultiEntityResultAttachmentLinks _links;

    /**
     * Constructs a validated instance of {@link MultiEntityResultAttachment}.
     *
     * @param spec the specification to process
     */
    public MultiEntityResultAttachment(Consumer<MultiEntityResultAttachment> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MultiEntityResultAttachment}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MultiEntityResultAttachment(Consumer)} instead.
     * @param results results
     * @param _links _links
     */
    @ApiStatus.Internal
    public MultiEntityResultAttachment(List<Attachment> results, MultiEntityResultAttachmentLinks _links) {
        this.results = results;
        this._links = _links;
    }

}
