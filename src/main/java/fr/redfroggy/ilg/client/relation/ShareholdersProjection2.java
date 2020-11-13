package fr.redfroggy.ilg.client.relation;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;

import java.util.List;

public interface ShareholdersProjection2 {
    /**
     * @return members
     */
    @ApiModelProperty(value = "")
    @Valid
    List<? extends GroupMemberProjection7> getMembers();
}
