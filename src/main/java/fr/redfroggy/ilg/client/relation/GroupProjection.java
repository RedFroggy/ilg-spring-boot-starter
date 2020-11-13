package fr.redfroggy.ilg.client.relation;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import fr.redfroggy.ilg.client.model.Group;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;

import java.util.List;

@JsonDeserialize(as = Group.class)
public interface GroupProjection {
    /**
     * Group members
     * @return members
    */
    @ApiModelProperty(value = "Group members")
    @Valid
    List<? extends GroupMemberProjection5> getMembers();
}
