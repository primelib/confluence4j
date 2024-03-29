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
 * SpaceUpdate
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
    "name",
    "description",
    "homepage",
    "type",
    "status"
})
@JsonTypeName("SpaceUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpaceUpdate {

    /**
     * The updated name of the space.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("description")
    protected SpaceDescriptionCreate description;

    /**
     * The updated homepage for this space
     */
    @JsonProperty("homepage")
    protected Object homepage;

    /**
     * The updated type for this space.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * The updated status for this space.
     */
    @JsonProperty("status")
    protected String status;

    /**
     * Constructs a validated instance of {@link SpaceUpdate}.
     *
     * @param spec the specification to process
     */
    public SpaceUpdate(Consumer<SpaceUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SpaceUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SpaceUpdate(Consumer)} instead.
     * @param name The updated name of the space.
     * @param description description
     * @param homepage The updated homepage for this space
     * @param type The updated type for this space.
     * @param status The updated status for this space.
     */
    @ApiStatus.Internal
    public SpaceUpdate(String name, SpaceDescriptionCreate description, Object homepage, String type, String status) {
        this.name = name;
        this.description = description;
        this.homepage = homepage;
        this.type = type;
        this.status = status;
    }

}
