package cn.binarywang.wx.miniapp.bean.urllink;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author leiin
 * @date 2021/3/23
 */
@Data
public class UrlLinkInfoResult implements Serializable {
  private static final long serialVersionUID = 5931710270283577576L;

  @SerializedName("appid")
  private String appid;

  @SerializedName("path")
  private String path;

  @SerializedName("query")
  private String query;

  @SerializedName("create_time")
  private Integer createTime;

  @SerializedName("expire_time")
  private Integer expireTime;

  @SerializedName("env_version")
  private String envVersion;
}

