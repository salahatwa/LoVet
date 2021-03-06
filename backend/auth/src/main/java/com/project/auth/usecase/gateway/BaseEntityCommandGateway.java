package com.project.auth.usecase.gateway;

import com.project.auth.domain.BaseEntity;
import com.project.auth.domain.EntityId;

public interface BaseEntityCommandGateway {

  EntityId save(BaseEntity baseEntity);
}
