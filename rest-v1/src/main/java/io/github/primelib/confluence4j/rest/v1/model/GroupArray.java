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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GroupArray
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
    "start",
    "limit",
    "size"
})
@JsonTypeName("GroupArray")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GroupArray {

    @JsonProperty("results")
    protected List<Group> results;

    @JsonProperty("start")
    protected Integer start;

    @JsonProperty("limit")
    protected Integer limit;

    @JsonProperty("size")
    protected Integer size;

    /**
     * Constructs a validated instance of {@link GroupArray}.
     *
     * @param spec the specification to process
     */
    public GroupArray(Consumer<GroupArray> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GroupArray}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GroupArray(Consumer)} instead.
     * @param results results
     * @param start start
     * @param limit limit
     * @param size size
     */
    @ApiStatus.Internal
    public GroupArray(List<Group> results, Integer start, Integer limit, Integer size) {
        this.results = results;
        this.start = start;
        this.limit = limit;
        this.size = size;
    }

}
