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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PermissionSubjectWithGroupId
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
    "type",
    "identifier"
})
@JsonTypeName("PermissionSubjectWithGroupId")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PermissionSubjectWithGroupId {

    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * for {@code type=user}, identifier should be user's accountId or {@code anonymous} for anonymous users
     * for {@code type=group}, identifier should be ID of the group
     */
    @JsonProperty("identifier")
    protected String identifier;

    /**
     * Constructs a validated instance of {@link PermissionSubjectWithGroupId}.
     *
     * @param spec the specification to process
     */
    public PermissionSubjectWithGroupId(Consumer<PermissionSubjectWithGroupId> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PermissionSubjectWithGroupId}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PermissionSubjectWithGroupId(Consumer)} instead.
     * @param type type
     * @param identifier for {@code type=user}, identifier should be user's accountId or {@code anonymous} for anonymous users  for {@code type=group}, identifier should be ID of the group
     */
    @ApiStatus.Internal
    public PermissionSubjectWithGroupId(TypeEnum type, String identifier) {
        this.type = type;
        this.identifier = identifier;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        USER("user"),
        GROUP("group");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
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
