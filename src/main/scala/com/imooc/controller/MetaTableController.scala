package com.imooc.controller

import com.imooc.domain.MetaTable
import com.imooc.service.MetaTableService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation._
import utils.ResultVOUtil

@RestController
@RequestMapping(Array("/meta/table"))
class MetaTableController @Autowired()(metaTableService:MetaTableService) {

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.POST))
  @ResponseBody
  def save(@ModelAttribute metaTable: MetaTable) ={
    metaTableService.save(metaTable)
    ResultVOUtil.success() //此处就是scala调用已有的java代码
  }

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.GET))
  @ResponseBody
  def query() = {
    ResultVOUtil.success(metaTableService.query())
  }
}
