package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.redfroggy.ilg.client.Pagination;
import fr.redfroggy.ilg.client.Sorting;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Shareholders
 */
@JsonIgnoreProperties({"@type", "@context", "@link"})
public class Shareholders {

    private final String id;
    private final Pagination pagination;
    private final Sorting sorting;

    private final List<GroupMember> members;

    public Shareholders(@JsonProperty("@id") String id,
                        @JsonProperty("@pagination") Pagination pagination,
                        @JsonProperty("@sorting") Sorting sorting,
                        @JsonProperty("members") List<GroupMember> members) {
        this.id = id;
        this.pagination = pagination;
        this.sorting = sorting;
        this.members = members;
    }

    public String getId() {
        return id;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public Sorting getSorting() {
        return sorting;
    }

    /**
     * @return members
     */
    @ApiModelProperty(value = "")
    public List<GroupMember> getMembers() {
        return members;
    }
}

