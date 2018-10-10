package com.imooc.repository

import org.springframework.data.repository.CrudRepository
import com.imooc.domain.MetaTable

trait MetaTableRepository extends CrudRepository[MetaTable, Integer]{

}
