package me.chanjar.weixin.channel.api;


import me.chanjar.weixin.channel.bean.base.WxChannelBaseResponse;
import me.chanjar.weixin.channel.bean.limit.LimitTaskAddResponse;
import me.chanjar.weixin.channel.bean.limit.LimitTaskListResponse;
import me.chanjar.weixin.channel.bean.limit.LimitTaskParam;
import me.chanjar.weixin.channel.bean.product.SkuStockResponse;
import me.chanjar.weixin.channel.bean.product.SpuGetResponse;
import me.chanjar.weixin.channel.bean.product.SpuInfo;
import me.chanjar.weixin.channel.bean.product.SpuListResponse;
import me.chanjar.weixin.channel.bean.product.SpuUpdateResponse;
import me.chanjar.weixin.common.error.WxErrorException;

/**
 * 视频号小店 商品服务接口
 *
 * @author <a href="https://github.com/lixize">Zeyes</a>
 */
public interface WxChannelProductService {

  /**
   * 添加商品
   *
   * @param info 商品信息
   * @return 返回商品的状态和id
   *
   * @throws WxErrorException 异常
   */
  SpuUpdateResponse addProduct(SpuInfo info) throws WxErrorException;

  /**
   * 更新商品
   *
   * @param info 商品信息
   * @return 返回商品的状态和id
   *
   * @throws WxErrorException 异常
   */
  SpuUpdateResponse updateProduct(SpuInfo info) throws WxErrorException;

  /**
   * 更新商品库存 （仅对edit_status != 2 的商品适用，其他状态的商品无法通过该接口修改库存）
   *
   * @param productId 内部商品ID
   * @param skuId     内部sku_id
   * @param diffType  修改类型 1增加 2减少 3设置
   * @param num       增加、减少或者设置的库存值
   * @return WxChannelBaseResponse
   *
   * @throws WxErrorException 异常
   */
  WxChannelBaseResponse updateStock(String productId, String skuId, Integer diffType, Integer num)
    throws WxErrorException;

  /**
   * 删除商品
   *
   * @param productId 商品ID
   * @return 是否成功
   *
   * @throws WxErrorException 异常
   */
  WxChannelBaseResponse deleteProduct(String productId) throws WxErrorException;

  /**
   * 撤回商品审核
   *
   * @param productId 商品ID
   * @return 是否成功
   *
   * @throws WxErrorException 异常
   */
  WxChannelBaseResponse cancelProductAudit(String productId) throws WxErrorException;

  /**
   * 获取商品
   *
   * @param productId 商品ID
   * @param dataType  默认取1 1:获取线上数据 2:获取草稿数据 3:同时获取线上和草稿数据（注意：需成功上架后才有线上数据）
   * @return 商品信息
   *
   * @throws WxErrorException 异常
   */
  SpuGetResponse getProduct(String productId, Integer dataType) throws WxErrorException;

  /**
   * 获取商品列表
   *
   * @param pageSize 每页数量（默认10，不超过30）
   * @param nextKey  由上次请求返回，记录翻页的上下文。传入时会从上次返回的结果往后翻一页，不传默认拉取第一页数据。
   * @param status   商品状态，不填默认拉全部商品（不包含回收站） {@link me.chanjar.weixin.channel.enums.SpuStatus}
   * @return List
   *
   * @throws WxErrorException 异常
   */
  SpuListResponse listProduct(Integer pageSize, String nextKey, Integer status) throws WxErrorException;

  /**
   * 上架商品
   *
   * @param productId 商品ID
   * @return 是否成功
   *
   * @throws WxErrorException 异常
   */
  WxChannelBaseResponse upProduct(String productId) throws WxErrorException;

  /**
   * 下架商品
   *
   * @param productId 商品ID
   * @return 是否成功
   *
   * @throws WxErrorException 异常
   */
  WxChannelBaseResponse downProduct(String productId) throws WxErrorException;

  /**
   * 获取商品实时库存
   *
   * @param productId 商品ID
   * @param skuId     skuId
   * @return SkuStockResponse
   *
   * @throws WxErrorException 异常
   */
  SkuStockResponse getSkuStock(String productId, String skuId) throws WxErrorException;

  /**
   * 添加限时抢购任务
   *
   * @param param 限时抢购任务
   * @return LimitTaskAddResponse
   *
   * @throws WxErrorException 异常
   */
  LimitTaskAddResponse addLimitTask(LimitTaskParam param) throws WxErrorException;

  /**
   * 拉取限时抢购任务列表
   *
   * @param pageSize 每页数量(默认10，不超过50)
   * @param nextKey  由上次请求返回，记录翻页的上下文。传入时会从上次返回的结果往后翻一页，不传默认拉取第一页数据
   * @param status   抢购活动状态
   * @return LimitTaskListResponse
   *
   * @throws WxErrorException 异常
   */
  LimitTaskListResponse listLimitTask(Integer pageSize, String nextKey, Integer status) throws WxErrorException;

  /**
   * 停止限时抢购任务
   *
   * @param taskId 限时抢购任务ID
   * @return BaseResponse
   *
   * @throws WxErrorException 异常
   */
  WxChannelBaseResponse stopLimitTask(String taskId) throws WxErrorException;

  /**
   * 停止限时抢购任务
   *
   * @param taskId 限时抢购任务ID
   * @return BaseResponse
   *
   * @throws WxErrorException 异常
   */
  WxChannelBaseResponse deleteLimitTask(String taskId) throws WxErrorException;
}
