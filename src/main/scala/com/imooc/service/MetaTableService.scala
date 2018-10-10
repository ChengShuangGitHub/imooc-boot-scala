package com.imooc.service

import com.imooc.domain.MetaTable
import com.imooc.repository.MetaTableRepository
import javax.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MetaTableService @Autowired()(metaTableRepository: MetaTableRepository) {

  @Transactional
  def save(MetaTable:MetaTable) = {
    metaTableRepository.save(MetaTable)
  }


  def query() = {
    metaTableRepository.findAll()
  }
}
