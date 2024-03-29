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
 * UserWatch
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
    "watching"
})
@JsonTypeName("UserWatch")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserWatch {

    @JsonProperty("watching")
    protected Boolean watching;

    /**
     * Constructs a validated instance of {@link UserWatch}.
     *
     * @param spec the specification to process
     */
    public UserWatch(Consumer<UserWatch> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UserWatch}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UserWatch(Consumer)} instead.
     * @param watching watching
     */
    @ApiStatus.Internal
    public UserWatch(Boolean watching) {
        this.watching = watching;
    }

}
