/******************************************************************************
 ** This data and information is proprietary to, and a valuable trade secret
 ** of, Basis Technology Corp.  It is given in confidence by Basis Technology
 ** and may only be used as permitted under the license agreement under which
 ** it has been distributed, and in no other way.
 **
 ** Copyright (c) 2015 Basis Technology Corporation All rights reserved.
 **
 ** The technical data and information provided herein are provided with
 ** `limited rights', and the computer software provided herein is provided
 ** with `restricted rights' as those terms are defined in DAR and ASPR
 ** 7-104.9(a).
 ******************************************************************************/


package com.basistech.rosette.model;

import java.util.List;


/** 
 * Simple api response data model for entity extraction 
 */
public final class EntityResponse extends Response {

    private List<ExtractedEntity> entities;
    
    public EntityResponse() { super(); }

    /**
     * Constructor for {@code EntityResponse}
     * @param requestId request id
     * @param entities list of extracted entities
     */
    public EntityResponse(
            String requestId,
            List<ExtractedEntity> entities
    ) {
        super(requestId);
        this.entities = entities;
    }

    /**
     * get the list of extracted entities
     * @return the list of extracted entities
     */
    public List<ExtractedEntity> getEntities() {
        return entities;
    }
}
