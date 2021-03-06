/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.frontend.find.hod.indexes;

import com.hp.autonomy.frontend.find.HodFindApplication;
import com.hp.autonomy.frontend.find.core.indexes.AbstractIndexesServiceIT;
import com.hp.autonomy.hod.client.error.HodErrorException;
import com.hp.autonomy.hod.databases.Database;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes = HodFindApplication.class)
public class HodIndexesServiceIT extends AbstractIndexesServiceIT<Database, HodErrorException> {
}
