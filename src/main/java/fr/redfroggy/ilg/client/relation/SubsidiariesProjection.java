package fr.redfroggy.ilg.client.relation;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import fr.redfroggy.ilg.client.Pagination;
import fr.redfroggy.ilg.client.Sorting;
import fr.redfroggy.ilg.client.model.Subsidiaries;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;

import java.util.List;

@JsonDeserialize(as = Subsidiaries.class)
public interface SubsidiariesProjection {
    String getId();

    Pagination getPagination();

    Sorting getSorting();

    /**
     * @return members
     */
    @ApiModelProperty(value = "")
    @Valid
    List<? extends GroupMemberProjection3> getMembers();
}
