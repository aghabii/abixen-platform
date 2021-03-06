/**
 * Copyright (c) 2010-present Abixen Systems. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.abixen.platform.core.model;

import com.abixen.platform.core.model.enumtype.ResourceLocation;
import com.abixen.platform.core.model.enumtype.ResourceType;


public interface ResourceBase<ModuleType extends ModuleTypeBase> {

    Long getId();

    void setId(Long id);

    String getRelativeUrl();

    void setRelativeUrl(String relativeUrl);

    ResourceLocation getResourceLocation();

    void setResourceLocation(ResourceLocation resourceLocation);

    ResourceType getResourceType();

    void setResourceType(ResourceType resourceType);

    ModuleType getModuleType();

    void setModuleType(ModuleType module);
}
