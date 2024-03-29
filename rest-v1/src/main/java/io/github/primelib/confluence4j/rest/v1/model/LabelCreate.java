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
 * LabelCreate
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
    "prefix",
    "name"
})
@JsonTypeName("LabelCreate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LabelCreate {

    /**
     * The prefix for the label. {@code global}, {@code my} {@code team}, etc.
     */
    @JsonProperty("prefix")
    protected String prefix;

    /**
     * The name of the label, which will be shown in the UI.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link LabelCreate}.
     *
     * @param spec the specification to process
     */
    public LabelCreate(Consumer<LabelCreate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LabelCreate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LabelCreate(Consumer)} instead.
     * @param prefix The prefix for the label. {@code global}, {@code my} {@code team}, etc.
     * @param name The name of the label, which will be shown in the UI.
     */
    @ApiStatus.Internal
    public LabelCreate(String prefix, String name) {
        this.prefix = prefix;
        this.name = name;
    }

}
