package io.github.primelib.confluence4j.rest.v1.model;

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
 * ContentTemplateCreateSpace
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
    "key"
})
@JsonTypeName("ContentTemplateCreate_space")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentTemplateCreateSpace {

    @JsonProperty("key")
    protected String key;

    /**
     * Constructs a validated instance of {@link ContentTemplateCreateSpace}.
     *
     * @param spec the specification to process
     */
    public ContentTemplateCreateSpace(Consumer<ContentTemplateCreateSpace> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentTemplateCreateSpace}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentTemplateCreateSpace(Consumer)} instead.
     * @param key key
     */
    @ApiStatus.Internal
    public ContentTemplateCreateSpace(String key) {
        this.key = key;
    }

}
