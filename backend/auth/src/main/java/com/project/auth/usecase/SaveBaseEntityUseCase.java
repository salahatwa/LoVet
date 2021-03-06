package com.project.auth.usecase;

import com.project.auth.domain.BaseEntity;
import com.project.auth.domain.EntityId;
import com.project.auth.domain.usecase.SaveBaseEntity;
import com.project.auth.usecase.gateway.BaseEntityCommandGateway;
import org.springframework.stereotype.Service;

@Service
public class SaveBaseEntityUseCase implements SaveBaseEntity {

  private final BaseEntityCommandGateway gateway;

  public SaveBaseEntityUseCase(BaseEntityCommandGateway gateway) {
    this.gateway = gateway;
  }

  @Override
  public EntityId save(BaseEntity baseEntity) {
    return gateway.save(baseEntity);
  }
}
