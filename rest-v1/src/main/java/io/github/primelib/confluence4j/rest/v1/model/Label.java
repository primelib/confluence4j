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
 * Label
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
    "name",
    "id",
    "label"
})
@JsonTypeName("Label")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Label {

    @JsonProperty("prefix")
    protected String prefix;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("label")
    protected String label;

    /**
     * Constructs a validated instance of {@link Label}.
     *
     * @param spec the specification to process
     */
    public Label(Consumer<Label> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Label}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Label(Consumer)} instead.
     * @param prefix prefix
     * @param name name
     * @param id id
     * @param label label
     */
    @ApiStatus.Internal
    public Label(String prefix, String name, String id, String label) {
        this.prefix = prefix;
        this.name = name;
        this.id = id;
        this.label = label;
    }

}
