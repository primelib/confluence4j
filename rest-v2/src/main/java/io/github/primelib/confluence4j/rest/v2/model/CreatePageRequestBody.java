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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CreatePageRequestBody
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
    "representation",
    "value",
    "storage",
    "atlas_doc_format",
    "wiki"
})
@JsonTypeName("createPage_request_body")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreatePageRequestBody {

    /**
     * Type of content representation used for the value field.
     */
    @JsonProperty("representation")
    protected RepresentationEnum representation;

    /**
     * Body of the page, in the format found in the representation field.
     */
    @JsonProperty("value")
    protected String value;

    @JsonProperty("storage")
    protected PageBodyWrite storage;

    @JsonProperty("atlas_doc_format")
    protected PageBodyWrite atlasDocFormat;

    @JsonProperty("wiki")
    protected PageBodyWrite wiki;

    /**
     * Constructs a validated instance of {@link CreatePageRequestBody}.
     *
     * @param spec the specification to process
     */
    public CreatePageRequestBody(Consumer<CreatePageRequestBody> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreatePageRequestBody}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreatePageRequestBody(Consumer)} instead.
     * @param representation Type of content representation used for the value field.
     * @param value Body of the page, in the format found in the representation field.
     * @param storage storage
     * @param atlasDocFormat atlasDocFormat
     * @param wiki wiki
     */
    @ApiStatus.Internal
    public CreatePageRequestBody(RepresentationEnum representation, String value, PageBodyWrite storage, PageBodyWrite atlasDocFormat, PageBodyWrite wiki) {
        this.representation = representation;
        this.value = value;
        this.storage = storage;
        this.atlasDocFormat = atlasDocFormat;
        this.wiki = wiki;
    }

    /**
     * Type of content representation used for the value field.
     */
    @AllArgsConstructor
    public enum RepresentationEnum {
        STORAGE("storage"),
        ATLAS_DOC_FORMAT("atlas_doc_format"),
        WIKI("wiki");

        private static final RepresentationEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static RepresentationEnum of(String input) {
            if (input != null) {
                for (RepresentationEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
