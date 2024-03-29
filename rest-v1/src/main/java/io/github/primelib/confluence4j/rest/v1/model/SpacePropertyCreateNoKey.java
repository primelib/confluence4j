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
 * SpacePropertyCreateNoKey
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
    "value"
})
@JsonTypeName("SpacePropertyCreateNoKey")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpacePropertyCreateNoKey {

    @JsonProperty("value")
    protected PropertyValue value;

    /**
     * Constructs a validated instance of {@link SpacePropertyCreateNoKey}.
     *
     * @param spec the specification to process
     */
    public SpacePropertyCreateNoKey(Consumer<SpacePropertyCreateNoKey> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpacePropertyCreateNoKey}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpacePropertyCreateNoKey(Consumer)} instead.
     * @param value value
     */
    @ApiStatus.Internal
    public SpacePropertyCreateNoKey(PropertyValue value) {
        this.value = value;
    }

}
