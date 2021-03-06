/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.frontend.find.hod.parametricfields;

import com.hp.autonomy.frontend.find.HodFindApplication;
import com.hp.autonomy.frontend.find.core.parametricfields.AbstractParametricValuesServiceIT;
import com.hp.autonomy.hod.client.api.resource.ResourceIdentifier;
import com.hp.autonomy.hod.parametricvalues.HodParametricRequest;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes = HodFindApplication.class)
public class HodParametricValuesServiceIT extends AbstractParametricValuesServiceIT<HodParametricRequest, ResourceIdentifier> {
    protected HodParametricValuesServiceIT() {
        super(new String[]{ResourceIdentifier.NEWS_ENG.toString()}, new String[]{"TODO"});
    }
}
