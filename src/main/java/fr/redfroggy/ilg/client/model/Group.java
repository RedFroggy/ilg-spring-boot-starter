package fr.redfroggy.ilg.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Group
 */
@JsonIgnoreProperties({"@type", "@context", "@id", "@link"})
public class Group {

    private final List<GroupMember> members;

    public Group(@JsonProperty("members") List<GroupMember> members) {
        this.members = members;
    }

    /**
     * Group members
     *
     * @return members
     */
    @ApiModelProperty(value = "Group members")
    public List<GroupMember> getMembers() {
        return members;
    }

}

